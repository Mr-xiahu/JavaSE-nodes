package cn.xiahu.Study;

import java.util.Scanner;

/*
 * 	需求：创建一个手机对象
 *     属性:品牌,颜色,价格
 *     方法:打电话,发短信,听音乐
 *      

 */
public class Demo {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.call("夏虎");
		p.listenMusic();
		p.sendMessage("张三", 8000, "黑色");

	}

}

class Phone {
	public String pinpai;
	public int price;
	public String color;

	public Phone() {

	}

	public Phone(String pinpai, int price, String color) {
		this.color = color;
		this.price = price;
		this.pinpai = pinpai;
	}

	public void call(String name) {
		System.out.println("给" + name + "打电话");
	}

	public void sendMessage(String name, int price, String color) {
		System.out.println(name + "拿着价值" + price + "的" + color + "的手机在发短信");
	}

	public void listenMusic() {
		System.out.println("听音乐");
	}
}
