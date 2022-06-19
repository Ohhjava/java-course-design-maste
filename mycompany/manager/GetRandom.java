package mycompany.manager;
import java.util.Random;

public class GetRandom
{
	public static final String allChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";   
	public static final String renumChar = "0123456789";
	public static String generateString() //令参数为返回随机数的长度 
	{ 
		StringBuffer str = new StringBuffer(); 
		Random random = new Random(); 
		for (int i = 0; i < 8; i++) 
		{ 
			str.append(allChar.charAt(random.nextInt(allChar.length()))); 
		} 
		return str.toString(); 
	} 
	public static String generatePhoneString() //参数为返回随机数的长度 
	{ 
		StringBuffer sb = new StringBuffer(); 
		Random random = new Random(); 
		sb.append('1');
		for (int i = 0; i < 10; i++) 
		{ 
			sb.append(allChar.charAt(random.nextInt(renumChar.length()))); 
		} 
		return sb.toString(); 
	}
	public static void main(String [] args) 
	{ 
		String ccxl=generatePhoneString();
		System.out.print(ccxl);
	}
} 