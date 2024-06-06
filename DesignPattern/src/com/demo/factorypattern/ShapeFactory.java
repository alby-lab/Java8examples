package com.demo.factorypattern;

public class ShapeFactory {
	
	public Shape getShapeFactory(String factoryType) {
		
		if(factoryType.equalsIgnoreCase("CIRCLE")) {
		return new Circle();	
		}
		if(factoryType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
		
		
	}

}
