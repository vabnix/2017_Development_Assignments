package com.vaibhav;

import java.lang.reflect.Constructor;

import com.vaibhav.javatraining.Olive;
import com.vaibhav.javatraining.OliveNameEnum;

public class Main {
	
	public static void main(String[] args) {
		Olive obj = new Olive(OliveNameEnum.INDIA);
		
		Class<?> classObj = obj.getClass();
		
		Constructor<?>[] constructor = classObj.getConstructors();
		
		System.out.println("Number of Constructor : " + constructor.length);
	    Constructor<?> construc = constructor[0];
	    
	    Object ob = null;
	    try {
	    	ob = construc.newInstance(OliveNameEnum.INDIA);
	    	System.out.println(ob);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	    
		
	}

}
