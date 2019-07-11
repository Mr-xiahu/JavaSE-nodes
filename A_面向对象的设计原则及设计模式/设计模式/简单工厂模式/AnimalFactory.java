package com.Day1_Pattern_A;

public class AnimalFactory {

	public AnimalFactory(){}

	public static Animal creatrAnimal(String type) {
		if ("dog".equals(type)) {
			return new Dog();
		} else if ("cat".equals(type)) {
			return new Cat();
		} else {
			return null;
		}
	}

}
