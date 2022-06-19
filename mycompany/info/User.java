package mycompany.info;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class User {  
	ArrayList<User> us=new ArrayList<>();
	public String uName;
	public String uPassword;
	public String uId;
	public String uPhone;
	int money;

	public User() {
		
	}
	
	public User(String uName,String uPassword,String uId,String uPhone,int money)
	{
		this.uId=uId;
		this.uName=uName;
		this.uPassword=uPassword;
		this.uPhone=uPhone;
		this.money=money;
	}
	
    
	@Override
	public String toString() {
		return "User [us=" + us + ", Uname=" + uName + ", Upassword=" + uPassword + ", Uid=" + uId + ", Uphone="
				+ uPhone + ", money=" + money + "]";
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getUname() {
		return uName;
	}
	public void setUname(String uname) {
		uname = uname;
	}
	public String getUpassword() {
		return uPassword;
	}
	public void setUpassword(String upassword) {
		uPassword = upassword;
	}
	public String getUid() {
		return uId;
	}
	public void setUid(String uid) {
		uId = uid;
	}
	public String getUphone() {
		return uPhone;
	}
	public void setUphone(String uphone) {
		uPhone = uphone;
	}
	
	
	
	
	
	
public boolean Check(String userId) {
		
		boolean flag=true;
        
        try {
        	
    		BufferedReader bw1 = null;
            bw1 = new BufferedReader(new FileReader("D:\\program\\java图像化\\java-course-design-master\\user.txt"));
            String line = null;
            while((line=bw1.readLine()) != null){
                String[] datas = line.split("=");
                if(datas[2].equals(userId))
                {
                	flag=false;
                	break;
                }
                
            }
            
    	}catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
           ex.printStackTrace();    
        }
      //判断id是否已存在      
		return flag;
	}
	

}