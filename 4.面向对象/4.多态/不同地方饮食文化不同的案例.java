/*
 *	����:��ͬ�ط���ʳ�Ļ���ͬ�İ���
 *
 */
public class Demo {
	public static void main(String[] args) {
		// ����
		// �Ϸ���
		Person p = new SouthPerson();
		p.eat();// ���ˣ����׷�
		System.out.println("-------------");
		SouthPerson sp = (SouthPerson) p;
		sp.eat();// ���ˣ����׷�
		sp.jingShang();// ����
		System.out.println("-------------");

		// ������
		p = new NorthPerson();
		p.eat();// ����������������ͷ
		System.out.println("-------------");
		NorthPerson np = (NorthPerson) p;
		np.eat();// ����������������ͷ
		np.yanJiu();// �о�

	}
}

// ����Person��
class Person {
	public void eat() {
		System.out.println("�Է�");
	}
}

// ����SouthPerson��̳�Person
class SouthPerson extends Person {
	public void eat() {
		System.out.println("���ˣ����׷�");
	}

	public void jingShang() {
		System.out.println("����");
	}
}

// ����NorthPerson��̳�Person
class NorthPerson extends Person {
	public void eat() {
		System.out.println("����������������ͷ");
	}

	public void yanJiu() {
		System.out.println("�о�");
	}
}
