package com.dorisamchoon.singleton;

public class Singleton {

	private String message;
	
	private static final Singleton instance = new Singleton();
	
	private Singleton() {
		message = "Hello World!";
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println(message);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
