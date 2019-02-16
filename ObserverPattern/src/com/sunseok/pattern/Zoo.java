package com.sunseok.pattern;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private List<Animal> animals = new ArrayList<>();
	private List<AnimalAddedListener> listeners = new ArrayList<>();
	
	public void addAnimal(Animal animal) {
		
		// ������Ͽ� ���� �߰�
		this.animals.add(animal);
		
		// ��� �� �������� ����� �˸��ϴ�.
		this.notifyAnimalAddedListeners(animal);
	}
	
	public AnimalAddedListener registerAnimalAddedListener(AnimalAddedListener listener) {
		
		// ��� �� ������ ��Ͽ� ������ �߰�
		this.listeners.add(listener);
		
		return listener;
	}
	
	public void unregisterAnimalAddedListener(AnimalAddedListener listener) {
		// ��� �� ������ ��Ͽ��� �����ʸ� �����Ͻʽÿ�.
		this.listeners.remove(listener);
	}
	
	protected void notifyAnimalAddedListeners(Animal animal) {
		// ��� �� ������ ��Ͽ��ִ� �� �����ʿ� �˸��ϴ�.
		this.listeners.forEach(listener -> listener.onAnimalAdded(animal));
		
	}
}
