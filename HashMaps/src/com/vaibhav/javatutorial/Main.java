package com.vaibhav.javatutorial;

import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		HashMap<String, Boolean> map = new HashMap<>();
		map.put("Vaibhav", true);
		map.put("Pallabi", true);
		map.put("Aum", true);
		map.put("Australia", false);
		map.put("Africa", false);
		
		System.out.println(map);
		
		if(map.containsKey("Vaibhav")) {
			System.out.println("Vaibhav - Requested Key present");
		}
		
		if(map.containsValue(Boolean.TRUE)) System.out.println("TRUE is Boolean Value");
		
		map.replace("Australia", false, true);
		System.out.println(map);
		
		map.
	}

}
