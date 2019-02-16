package com.sunseok.pattern;

public class PrintNameAnimalAddedListener implements AnimalAddedListener {

	@Override
	public void onAnimalAdded(Animal animal) {
		// TODO Auto-generated method stub
		System.out.println("Added a new animal with name '" + animal.getName() + "'");
	}

}
