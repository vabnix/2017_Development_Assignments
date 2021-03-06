package com.vaibhav.javatraining;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.vaibhav.javatraining.olives.Dallas;
import com.vaibhav.javatraining.olives.India;
import com.vaibhav.javatraining.olives.London;
import com.vaibhav.javatraining.olives.Olive;

public class Main {

	public static void main(String[] args) {
		LinkedList<Olive> list = new LinkedList<>();
		list.add(new India());
		list.add(new London());
		
		list.addFirst(new Dallas());
		list.addLast(null);
		
		System.out.println(list);
		display(list);
	}
	
	private static void display(Collection<Olive> col ) {
		Iterator<Olive> it = col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
