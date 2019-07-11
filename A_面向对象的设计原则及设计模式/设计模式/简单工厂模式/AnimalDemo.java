package com.Day1_Pattern_A;

public class AnimalDemo {
	public static void main(String[] args) {
		// 简单的调用
		 Animal d=new Dog();
		 d.eat();
		 Animal c=new Cat();
		 c.eat();

		// 简单工厂模式调用
		Animal a = AnimalFactory.creatrAnimal("dog");
		a.eat();
		a = AnimalFactory.creatrAnimal("cat");
		a.eat();
	}

}
