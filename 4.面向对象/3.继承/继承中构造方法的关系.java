public class Demo {
	public static void main(String[] args) {
		Son s = new Son();
		//����Ĵ��ι��췽��
		//Son���޲ι��췽��
		System.out.println("----------------");
		Son ss = new Son("����ϼ");
		//����Ĵ��ι��췽��
		//Son���޲ι��췽��
		//Son�Ĵ��ι��췽��s

	}

}

class Father {		
	public Father(String name) {
		System.out.println("����Ĵ��ι��췽��");
	}

}

class Son extends Father {
	public Son() {
		super("����");
		System.out.println("Son���޲ι��췽��");
	}

	public Son(String name) {
		this();
		System.out.println("Son�Ĵ��ι��췽��");
	}

}