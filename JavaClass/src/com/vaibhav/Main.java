package com.vaibhav;

import com.vaibhav.javatraining.Olive;
import com.vaibhav.javatraining.OliveNameEnum;

public class Main {

	public static void main(String[] args) {
		Olive obj = new Olive(OliveNameEnum.INDIA, 0x00000);
		
		Class<?> o = obj.getClass();
		
		System.out.println(o);
		System.out.println(o.getName());
		System.out.println(o.getSimpleName());
	}
}
