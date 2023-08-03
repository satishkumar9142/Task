package com.reactiveworks.factory.util;

import com.reactiveworks.factory.model.Circle;
import com.reactiveworks.factory.model.Rectangle;
import com.reactiveworks.factory.model.Shape;
import com.reactiveworks.factory.model.Square;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
			
		} else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
			
		} else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
			
		}else {
			return null;
		}
	}
}
