package com.vaibhav.javatraining;

import com.vaibhav.javatraining.olives.India;

public class Main {
	
	public static void main(String[] args) {
		
		Object obj = new India();
		
		Class<?> classIndia = obj.getClass();
		System.out.println("Class Name :" + classIndia);
		
		Class<?> supClass = classIndia.getSuperclass();
		System.out.println("Super Name : " + supClass);
		
		Class<?> topClass = supClass.getSuperclass();
		System.out.println("Top Name : " + topClass);
		
		Package packageName = classIndia.getPackage();
		System.out.println(packageName);
		
	}

}
