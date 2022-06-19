package mycompany.gui;

import mycompany.info.Ticket;
import mycompany.info.User;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Login extends javax.swing.JFrame {


	private User u;
	private Ticket t;
	
    public Login() {
        initComponents();
        this.setTitle("登录界面");
        this.setResizable(false);
        setLocationRelativeTo(getOwner());
    }


    @SuppressWarnings("unchecked")
                            
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        pwdPasswordField = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        rigistButton = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("彩票登录"));

        jLabel1.setText("ID");

        jLabel4.setText("密码");


        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pwdPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(userTextField))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pwdPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        
        loginButton.setText("登录");
        
        loginButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        
        jPanel4.add(loginButton);

        rigistButton.setText("注册");
        rigistButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rigistButtonActionPerformed(evt);
            }
        });
        jPanel4.add(rigistButton);

        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
    //点击登录按钮的事件
        String userId = this.userTextField.getText().trim();
        String password = new String(pwdPasswordField.getPassword());
        //登录判断
        
        boolean flag = login(userId, password);
        t = new Ticket();
        
        if(flag)
        {
            JOptionPane.showMessageDialog(this, "登录成功");
            Select s = new Select(u,t);
            
            s.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "用户名或密码错误");
            this.userTextField.setText("");    //登录失败，然后清空用户名和密码
            this.pwdPasswordField.setText("");
            this.userTextField.requestFocus();     //获取光标
        }
    
    }                                           
                                         
    private void rigistButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    //点击注册按钮的事件
        Regist ri = new Regist();
        ri.setVisible(true);//打开注册界面的视图
        this.dispose();//关闭登录界面的试图
    }                                            
    
    public boolean login(String userId, String password) {
		 boolean flag=false;
	        
	        BufferedReader br = null;
	        try {
	            br = new BufferedReader(new FileReader("D:\\program\\java图像化\\java-course-design-master\\user.txt"));
	            String line = null;
	            while((line=br.readLine()) != null){
	                String[] datas = line.split("=");
	                u = new User(datas[0], datas[1], datas[2], datas[3], Integer.parseInt(datas[4]));
	                if(datas[2].equals(userId)&&datas[1].equals(password)){
	                    flag=true;
	                    break;
	                }
	            }
	        } catch (FileNotFoundException ex) {
	           ex.printStackTrace();
	        } catch (IOException ex) {
	           ex.printStackTrace();
	        }finally{
	            try {
	                br.close();
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
	        
	        return flag;
	    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
    }
                       
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField pwdPasswordField;
    private javax.swing.JButton rigistButton;
    private javax.swing.JTextField userTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;

}
