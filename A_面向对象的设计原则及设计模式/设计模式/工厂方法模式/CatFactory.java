package com.Day1_Pattern_B;

public class CatFactory implements Factory {

	@Override
	public Animal createAnimal() {
		
		return new Cat();
	}

}
