package mycompany.gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import mycompany.info.*;

public class Regist extends javax.swing.JFrame {

    public Regist() {
        initComponents();
        this.setTitle("注册界面");
        this.setResizable(false);
        setLocationRelativeTo(getOwner());//注册界面以及方位的设置
    }


    @SuppressWarnings("unchecked")
                            
    private void initComponents() {

    	//定义
        jPanel1 = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        rigistpwdPasswordField = new javax.swing.JPasswordField();
        rigistnameTextField = new javax.swing.JTextField();
        passWordLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        moneyLabel = new javax.swing.JLabel();
        moneyField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rigistButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("用户注册"));

        userLabel.setText("用户名：");

        passWordLabel.setText("密码：");

        jLabel1.setText("ID：");

        phoneLabel.setText("手机号：");
        
        moneyLabel.setText("金额：");

        //自动生成面板界面
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabel)
                            .addComponent(passWordLabel)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rigistpwdPasswordField)
                            .addComponent(rigistnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(idTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneLabel)
                            .addComponent(moneyLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(moneyField))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(rigistnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rigistpwdPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passWordLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneyLabel)
                    .addComponent(moneyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        
        //添加注册退出按钮
        rigistButton.setText("注册");
        rigistButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rigistButtonActionPerformed(evt);
            }
        });
        
        jPanel2.add(rigistButton);

        jButton1.setText("退出");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        
    }// </editor-fold>                        

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {    //退出按钮操作，退出到登录界面                                     
        // TODO add your handling code here:
        changeLogin();
    }                                        

    
    
    
    
    private void rigistButtonActionPerformed(java.awt.event.ActionEvent evt){                                             
        // TODO add your handling code here:
        String username = this.rigistnameTextField.getText().trim();
        String password = new String(rigistpwdPasswordField.getPassword());
        String id = this.idTextField.getText().trim();
        String number = this.phoneTextField.getText().trim();
        String money0 = this.moneyField.getText().trim();
        Integer money = Integer.parseInt(money0);
        
        User user = new User();
        boolean flag = user.Check(id);
        if(flag)
        {
        	 //注册操作
        	BufferedWriter bw = null;
            try {
                //此处写为true 写入的内容将会在文件的末尾处，相当于追加信息
            	
                bw=new BufferedWriter(new FileWriter("D:\\program\\java图像化\\java-course-design-master\\user.txt",true));
                bw.write(username+"="+password+"="+id+"="+number+"="+money0);
                bw.newLine();   //换行
                bw.flush();     //刷新,将缓冲数据写到目的文件中去。
                
            } catch (IOException ex) {
               ex.printStackTrace();
            }finally{
                try {
                    bw.close();     //释放资源,关闭此流，再关闭前会先刷新他。
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            
           JOptionPane.showMessageDialog(this, "您已注册成功！");
            
           changeLogin();
           
        }
        else
        {
        	JOptionPane.showMessageDialog(this, "此ID已存在，请重新输入");
        	this.idTextField.setText(""); //清空id栏
        }
        
    }                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        	@Override
            public void run() {
                new Regist().setVisible(true);
            }
        });
        
    }

                       
    private javax.swing.JTextField idTextField;
    private javax.swing.JTextField moneyField;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JLabel passWordLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton rigistButton;
    private javax.swing.JTextField rigistnameTextField;
    private javax.swing.JPasswordField rigistpwdPasswordField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
                      
//点击按钮后进行页面切换,此方法为切换注册成功或者用户点击退出注册界面后切换为登录界面
    private void changeLogin(){
        Login lo = new Login();
        lo.setVisible(true);
        this.dispose();
    }

}
