package com.Day1_Pattern_B;

public class DogFactory implements Factory {

	@Override
	public Animal createAnimal() {
		
		return new Dog();
	}

}
