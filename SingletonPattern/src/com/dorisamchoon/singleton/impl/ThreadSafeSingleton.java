package com.dorisamchoon.singleton.impl;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	
//	public static synchronized ThreadSafeSingleton getInstnace() {
//		if (instance == null) {
//			instance = new ThreadSafeSingleton();
//		}
//		return instance;
//	}
	
	// 성능 향상을 위해 DoubleLocking으로 구현하십시오.
	public static ThreadSafeSingleton getInstanceDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
	
}
