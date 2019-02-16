package com.sunseok.pattern;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private List<Animal> animals = new ArrayList<>();
	private List<AnimalAddedListener> listeners = new ArrayList<>();
	
	public void addAnimal(Animal animal) {
		
		// 동물목록에 동물 추가
		this.animals.add(animal);
		
		// 등록 된 리스너의 목록을 알립니다.
		this.notifyAnimalAddedListeners(animal);
	}
	
	public AnimalAddedListener registerAnimalAddedListener(AnimalAddedListener listener) {
		
		// 등록 된 리스너 목록에 리스너 추가
		this.listeners.add(listener);
		
		return listener;
	}
	
	public void unregisterAnimalAddedListener(AnimalAddedListener listener) {
		// 등록 된 리스너 목록에서 리스너를 제거하십시오.
		this.listeners.remove(listener);
	}
	
	protected void notifyAnimalAddedListeners(Animal animal) {
		// 등록 된 리스너 목록에있는 각 리스너에 알립니다.
		this.listeners.forEach(listener -> listener.onAnimalAdded(animal));
		
	}
}
