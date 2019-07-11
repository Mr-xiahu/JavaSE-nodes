/*
 *	需求:不同地方饮食文化不同的案例
 *
 */
public class Demo {
	public static void main(String[] args) {
		// 测试
		// 南方人
		Person p = new SouthPerson();
		p.eat();// 炒菜，吃米饭
		System.out.println("-------------");
		SouthPerson sp = (SouthPerson) p;
		sp.eat();// 炒菜，吃米饭
		sp.jingShang();// 经商
		System.out.println("-------------");

		// 北方人
		p = new NorthPerson();
		p.eat();// 猪肉炖粉条，吃馒头
		System.out.println("-------------");
		NorthPerson np = (NorthPerson) p;
		np.eat();// 猪肉炖粉条，吃馒头
		np.yanJiu();// 研究

	}
}

// 创建Person类
class Person {
	public void eat() {
		System.out.println("吃饭");
	}
}

// 创建SouthPerson类继承Person
class SouthPerson extends Person {
	public void eat() {
		System.out.println("炒菜，吃米饭");
	}

	public void jingShang() {
		System.out.println("经商");
	}
}

// 创建NorthPerson类继承Person
class NorthPerson extends Person {
	public void eat() {
		System.out.println("猪肉炖粉条，吃馒头");
	}

	public void yanJiu() {
		System.out.println("研究");
	}
}
