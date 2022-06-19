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
            //�˴�дΪtrue д������ݽ������ļ���ĩβ�����൱��׷����Ϣ
        	
            bw=new BufferedWriter(new FileWriter("D:\\program\\javaͼ��\\java-course-design-master\\user.txt",true));
            bw.write(name+"="+pwd+"="+id+"="+num+"="+money);
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
        Select in = new Select(user,ticket);
        String []balls = in.getrandom();
        String info = "["+balls[0]+","+balls[1]+","+balls[2]+","+balls[3]+","+balls[4]+","+balls[5]+","+balls[6]+"]"+"x"+"1";
        
        
        File file=new File("D:\\program\\javaͼ��\\java-course-design-master\\Record.txt");
        @SuppressWarnings("deprecation")
		String time = day.toLocaleString();
        BufferedWriter bw1 = null;
        try {
            //�˴�дΪtrue д������ݽ������ļ���ĩβ�����൱��׷����Ϣ
        	
            bw1=new BufferedWriter(new FileWriter("D:\\program\\javaͼ��\\java-course-design-master\\Record.txt",true));
            bw1.write(time+" "+user.getUid()+" "+info);
            bw1.newLine();   //����
            bw1.flush();     //ˢ��,����������д��Ŀ���ļ���ȥ��
            
        } catch (IOException ex) {
           ex.printStackTrace();
        }finally{
            try {
                bw1.close();     //�ͷ���Դ,�رմ������ٹر�ǰ����ˢ������
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
