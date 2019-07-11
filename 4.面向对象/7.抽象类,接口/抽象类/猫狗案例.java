/*
 *	需求:抽象类之猫狗案例
 *  猫狗案例
 *		具体事物：猫，狗
 *		共性：姓名，年龄，吃饭
 *		
 *	抽象动物类：
 *			成员变量：姓名，年龄
 *			构造方法：无参，带参
 *			成员方法：吃饭();
 *	
 *	实现：从抽象到具体
 *		动物类:
 *			成员变量：姓名，年龄
 *			构造方法：无参，带参
 *			成员方法：吃饭();
 *			
 *		狗类：
 *			继承自动物类
 *
 *			重写吃饭();
 *			
 *		猫类：
 *			继承自动物类
 *			重写吃饭();
 *
 */
public class Demo {
	public static void main(String[] args) {
		// 正常调用
		// 方式一:getXxx(),setXxx()赋值
		// Dog d = new Dog();
		// d.setName("大黄");
		// d.setAge(4);
		// System.out.println(d.getName() + "---" + d.getAge());// 大黄---4

		// 方式二:构造方法赋值
		// Dog d = new Dog("小黑", 6);
		// System.out.println(d.getName() + "---" + d.getAge());//小黑---6

		// 多态调用
		// 方式一:getXxx(),setXxx()赋值
		// Animal a = new Dog();
		// a.setName("旺财");
		// a.setAge(3);
		// System.out.println(a.getName() + "---" + a.getAge());// 旺财---3
		// 方式二:构造方法赋值
		// Animal a = new Dog("二狗子", 1);
		// System.out.println(a.getName() + "---" + a.getAge());//二狗子---1

		// Cat的用法就不演示了

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
		System.out.println("狗吃肉");

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
		System.out.println("猫吃鱼");

	}

}
