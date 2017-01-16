package com.vaibhav.hashset;

import java.util.HashSet;

import com.vaibhav.javatraining.olives.Dallas;
import com.vaibhav.javatraining.olives.India;
import com.vaibhav.javatraining.olives.London;
import com.vaibhav.javatraining.olives.Olive;

public class Main {
	
	public static void main(String[] args) {
		
		Olive ind = new India();
		Olive dal = new Dallas();
		Olive lon = new London();
		
		HashSet<Olive> set = new HashSet<>();
		set.add(ind);
		set.add(dal);
		set.add(ind);
		System.out.println("Size of the HashMap is " + set.size());
		set.add(ind);
		System.out.println("Inspite of adding the same set, size is same = " + set.size());
		set.add(lon);
		System.out.println("Size of the HashMap is " + set.size());
		set.add(null);
		System.out.println("Set allow to add Null. Size =  " + set.size());
		set.remove(null);
		System.out.println("Like we can add null, we can also remove it. Size = " + set.size());
		
		System.out.println("Checking if the we can check the element exist");
		if(set.contains(ind))
			System.out.println("HashSet contain element India");
	}

}
