/*
 *	需求:猫狗案例
 *
 */
public class Demo {
	public static void main(String[] args) {
		// // 创建Dog对象
		// Dog d = new Dog();
		// d.eat();
		// d.lookDoor();
		// // 创建Cat对象
		// Cat c = new Cat();
		// c.eat();
		// c.findMouse();

		// 多态使用
		Animal a = new Dog();
		a.eat();// 狗吃肉
		// 还原为Dog
		Dog d = (Dog) a;
		d.eat();// 狗吃肉
		d.lookDoor();// 狗看门

		// 创建Cat对象
		Animal aa = new Cat();
		aa.eat();// 猫吃鱼
		Cat c = (Cat) aa;
		c.eat();// 猫吃鱼
		c.findMouse();// 猫抓老鼠

	}
}

class Animal {
	// 有一个吃饭的方法
	public void eat() {
		System.out.println("吃饭");
	}

}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("狗吃肉");

	}

	public void lookDoor() {
		System.out.println("狗看门");
	}

}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("猫吃鱼");

	}

	public void findMouse() {
		System.out.println("猫抓老鼠");
	}

}
