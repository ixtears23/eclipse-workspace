package com.dorisamchoon.singleton.impl;

public class LazySingleton {

	private static LazySingleton instance;
	
	public static LazySingleton getInstance() {
		if (null == instance) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
