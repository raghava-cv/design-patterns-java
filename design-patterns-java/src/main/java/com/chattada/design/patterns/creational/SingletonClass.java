package com.chattada.design.patterns.creational;

public class SingletonClass {
	
	private static SingletonClass singleton = null;
	
	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonClass getSingletonObject() {
		
		if(singleton == null)
			singleton = new SingletonClass();
		
		return singleton;
	}

}
