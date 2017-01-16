package com.vaibhav.javatraining;

import java.util.TreeSet;

import com.vaibhav.javatraining.olives.Dallas;
import com.vaibhav.javatraining.olives.India;
import com.vaibhav.javatraining.olives.London;
import com.vaibhav.javatraining.olives.Olive;

public class Main {

	public static void main(String[] args) {
		
		Olive ind = new India();
		Olive lon = new London();
		Olive dal = new Dallas();
		
		TreeSet<Olive> tree = new TreeSet<>();
		try {
			tree.add(lon);
			tree.add(dal);
			tree.add(ind);
			System.out.println("Tree Set Size = " + tree.size());
			System.out.println(" Elements in the Tree " + tree);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
