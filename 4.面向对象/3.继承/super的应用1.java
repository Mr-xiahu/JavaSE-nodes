package cn.xiahu.Study;

/*
 * 	����:super��Ӧ��
 *      
 */
public class Demo {
	public static void main(String[] args) {
		Father f = new Father("����", 50);
		f.eat("--------");// --------���ڳԷ�
		Son son = new Son();
		son.show();// �������ڳԷ�

	}

}

class Father {
	public String name = "����";
	public int age = 40;

	public Father() {
	}

	public Father(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public void eat(String name) {
		System.out.println(name + "���ڳԷ�");

	}

}

class Son extends Father {
	public void show() {
		System.out.println(super.name);// ����
		System.out.println(super.age);// 40
		super.eat("����");
	}

}
