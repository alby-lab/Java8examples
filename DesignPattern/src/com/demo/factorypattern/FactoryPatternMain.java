package com.demo.factorypattern;

public class FactoryPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory factory=new ShapeFactory();
		Shape shape=factory.getShapeFactory("CIRCLE");
		shape.draw();
		Shape shape1=factory.getShapeFactory("RECTANGLE");
		shape1.draw();

	}

}
