package com.Day1_Pattern_A;

public class AnimalDemo {
	public static void main(String[] args) {
		// �򵥵ĵ���
		 Animal d=new Dog();
		 d.eat();
		 Animal c=new Cat();
		 c.eat();

		// �򵥹���ģʽ����
		Animal a = AnimalFactory.creatrAnimal("dog");
		a.eat();
		a = AnimalFactory.creatrAnimal("cat");
		a.eat();
	}

}
