package com.dorisamchoon.singleton.impl;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {};
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception Error when creating Static Blocking Singleton!");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
