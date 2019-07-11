package cn.xiahu.Study;

/*
 * 	需求:完成一个完整的Phone类
 *      A:成员变量
 *          pinpai
 *          price
 *          color
 *      B:构造方法
 *          无参构造
 *          带参构造
 *      C:成员方法
 *          打电话
 *          发短信
 *      
 */
public class Demo {
	public static void main(String[] args) {
		//构造函数赋值
		// Phone p = new Phone("三星",8000,"白色");
		// System.out.println(p.getPrice()+"---"+p.getColor()+"---"+p.getPinpai());
		
		//setXxx()赋值
		Phone p=new Phone();
		p.setColor("红色");
		p.setPinpai("iphone");
		p.setPrice(6000);
		System.out.println(p.getPrice()+"---"+p.getColor()+"---"+p.getPinpai());
		
		

	}

}

class Phone {
	private String pinpai;
	private int price;
	private String color;

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(String pinpai, int price, String color) {
		super();
		this.pinpai = pinpai;
		this.price = price;
		this.color = color;
	}

	public String getPinpai() {
		return pinpai;
	}

	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void call() {

	}

	public void sendMessage() {

	}

}
