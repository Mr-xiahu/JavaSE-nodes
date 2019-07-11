/*
 *	猫狗案例,加入跳高的额外功能
 *	
 *	分析：从具体到抽象
 *		动物：
 *			姓名,年龄
 *			吃饭();
 *			睡觉(){}
 *			
 *		猫：继承自动物
 *		狗：继承自动物
 *		
 *		跳高的额外功能是一个新的扩展功能，所以我们要定义一个接口
 *		接口：
 *			跳高
 *			
 *		部分猫：实现跳高
 *		部分狗：实现跳高
 *	实现；
 *		从抽象到具体
 *		
 *	使用：
 *		使用具体类
 */
public class Demo {
	public static void main(String[] args) {
		// 定义跳高猫并测试
		Cat jc = new Cat();
		jc.setName("哆啦A梦");
		jc.setAge(3);
		System.out.println(jc.getName() + "---" + jc.getAge());// 哆啦A梦---3
		jc.eat();// 猫吃鱼
		jc.sleep();// 猫不睡觉
		jc.jump();// 猫快速的跳
		System.out.println("-----------------");

		Cat jc2 = new Cat("加菲猫", 2);
		System.out.println(jc2.getName() + "---" + jc2.getAge());// 加菲猫---2
		jc2.eat();// 猫吃鱼
		jc2.sleep();// 猫不睡觉
		jc2.jump();// 猫快速的跳

		// 定义跳高狗并进行测试的事情自己完成。

	}
}

// 创建一个接口,实现jump方法
interface Jumpping {
	public abstract void jump();
}

// 创建动物类
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
		System.out.println("狗欢快的跳");

	}

	@Override
	public void eat() {
		System.out.println("狗吃肉");

	}

	@Override
	public void sleep() {
		System.out.println("狗趴着睡觉");

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
		System.out.println("猫快速的跳");

	}

	@Override
	public void eat() {
		System.out.println("猫吃鱼");

	}

	@Override
	public void sleep() {
		System.out.println("猫不睡觉");

	}

}
