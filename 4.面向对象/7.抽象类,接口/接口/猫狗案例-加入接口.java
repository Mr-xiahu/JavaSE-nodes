/*
 *	è������,�������ߵĶ��⹦��
 *	
 *	�������Ӿ��嵽����
 *		���
 *			����,����
 *			�Է�();
 *			˯��(){}
 *			
 *		è���̳��Զ���
 *		�����̳��Զ���
 *		
 *		���ߵĶ��⹦����һ���µ���չ���ܣ���������Ҫ����һ���ӿ�
 *		�ӿڣ�
 *			����
 *			
 *		����è��ʵ������
 *		���ֹ���ʵ������
 *	ʵ�֣�
 *		�ӳ��󵽾���
 *		
 *	ʹ�ã�
 *		ʹ�þ�����
 */
public class Demo {
	public static void main(String[] args) {
		// ��������è������
		Cat jc = new Cat();
		jc.setName("����A��");
		jc.setAge(3);
		System.out.println(jc.getName() + "---" + jc.getAge());// ����A��---3
		jc.eat();// è����
		jc.sleep();// è��˯��
		jc.jump();// è���ٵ���
		System.out.println("-----------------");

		Cat jc2 = new Cat("�ӷ�è", 2);
		System.out.println(jc2.getName() + "---" + jc2.getAge());// �ӷ�è---2
		jc2.eat();// è����
		jc2.sleep();// è��˯��
		jc2.jump();// è���ٵ���

		// �������߹������в��Ե������Լ���ɡ�

	}
}

// ����һ���ӿ�,ʵ��jump����
interface Jumpping {
	public abstract void jump();
}

// ����������
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

	public abstract void sleep();
}

class Dog extends Animal implements Jumpping {

	public Dog() {

	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void jump() {
		System.out.println("���������");

	}

	@Override
	public void eat() {
		System.out.println("������");

	}

	@Override
	public void sleep() {
		System.out.println("��ſ��˯��");

	}

}

class Cat extends Animal implements Jumpping {
	public Cat() {
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void jump() {
		System.out.println("è���ٵ���");

	}

	@Override
	public void eat() {
		System.out.println("è����");

	}

	@Override
	public void sleep() {
		System.out.println("è��˯��");

	}

}
