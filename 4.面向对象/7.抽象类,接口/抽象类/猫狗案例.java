/*
 *	����:������֮è������
 *  è������
 *		�������è����
 *		���ԣ����������䣬�Է�
 *		
 *	�������ࣺ
 *			��Ա����������������
 *			���췽�����޲Σ�����
 *			��Ա�������Է�();
 *	
 *	ʵ�֣��ӳ��󵽾���
 *		������:
 *			��Ա����������������
 *			���췽�����޲Σ�����
 *			��Ա�������Է�();
 *			
 *		���ࣺ
 *			�̳��Զ�����
 *
 *			��д�Է�();
 *			
 *		è�ࣺ
 *			�̳��Զ�����
 *			��д�Է�();
 *
 */
public class Demo {
	public static void main(String[] args) {
		// ��������
		// ��ʽһ:getXxx(),setXxx()��ֵ
		// Dog d = new Dog();
		// d.setName("���");
		// d.setAge(4);
		// System.out.println(d.getName() + "---" + d.getAge());// ���---4

		// ��ʽ��:���췽����ֵ
		// Dog d = new Dog("С��", 6);
		// System.out.println(d.getName() + "---" + d.getAge());//С��---6

		// ��̬����
		// ��ʽһ:getXxx(),setXxx()��ֵ
		// Animal a = new Dog();
		// a.setName("����");
		// a.setAge(3);
		// System.out.println(a.getName() + "---" + a.getAge());// ����---3
		// ��ʽ��:���췽����ֵ
		// Animal a = new Dog("������", 1);
		// System.out.println(a.getName() + "---" + a.getAge());//������---1

		// Cat���÷��Ͳ���ʾ��

	}
}

abstract class Animal {
	private String name;
	private int age;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void eat();

}

class Dog extends Animal {

	public Dog() {

	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("������");

	}

}

class Cat extends Animal {
	public Cat() {

	}

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("è����");

	}

}
