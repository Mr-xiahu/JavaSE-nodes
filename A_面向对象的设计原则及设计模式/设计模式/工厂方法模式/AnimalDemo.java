package com.Day1_Pattern_B;

public class AnimalDemo {
	public static void main(String[] args) {
		Factory f=new DogFactory();
		Animal a=f.createAnimal();
		a.eat();
		
		Factory f1=new CatFactory();
	    Animal a1=f1.createAnimal();
	    a1.eat();
	}

}
