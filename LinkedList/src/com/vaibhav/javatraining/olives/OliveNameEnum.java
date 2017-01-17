package com.vaibhav.javatraining.olives;

public enum OliveNameEnum {
	
	INDIA("India"),
	LONDON("London"),
	DALLAS("Dallas"),
	CANADA("Canada");
	
	private String nameAsString;
	
	private OliveNameEnum(String nameAsString) {
		this.nameAsString = nameAsString;
	}
	
	@Override
	public String toString() {
		return this.nameAsString;
	}

}
