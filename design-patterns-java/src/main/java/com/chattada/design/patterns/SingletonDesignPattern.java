package com.chattada.design.patterns;

import com.chattada.design.patterns.creational.SingletonClass;

public class SingletonDesignPattern {

	public static void main(String[] args) {
		 
		SingletonClass s1 = SingletonClass.getSingletonObject();
		
		SingletonClass s2 = SingletonClass.getSingletonObject();
		
		SingletonClass s3 = SingletonClass.getSingletonObject();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
