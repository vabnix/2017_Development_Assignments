package com.vaibhav.javatraining;

public class Olive {

	public static final long BLACK = 0x000000;
	public OliveNameEnum oliveName;
	public long color = BLACK;
	
	public Olive(OliveNameEnum oliveName) {
		this.oliveName = oliveName;
	}

	@Override
	public String toString() {
		return "Olive [oliveName=" + oliveName + ", color=" + color + "]";
	}
	
	
}
