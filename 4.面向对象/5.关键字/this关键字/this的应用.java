package cn.xiahu.Study;

/*
 * 	����:���һ��������Phone��
 *      A:��Ա����
 *          pinpai
 *          price
 *          color
 *      B:���췽��
 *          �޲ι���
 *          ���ι���
 *      C:��Ա����
 *          ��绰
 *          ������
 *      
 */
public class Demo {
	public static void main(String[] args) {
		//���캯����ֵ
		// Phone p = new Phone("����",8000,"��ɫ");
		// System.out.println(p.getPrice()+"---"+p.getColor()+"---"+p.getPinpai());
		
		//setXxx()��ֵ
		Phone p=new Phone();
		p.setColor("��ɫ");
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
