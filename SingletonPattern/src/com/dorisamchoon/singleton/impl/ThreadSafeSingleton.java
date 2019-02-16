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
	
	// ���� ����� ���� DoubleLocking���� �����Ͻʽÿ�.
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
