package mycompany.manager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Manager extends javax.swing.JFrame {

    /**
     * Creates new form Manager
     */
	Date day = new Date();
	MyThread go;
	String grandPrize = null;
	ArrayList firstPrize = new ArrayList();
	ArrayList lotime = new ArrayList();
    public Manager() {
        this.setTitle("管理员界面");
        initComponents();
        setLocationRelativeTo(getOwner());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        managerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        openButton = new javax.swing.JButton();
        userInfoButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        loHistoryButton = new javax.swing.JButton();
        autoButton = new javax.swing.JButton();
        lotteryPanel = new javax.swing.JPanel();
        exit1Button = new javax.swing.JButton();
        lotteryTextField = new javax.swing.JTextField();
        beginButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        userInfoPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        exit2Button = new javax.swing.JButton();
        orderPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        exit3Button = new javax.swing.JButton();
        loHistoryPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        exit4Button = new javax.swing.JButton();
        autoPanel = new javax.swing.JPanel();
        autoTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comfimButton = new javax.swing.JButton();
        exit5Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        managerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("管理员界面"));

        jLabel1.setText("欢迎使用管理员系统");

        openButton.setText("开奖");
        openButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        userInfoButton.setText("用户信息");
        userInfoButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInfoButtonActionPerformed(evt);
            }
        });

        orderButton.setText("用户订单");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        loHistoryButton.setText("历史开奖");
        loHistoryButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loHistoryButtonActionPerformed(evt);
            }
        });

        autoButton.setText("自动生成");
        autoButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout managerPanelLayout = new javax.swing.GroupLayout(managerPanel);
        managerPanel.setLayout(managerPanelLayout);
        managerPanelLayout.setHorizontalGroup(
            managerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(managerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(managerPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(managerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(openButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(orderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(autoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        managerPanelLayout.setVerticalGroup(
            managerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(openButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userInfoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loHistoryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autoButton)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jPanel1.add(managerPanel, "card1");

        lotteryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("开奖"));

        exit1Button.setText("退出");
        exit1Button.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ButtonActionPerformed(evt);
            }
        });

        beginButton.setText("开始");
        beginButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginButtonActionPerformed(evt);
            }
        });
        stopButton.setText("停止");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "用户ID", "投注倍数", "奖项"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout lotteryPanelLayout = new javax.swing.GroupLayout(lotteryPanel);
        lotteryPanel.setLayout(lotteryPanelLayout);
        lotteryPanelLayout.setHorizontalGroup(
            lotteryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lotteryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lotteryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lotteryTextField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lotteryPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exit1Button))
                    .addGroup(lotteryPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(beginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        lotteryPanelLayout.setVerticalGroup(
            lotteryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lotteryPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lotteryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(lotteryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beginButton)
                    .addComponent(stopButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit1Button)
                .addGap(28, 28, 28))
        );

        jPanel1.add(lotteryPanel, "card2");

        userInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("用户信息"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "用户名", "用户密码", "用户ID", "用户手机", "余额"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        exit2Button.setText("退出");
        exit2Button.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userInfoPanelLayout = new javax.swing.GroupLayout(userInfoPanel);
        userInfoPanel.setLayout(userInfoPanelLayout);
        userInfoPanelLayout.setHorizontalGroup(
            userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userInfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit2Button)
                .addContainerGap())
        );
        userInfoPanelLayout.setVerticalGroup(
            userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit2Button)
                .addContainerGap())
        );

        jPanel1.add(userInfoPanel, "card3");

        orderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("用户订单"));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "日期", "号码", "投注", "ID"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        exit3Button.setText("退出");
        exit3Button.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit3ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit3Button)
                .addGap(33, 33, 33))
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit3Button)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel1.add(orderPanel, "card4");

        loHistoryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("历史开奖"));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "日期", "开奖号码", "特等奖（ID）", "一等奖（人数）"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        exit4Button.setText("退出");
        exit4Button.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit4ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loHistoryPanelLayout = new javax.swing.GroupLayout(loHistoryPanel);
        loHistoryPanel.setLayout(loHistoryPanelLayout);
        loHistoryPanelLayout.setHorizontalGroup(
            loHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loHistoryPanelLayout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(exit4Button)
                .addGap(26, 26, 26))
        );
        loHistoryPanelLayout.setVerticalGroup(
            loHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loHistoryPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit4Button)
                .addContainerGap())
        );

        jPanel1.add(loHistoryPanel, "card5");

        jLabel2.setText("请输入自动创建用户的个数");

        comfimButton.setText("确定");
        comfimButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comfimButtonActionPerformed(evt);
            }
        });

        exit5Button.setText("退出");
        exit5Button.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit5ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout autoPanelLayout = new javax.swing.GroupLayout(autoPanel);
        autoPanel.setLayout(autoPanelLayout);
        autoPanelLayout.setHorizontalGroup(
            autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(autoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(autoPanelLayout.createSequentialGroup()
                        .addComponent(comfimButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        autoPanelLayout.setVerticalGroup(
            autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoPanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(autoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comfimButton)
                    .addComponent(exit5Button))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jPanel1.add(autoPanel, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card2");
        lotteryTextField.setText("");
        //刷新
        int row = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int i;
        for(i = row - 1; i >= 0; i--)
        {
            model.removeRow(i);
        }
    }                                          

    private void userInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card3");
      //刷新用户信息
        int row = jTable2.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int i;
        for(i = row - 1; i >= 0; i--)
        {
            model.removeRow(i);
        }
        
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\program\\java图像化\\java-course-design-master\\user.txt"));
            String line = null;
            while((line=br.readLine()) != null)
            {
                String[] datas = line.split("=");
                //System.out.println(datas.length);
                DefaultTableModel model2 = (DefaultTableModel)jTable2.getModel();
                String name = datas[0];
                String pwd = datas[1];
                String id = datas[2];
                String num = datas[3];
                String money = datas[4];
                Object[] ob = {name,pwd,id,num,money};
                model2.addRow(ob);			
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

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card4");
      //刷新用户信息
        int row = jTable3.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        int i;
        for(i = row - 1; i >= 0; i--)
        {
            model.removeRow(i);
        }
        
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\program\\java图像化\\java-course-design-master\\Record.txt"));
            String line = null;
            while((line=br.readLine()) != null)
            {
                String[] strs = line.split(" ");
                DefaultTableModel model3 = (DefaultTableModel)jTable3.getModel();
                String time = strs[0]+" "+strs[1];
                String id = strs[2];
                String [] nums = strs[3].split("x"); 
                String num = nums[0];
                String mul = nums[1];
                Object[] ob = {time,num,mul,id};
                model3.addRow(ob);			
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

    private void loHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card5");
      //刷新购买纪录
        int row = jTable4.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        int i;
        for(i = row - 1; i >= 0; i--)
        {
            model.removeRow(i);
        }
        
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\program\\java图像化\\java-course-design-master\\LoHistory.txt"));
            String line = null;
            while((line=br.readLine()) != null){
                String[] datas = line.split(" ");
                String time = datas[0]+" "+datas[1];
                String num = datas[2];
                String gra = datas[3];
                String first = datas[4];
                DefaultTableModel model4 = (DefaultTableModel)jTable4.getModel();
                Object[] ob = {time, num, gra, first};
                model4.addRow(ob);	
                	
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
        
                                                     
    
    private void autoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card6");
    }                                          

    private void comfimButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    	int num = Integer.parseInt(autoTextField.getText());
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0;i<num;i++) {
					new AutoRegister();
				}
			}           			
		});
		t1.start();
		JOptionPane.showMessageDialog(null, "用户注册成功", null, JOptionPane.OK_OPTION);
    }                                            

    private void exit5ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card1");
    }                                           

    private void exit1ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card1");
    }                                           

    private void exit2ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card1");
    }                                           

    private void exit3ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card1");
    }                                           

    private void exit4ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "card1");
    }                                           
    
    @SuppressWarnings("unused")
	private void beginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    	//开奖前先置空
    	lotteryTextField.setText("");
    	go = new MyThread(lotteryTextField) ;
    	go.start();
    }   
    
    @SuppressWarnings("deprecation")
    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:


        go.stop();
    	String lotteryNum = "["+this.lotteryTextField.getText().trim()+"]";
    	File file=new File("D:\\program\\java图像化\\java-course-design-master\\History.txt");
        String time = day.toLocaleString();
        BufferedWriter bw = null;
        try {
            //此处写为true 写入的内容将会在文件的末尾处，相当于追加信息
        	
            bw=new BufferedWriter(new FileWriter("D:\\program\\java图像化\\java-course-design-master\\History.txt",true));
            bw.write(time+" "+lotteryNum);
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
        
        
        
        findPerson(lotteryTextField);

        
        BufferedWriter bw1 = null;
        try {
            //此处写为true 写入的内容将会在文件的末尾处，相当于追加信息
        	
            bw1=new BufferedWriter(new FileWriter("D:\\program\\java图像化\\java-course-design-master\\LoHistory.txt",true));
            bw1.write(time+" "+lotteryNum+" "+grandPrize+" "+firstPrize.size()+"人" );
            bw1.newLine();   //换行
            bw1.flush();     //刷新,将缓冲数据写到目的文件中去。
            
        } catch (IOException ex) {
           ex.printStackTrace();
        }finally{
            try {
                bw1.close();     //释放资源,关闭此流，再关闭前会先刷新他。
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
  
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        	@Override
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }
    
    
    public void findPerson(JTextField jt)
    {
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //定义formate进行时间对比
    	String num = jt.getText().trim();
    	int i = 0;
    	BufferedReader br = null;
    	Date historyDay = null;
    	Date lastHiDay = null;
    	
        try {
            br = new BufferedReader(new FileReader("D:\\program\\java图像化\\java-course-design-master\\History.txt"));
            String line = null;
            String s = null;
            while((line=br.readLine()) != null)
            {
            	lotime.add(line);
            	s = line;
            }
            //System.out.println(s);
            //System.out.println(Lotime.get(Lotime.size()-1));
            //System.out.println(Lotime.get(Lotime.size()-2));
            String s1 = (String) lotime.get(lotime.size()-2);
            if(s != null){
                String []str = s.split(" ");
                String date1 = str[0]+" "+str[1];
                String []lastr = s1.split(" ");
                String date3 = lastr[0]+" "+lastr[1];
                //System.out.println(date3);
                BufferedReader br1 = null;
                try {
                    br = new BufferedReader(new FileReader("D:\\program\\java图像化\\java-course-design-master\\Record.txt"));
                    String line1 = null;
                    while((line1=br.readLine()) != null){
                        String []str1 = line1.split(" ");
                        String date2 = str1[0]+" "+str1[1];
                        //System.out.println(date2);
                       try {
                        	historyDay = format.parse(date1);
                            Date recordDay = format.parse(date2);
                            lastHiDay = format.parse(date3);
                            //System.out.println(historyDay+" "+recordDay+" "+lastHiDay);
                            int compareTo = historyDay.compareTo(recordDay);
                            int compareTo1 = recordDay.compareTo(lastHiDay);
                            //System.out.println(date1+" "+date2+" "+compareTo);
                            //System.out.println(date2+" "+date3+" "+compareTo1);
                            if(compareTo > 0 && compareTo1 > 0)//用户购买的彩票时间需要在彩票开奖时间之前
                            {
                            	String []str2 = str1[3].split("x"); //划分读取的内容对比购买彩票的号码与开奖号码
                            	//System.out.println(str[2]+" "+str2[0]);
                            	
                            	if(str[2].equals(str2[0]))
                            	{
                            		grandPrize = str1[2];//记录获得特等奖的用户的ID
                            		//System.out.println(grandPrize);
                            		DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
        		                    Object[] ob = {grandPrize,str2[1],"特等奖"};
        		                    model1.addRow(ob);
                            	}
                            	else{

                            		String []first_1 = str[2].split(",");
                                	String []first_2 = str2[0].split(",");
                                	String first1 = first_1[0]+first_1[1]+first_1[2]+first_1[3]+first_1[4]+first_1[5];
                                	String first2 = first_2[0]+first_2[1]+first_2[2]+first_2[3]+first_2[4]+first_2[5];
                            		//System.out.println(str[2]+" "+str2[0]);
                                	if(first1.equals(first2)){
                                		firstPrize.add(str1[2]);
                                		//i++;
                                		//System.out.println(i);
                                		DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
            		                    Object[] ob = {grandPrize,str2[1],"特等奖"};
            		                    model1.addRow(ob);
                                	}
                            	}
                            }
                           }catch (ParseException e) {
                        	e.printStackTrace();
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
        }catch (FileNotFoundException ex) {
        	ex.printStackTrace();
    } catch (IOException ex) {
       ex.printStackTrace();
    }finally{
        try{
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
           }
    	}
        

        
        
        
    }
    public boolean Judge(String str)
    {
    	String [] datas = str.split(" ");
    	for(int i=0;i<firstPrize.size();i++)
    	{
    		if(firstPrize.get(i).equals(datas[2]))
    		{
    			return true;
    		}
    	}
    	return false;
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton autoButton;
    private javax.swing.JPanel autoPanel;
    private javax.swing.JTextField autoTextField;
    private javax.swing.JButton beginButton;
    private javax.swing.JButton comfimButton;
    private javax.swing.JButton exit1Button;
    private javax.swing.JButton exit2Button;
    private javax.swing.JButton exit3Button;
    private javax.swing.JButton exit4Button;
    private javax.swing.JButton exit5Button;
    private javax.swing.JButton loHistoryButton;
    private javax.swing.JPanel loHistoryPanel;
    private javax.swing.JPanel lotteryPanel;
    private javax.swing.JTextField lotteryTextField;
    private javax.swing.JPanel managerPanel;
    private javax.swing.JButton openButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JButton stopButton;
    private javax.swing.JButton userInfoButton;
    private javax.swing.JPanel userInfoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration                   
}
