package com.dorisamchoon.singleton;

public class Main {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();
		singleton.setMessage("New message");
		Singleton newSingletonPointer = Singleton.getInstance();
		newSingletonPointer.showMessage();
	}
}
