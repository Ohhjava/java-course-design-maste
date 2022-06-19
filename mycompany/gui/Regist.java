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
        this.setTitle("ע�����");
        this.setResizable(false);
        setLocationRelativeTo(getOwner());//ע������Լ���λ������
    }


    @SuppressWarnings("unchecked")
                            
    private void initComponents() {

    	//����
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
        
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("�û�ע��"));

        userLabel.setText("�û�����");

        passWordLabel.setText("���룺");

        jLabel1.setText("ID��");

        phoneLabel.setText("�ֻ��ţ�");
        
        moneyLabel.setText("��");

        //�Զ�����������
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
        
        //���ע���˳���ť
        rigistButton.setText("ע��");
        rigistButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rigistButtonActionPerformed(evt);
            }
        });
        
        jPanel2.add(rigistButton);

        jButton1.setText("�˳�");
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

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {    //�˳���ť�������˳�����¼����                                     
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
        	 //ע�����
        	BufferedWriter bw = null;
            try {
                //�˴�дΪtrue д������ݽ������ļ���ĩβ�����൱��׷����Ϣ
            	
                bw=new BufferedWriter(new FileWriter("D:\\program\\javaͼ��\\java-course-design-master\\user.txt",true));
                bw.write(username+"="+password+"="+id+"="+number+"="+money0);
                bw.newLine();   //����
                bw.flush();     //ˢ��,����������д��Ŀ���ļ���ȥ��
                
            } catch (IOException ex) {
               ex.printStackTrace();
            }finally{
                try {
                    bw.close();     //�ͷ���Դ,�رմ������ٹر�ǰ����ˢ������
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            
           JOptionPane.showMessageDialog(this, "����ע��ɹ���");
            
           changeLogin();
           
        }
        else
        {
        	JOptionPane.showMessageDialog(this, "��ID�Ѵ��ڣ�����������");
        	this.idTextField.setText(""); //���id��
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
                      
//�����ť�����ҳ���л�,�˷���Ϊ�л�ע��ɹ������û�����˳�ע�������л�Ϊ��¼����
    private void changeLogin(){
        Login lo = new Login();
        lo.setVisible(true);
        this.dispose();
    }

}
