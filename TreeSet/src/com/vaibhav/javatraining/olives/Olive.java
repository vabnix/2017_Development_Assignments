package com.vaibhav.javatraining.olives;

public class Olive implements Comparable<Olive>{

	public static final long BLACK = 0x000000;
	public OliveNameEnum oliveName;
	public OliveColorEnum color;
	
	public Olive(OliveNameEnum oliveName, OliveColorEnum color) {
		this.oliveName = oliveName;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Olive [oliveName=" + oliveName + ", color=" + color + "]";
	}

	@Override
	public int compareTo(Olive o) {
		String s1 = this.getClass().getSimpleName();
		String s2 = o.getClass().getSimpleName();
		return s1.compareTo(s2);
	}
	
	
}
