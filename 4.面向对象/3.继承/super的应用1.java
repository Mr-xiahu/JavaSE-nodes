package cn.xiahu.Study;

/*
 * 	需求:super的应用
 *      
 */
public class Demo {
	public static void main(String[] args) {
		Father f = new Father("成龙", 50);
		f.eat("--------");// --------正在吃饭
		Son son = new Son();
		son.show();// 张三正在吃饭

	}

}

class Father {
	public String name = "成龙";
	public int age = 40;

	public Father() {
	}

	public Father(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public void eat(String name) {
		System.out.println(name + "正在吃饭");

	}

}

class Son extends Father {
	public void show() {
		System.out.println(super.name);// 成龙
		System.out.println(super.age);// 40
		super.eat("张三");
	}

}
