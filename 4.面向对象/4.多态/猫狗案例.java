/*
 *	����:è������
 *
 */
public class Demo {
	public static void main(String[] args) {
		// // ����Dog����
		// Dog d = new Dog();
		// d.eat();
		// d.lookDoor();
		// // ����Cat����
		// Cat c = new Cat();
		// c.eat();
		// c.findMouse();

		// ��̬ʹ��
		Animal a = new Dog();
		a.eat();// ������
		// ��ԭΪDog
		Dog d = (Dog) a;
		d.eat();// ������
		d.lookDoor();// ������

		// ����Cat����
		Animal aa = new Cat();
		aa.eat();// è����
		Cat c = (Cat) aa;
		c.eat();// è����
		c.findMouse();// èץ����

	}
}

class Animal {
	// ��һ���Է��ķ���
	public void eat() {
		System.out.println("�Է�");
	}

}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("������");

	}

	public void lookDoor() {
		System.out.println("������");
	}

}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("è����");

	}

	public void findMouse() {
		System.out.println("èץ����");
	}

}
