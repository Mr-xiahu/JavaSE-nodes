package cn.xiahu.Study;

import java.util.Scanner;

/*
 * 	���󣺴���һ���ֻ�����
 *     ����:Ʒ��,��ɫ,�۸�
 *     ����:��绰,������,������
 *      

 */
public class Demo {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.call("�Ļ�");
		p.listenMusic();
		p.sendMessage("����", 8000, "��ɫ");

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
		System.out.println("��" + name + "��绰");
	}

	public void sendMessage(String name, int price, String color) {
		System.out.println(name + "���ż�ֵ" + price + "��" + color + "���ֻ��ڷ�����");
	}

	public void listenMusic() {
		System.out.println("������");
	}
}
