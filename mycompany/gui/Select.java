package mycompany.gui;

import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import mycompany.info.*;
import java.util.Date;



public class Select extends javax.swing.JFrame {


	private Ticket ticket;
    private User user;
    Date day=new Date();
    ArrayList cuTime = new ArrayList();
    public Select(User user, Ticket ticket) {
        super();
        this.user=user;
        this.ticket=ticket;
        initComponents();
        setLocationRelativeTo(getOwner());
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        selectPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        lotteryRecordButton = new javax.swing.JButton();
        buyRecordButton = new javax.swing.JButton();
        add = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        buyPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        getNumButton = new javax.swing.JButton();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        n3 = new javax.swing.JTextField();
        n4 = new javax.swing.JTextField();
        n5 = new javax.swing.JTextField();
        n6 = new javax.swing.JTextField();
        n7 = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        n8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        checkBuyButton = new javax.swing.JButton();
        exit1Button = new javax.swing.JButton();
        lotteryRecordPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        exit2Button = new javax.swing.JButton();
        buyRecordPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        exitButton3 = new javax.swing.JButton();
        addPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        addTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        exitButton4 = new javax.swing.JButton();
        cButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        selectPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("用户端"));
        selectPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("欢迎使用彩票系统");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 116, 0, 0);
        selectPanel.add(jLabel1, gridBagConstraints);

        buyButton.setText("购买彩票");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 139, 0, 0);
        selectPanel.add(buyButton, gridBagConstraints);

        lotteryRecordButton.setText("中奖记录");
        lotteryRecordButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotteryRecordButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 139, 0, 0);
        selectPanel.add(lotteryRecordButton, gridBagConstraints);

        buyRecordButton.setText("购买记录");
        buyRecordButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyRecordButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 139, 0, 0);
        selectPanel.add(buyRecordButton, gridBagConstraints);

        add.setText("充值");
        add.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 161, 0, 0);
        selectPanel.add(add, gridBagConstraints);

        exitButton.setText("退出");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(109, 49, 45, 45);
        selectPanel.add(exitButton, gridBagConstraints);

        jPanel1.add(selectPanel, "card1");

        buyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("购买彩票"));
        buyPanel.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("彩票购买");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 62, 0, 0);
        buyPanel.add(jLabel2, gridBagConstraints);

        getNumButton.setText("一键摇号");
        getNumButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNumButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 85, 0, 0);
        buyPanel.add(getNumButton, gridBagConstraints);

        n1.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 99;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 10, 0, 0);
        buyPanel.add(n1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 99;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 43, 0, 0);
        buyPanel.add(n2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.ipadx = 99;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 8, 0, 10);
        buyPanel.add(n3, gridBagConstraints);

        n4.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 99;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 10, 0, 0);
        buyPanel.add(n4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 99;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 43, 0, 0);
        buyPanel.add(n5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.ipadx = 99;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 8, 0, 10);
        buyPanel.add(n6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 99;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 10, 0, 0);
        buyPanel.add(n7, gridBagConstraints);

        deleteButton.setText("一键清空");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 41, 0, 0);
        buyPanel.add(deleteButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 85;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 29, 0, 0);
        buyPanel.add(n8, gridBagConstraints);

        jLabel6.setText("投注数：");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 3, 0, 0);
        buyPanel.add(jLabel6, gridBagConstraints);

        checkBuyButton.setText("购买");
        checkBuyButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBuyButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 3, 143, 0);
        buyPanel.add(checkBuyButton, gridBagConstraints);

        exit1Button.setText("返回");
        exit1Button.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 41, 143, 0);
        buyPanel.add(exit1Button, gridBagConstraints);

        jPanel1.add(buyPanel, "card2");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("往期记录"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "日期", "本次号码", "特等奖（ID）", "一等奖（人数）"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        exit2Button.setText("返回");
        exit2Button.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lotteryRecordPanelLayout = new javax.swing.GroupLayout(lotteryRecordPanel);
        lotteryRecordPanel.setLayout(lotteryRecordPanelLayout);
        lotteryRecordPanelLayout.setHorizontalGroup(
            lotteryRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lotteryRecordPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit2Button)
                .addGap(38, 38, 38))
        );
        lotteryRecordPanelLayout.setVerticalGroup(
            lotteryRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lotteryRecordPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exit2Button)
                .addGap(0, 58, Short.MAX_VALUE))
        );

        jPanel1.add(lotteryRecordPanel, "card3");

        buyRecordPanel.setLayout(new java.awt.GridBagLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("购买记录"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "日期", "号码", "投注"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 391;
        gridBagConstraints.ipady = 393;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        buyRecordPanel.add(jScrollPane2, gridBagConstraints);

        exitButton3.setText("返回");
        exitButton3.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 328, 26, 0);
        buyRecordPanel.add(exitButton3, gridBagConstraints);

        jPanel1.add(buyRecordPanel, "card4");

        addPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("充值金额"));

        jLabel7.setText("请输入您想要充值的金额：");

        addButton.setText("确认");
        addButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        exitButton4.setText("返回");
        exitButton4.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton4ActionPerformed(evt);
            }
        });

        cButton.setText("余额查询");
        cButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel7))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(addTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(addButton)
                        .addGap(29, 29, 29)
                        .addComponent(cButton)
                        .addGap(31, 31, 31)
                        .addComponent(exitButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel7)
                .addGap(64, 64, 64)
                .addComponent(addTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton)
                    .addComponent(cButton)
                    .addComponent(exitButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(addPanel, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card2");
    }                                         

    private void lotteryRecordButtonActionPerformed(java.awt.event.ActionEvent evt){
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //定义formate进行时间对比
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card3");
        int flag=0;
        int row = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String s = null;
        String num = null;
        int i;
        for(i = row - 1; i >= 0; i--)
        {
            model.removeRow(i);
        }
        
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\program\\java图像化\\java-course-design-master\\LoHistory.txt"));
            String line = null;
            while((line=br.readLine()) != null)
            {
                String[] datas = line.split(" ");
                DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
                String time = datas[0]+" "+datas[1];
                num = datas[2];
                String grand = datas[3];
                String first = datas[4];
                Object[] ob = {time,num,grand,first};
                model1.addRow(ob);	
                cuTime.add(line);
            	s = line;
            }   
                BufferedReader br1 = null;
                try {
                	
                    br1 = new BufferedReader(new FileReader("D:\\program\\java图像化\\java-course-design-master\\Record.txt"));
                    String line1 = null;
                    
                    while((line1=br1.readLine()) != null)
                    {
                    	String []ustrs = line1.split(" ");//用户
                    	String ls = (String)cuTime.get(cuTime.size()-2);
                        String []lstrs = ls.split(" ");
                        String []strs = s.split(" ");
                        
                        if(ustrs[2].equals(user.getUid()))
                    	{
                    		String []str1 = ustrs[3].split("x"); //划分读取的内容对比购买彩票的号码与开奖号码
                            String ldate = lstrs[0]+" "+lstrs[1];
                            String ndate = strs[0]+" "+strs[1];
                    		String udate = ustrs[0]+" "+ustrs[1];

                    		try {
        						Date date1 = format.parse(ldate);
        						Date date2 = format.parse(udate);
        						Date date3 = format.parse(ndate);
        						int compareTo = date3.compareTo(date2);
                                int compareTo1 = date2.compareTo(date1);
                                if(compareTo > 0 && compareTo1 > 0)
                                {
                                	if(str1[0].equals(num)){
                               		flag=2;
                                	}
                                	else{
                                   		String []first_1 = num.split(",");
                                       	String []first_2 = str1[0].split(",");
                                       	String first1 = first_1[0]+first_1[1]+first_1[2]+first_1[3]+first_1[4]+first_1[5];
                                       	String first2 = first_2[0]+first_2[1]+first_2[2]+first_2[3]+first_2[4]+first_2[5];
                                       	if(first1.equals(first2)){
                                       		flag=1;
                                       	}
                                    }
                               	}
                               	
        					} catch (ParseException e) {

        						e.printStackTrace();
        					}
                        	
                    	}
                        
                        
                    }
                    
                    
                   
                }catch (FileNotFoundException ex) {
                   ex.printStackTrace();
                } catch (IOException ex) {
                   ex.printStackTrace();
                }finally{
                    try {
                        br1.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
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
        if(flag>0)
        {
        	JOptionPane.showMessageDialog(this, "恭喜您已中奖！");
        }

        else
        {
        	JOptionPane.showMessageDialog(this, "很遗憾您未能中奖！");
        }
    } 
                                                       

    private void buyRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card4");
         //刷新购买纪录
        int row = jTable2.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int i;
        for(i = row - 1; i >= 0; i--)
        {
            model.removeRow(i);
        }
        
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\program\\java图像化\\java-course-design-master\\Record.txt"));
            String line = null;
            while((line=br.readLine()) != null){
                String[] datas = line.split(" ");
                if(datas[2].equals(user.getUid())){    
                    String time = datas[0]+" "+datas[1];
                	String []str = datas[3].split("x");
                	String num = str[0];
                	String mul = str[1];
                	DefaultTableModel model2 = (DefaultTableModel)jTable2.getModel();
                    Object[] ob = {time, num, mul, "未知"};
                    model2.addRow(ob);	
                	
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
    }                                               

    private void addActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card5");
    }                                   

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        Login lo = new Login();
        lo.setVisible(true);
        this.dispose();
    }                                          

    private void exit1ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card1");

    }                                           

    private void checkBuyButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        String balls[] = {n1.getText(),n2.getText(),n3.getText(),n4.getText(),n5.getText(),n6.getText(),n7.getText()};
        if(n1.getText().equals("")||n2.getText().equals("")||n3.getText().equals("")||n4.getText().equals("")||n5.getText().equals("")||n6.getText().equals("")||n7.getText().equals("")||n8.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "请重新输入", "内容不能为空", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            //System.out.println(ticket.getPrice());
            String num1 = this.n1.getText().trim();
            String num2 = this.n2.getText().trim();
            String num3 = this.n3.getText().trim();
            String num4 = this.n4.getText().trim();
            String num5 = this.n5.getText().trim();
            String num6 = this.n6.getText().trim();
            String num7 = this.n7.getText().trim();
            String mul = this.n8.getText().trim();
            String info = "["+num1+","+num2+","+num3+","+num4+","+num5+","+num6+","+num7+"]"+"x"+mul;
            int sum = ticket.getPrice()*Integer.parseInt(mul);
            int newmoney = user.getMoney()-sum;
            if(sum>user.getMoney())
            {
            	JOptionPane.showMessageDialog(this, "您的余额不足，请充值后再进行购买");
            }
            else
            {
            	
            	File file=new File("D:\\program\\java图像化\\java-course-design-master\\Record.txt");
                String time = day.toLocaleString();
                BufferedWriter bw = null;
                try {
                    //此处写为true 写入的内容将会在文件的末尾处，相当于追加信息
                	
                    bw=new BufferedWriter(new FileWriter("D:\\program\\java图像化\\java-course-design-master\\Record.txt",true));
                    bw.write(time+" "+user.getUid()+" "+info);
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
                String oldStr1 = user.getUname()+"="+user.getUpassword()+"="+user.uId+"="+user.getUphone()+"="+String.valueOf(user.getMoney());
            	String newStr1 = user.getUname()+"="+user.getUpassword()+"="+user.uId+"="+user.getUphone()+"="+String.valueOf(newmoney);
            	user = new User(user.getUname(),user.getUpassword(),user.getUid(),user.uPhone,newmoney);
            	autoReplace("D:\\program\\java图像化\\java-course-design-master\\user.txt", oldStr1, newStr1);
                JOptionPane.showMessageDialog(this, "购买成功");
                
                
            }
            
    	}
    }                                              

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        n1.setText("");
        n2.setText("");
        n3.setText("");
        n4.setText("");
        n5.setText("");
        n6.setText("");
        n7.setText("");
    }                                            

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void getNumButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        String balls[] = getrandom();
        n1.setText(balls[0]);
        n2.setText(balls[1]);
        n3.setText(balls[2]);
        n4.setText(balls[3]);
        n5.setText(balls[4]);
        n6.setText(balls[5]);
        n7.setText(balls[6]);

    }                                            

    private void exit2ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card1");
    }                                           

    private void exitButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card1");
    }                                           

    private void exitButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card1");
    }                                           

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String money0 = this.addTextField.getText().trim();
    	Integer money = Integer.parseInt(money0);
    	money = money+user.getMoney();
    	//String newStr =  String.valueOf(money);
    	//String oldStr = String.valueOf(user.getMoney());
    	String oldStr1 = user.getUname()+"="+user.getUpassword()+"="+user.uId+"="+user.getUphone()+"="+String.valueOf(user.getMoney());
    	String newStr1 = user.getUname()+"="+user.getUpassword()+"="+user.uId+"="+user.getUphone()+"="+String.valueOf(money);
    	user = new User(user.getUname(),user.getUpassword(),user.getUid(),user.uPhone,money);
    	/*System.out.println(oldStr);
    	System.out.println(oldStr1);
    	System.out.println(newStr);
    	System.out.println(user.getMoney());*/
    	autoReplace("D:\\program\\java图像化\\java-course-design-master\\user.txt", oldStr1, newStr1);
    	JOptionPane.showMessageDialog(this, "充值成功，当前余额："+user.getMoney()+"元");
    }                                         

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    	JOptionPane.showMessageDialog(this, "查询成功，您的余额为："+user.getMoney()+"元");
    }                                       


    public String[] getrandom() {
		String []pool = {
				"1","2","3","4","5","6","7","8",
				"9","10","11","12","13","14","15","16",
				"17","18","19","20","21","22","23","24",
				"25","26","27","28","29","30","31","32",
				"33","34","35","36"
				};
				
				String[] balls = new String[7];
				int length = 0 ;
				
				
				boolean[] used = new boolean[pool.length];
				Random r = new Random();
				while(true){
					int index = r.nextInt(pool.length);
					
					if(used[index])
						continue ; 
					balls[length++] = pool[index];
					used[index] = true ;
					if(length == balls.length)
						break ;
				}
				int balls1[] = new int[balls.length];
				int i = 0;
				for(String s:balls) {
					balls1[i++] = Integer.parseInt(s);
				}
				i=0;
				Arrays.sort(balls1);
				for(int s:balls1) {
					balls[i++] = String.valueOf(s);
				}
				return balls;
		}
     private static void autoReplace(String filePath, String oldstr, String newStr) {
        //创建文件
        File file = new File(filePath);
        //记录文件长度
        Long fileLength = file.length();
        //记录读出来的文件的内容
        byte[] fileContext = new byte[fileLength.intValue()];
        
        FileInputStream in = null;
        PrintWriter out = null;
        try {
            in = new FileInputStream(filePath);
            //将文件全部内容读出(使内容和文件中的格式一致,包括换行)
            in.read(fileContext);
            // 避免出现中文乱码
            String str = new String(fileContext, "gbk");
            //修改对应字符串内容
            str = str.replace(oldstr, newStr);
            //再把新的内容写入文件
            out = new PrintWriter(filePath);
            out.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.flush();
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addPanel;
    private javax.swing.JTextField addTextField;
    private javax.swing.JButton buyButton;
    private javax.swing.JPanel buyPanel;
    private javax.swing.JButton buyRecordButton;
    private javax.swing.JPanel buyRecordPanel;
    private javax.swing.JButton cButton;
    private javax.swing.JButton checkBuyButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exit1Button;
    private javax.swing.JButton exit2Button;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButton3;
    private javax.swing.JButton exitButton4;
    private javax.swing.JButton getNumButton;
    private javax.swing.JButton lotteryRecordButton;
    private javax.swing.JPanel lotteryRecordPanel;
    private javax.swing.JPanel selectPanel;
    private javax.swing.JButton add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField n5;
    private javax.swing.JTextField n6;
    private javax.swing.JTextField n7;
    private javax.swing.JTextField n8;
    // End of variables declaration                   
}