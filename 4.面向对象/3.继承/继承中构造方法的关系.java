public class Demo {
	public static void main(String[] args) {
		Son s = new Son();
		//父类的带参构造方法
		//Son的无参构造方法
		System.out.println("----------------");
		Son ss = new Son("林青霞");
		//父类的带参构造方法
		//Son的无参构造方法
		//Son的带参构造方法s

	}

}

class Father {		
	public Father(String name) {
		System.out.println("父类的带参构造方法");
	}

}

class Son extends Father {
	public Son() {
		super("随便给");
		System.out.println("Son的无参构造方法");
	}

	public Son(String name) {
		this();
		System.out.println("Son的带参构造方法");
	}

}