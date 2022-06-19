package mycompany.manager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import mycompany.gui.*;
import mycompany.info.*;

public class AutoRegister {
	private User user;
	private Ticket ticket;
	Date day=  new Date();
	
	
	public AutoRegister() {
		super();
		// TODO Auto-generated constructor stub
		beginRegister();
	}
	
	
	
	
	public void beginRegister() {
		
		String name = GetRandom.generateString();
		String pwd = GetRandom.generateString();
		String id = GetRandom.generateString();
		String num = GetRandom.generatePhoneString();
		int money = 20;
		user = new User(name,pwd,id,num,money);
		BufferedWriter bw = null;
        try {
            //此处写为true 写入的内容将会在文件的末尾处，相当于追加信息
        	
            bw=new BufferedWriter(new FileWriter("D:\\program\\java图像化\\java-course-design-master\\user.txt",true));
            bw.write(name+"="+pwd+"="+id+"="+num+"="+money);
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
        Select in = new Select(user,ticket);
        String []balls = in.getrandom();
        String info = "["+balls[0]+","+balls[1]+","+balls[2]+","+balls[3]+","+balls[4]+","+balls[5]+","+balls[6]+"]"+"x"+"1";
        
        
        File file=new File("D:\\program\\java图像化\\java-course-design-master\\Record.txt");
        @SuppressWarnings("deprecation")
		String time = day.toLocaleString();
        BufferedWriter bw1 = null;
        try {
            //此处写为true 写入的内容将会在文件的末尾处，相当于追加信息
        	
            bw1=new BufferedWriter(new FileWriter("D:\\program\\java图像化\\java-course-design-master\\Record.txt",true));
            bw1.write(time+" "+user.getUid()+" "+info);
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		int num = in.nextInt();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0;i<num;i++) {
					new AutoRegister();
				}
			}
			
		});
	}
}
