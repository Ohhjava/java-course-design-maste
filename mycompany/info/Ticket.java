package mycompany.info;

public class Ticket {
	// ��Ʊ����
	private String number;
	// ����
	private int price = 20;
	// Ͷע��
	private int amount;
	//����ʱ��
	private String date;
	//�û�id
	private String id;
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Ticket() {
		
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
