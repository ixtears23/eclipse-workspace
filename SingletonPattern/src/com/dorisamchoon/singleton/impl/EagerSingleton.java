package com.dorisamchoon.singleton.impl;

public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}
