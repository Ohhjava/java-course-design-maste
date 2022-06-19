package mycompany.manager;

import java.util.Arrays;
import javax.swing.JTextField;


public class MyThread extends Thread{
	JTextField lotteryTextField;
	public MyThread(JTextField lotteryTextField) {
		super();
		this.lotteryTextField = lotteryTextField;
	}
	@Override
	public void run() 
	{		 
		while(true)
		{	
			int[] ball = new int[7];
			for(int i = 0;i<7;i++) 
			{
				ball[i] = (int) (1+(Math.random()*36));
				for(int j=0;j<i;j++) 
				{
					if(ball[i]==ball[j]) i--;
				}
			}
			Arrays.sort(ball);			
			lotteryTextField.setText(ball[0]+","+ball[1]+","+ball[2]+","+ball[3]+","+ball[4]+","+ball[5]+","+ball[6]);

		}		
	}
}