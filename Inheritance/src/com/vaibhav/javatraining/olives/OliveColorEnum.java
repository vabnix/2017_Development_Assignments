package com.vaibhav.javatraining.olives;

public enum OliveColorEnum {
	
	GREEN("Green"),
	BLACK("Black"),
	GOLDEN("Golden");
	
	private String colorAsString;
	
	private OliveColorEnum(String colorAsString) {
		this.colorAsString = colorAsString;
	}
	
	@Override
	public String toString() {
		return this.colorAsString;
	}

}
