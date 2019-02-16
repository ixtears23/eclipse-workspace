package com.sunseok.pattern;

public class Main {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		AnimalAddedListener listener = zoo.registerAnimalAddedListener(
			(animal) -> System.out.println("Added a new animal with name '" + animal.getName() + "'")
		);
		
		zoo.addAnimal(new Animal("Tiger"));
		
		zoo.unregisterAnimalAddedListener(listener);
		
		zoo.addAnimal(new Animal("Lion"));
	}
}
