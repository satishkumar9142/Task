package com.reactiveworks.facade.services;

import com.reactiveworks.facade.model.Shape;
import com.reactiveworks.facade.util.Circle;
import com.reactiveworks.facade.util.Rectangle;
import com.reactiveworks.facade.util.Square;

public class ShapeMaker {
	
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	public void drawCircle(){
		circle.draw();
	}
	public void drawRectangle(){
		rectangle.draw();
	}
	public void drawSquare(){
		square.draw();
	}
}
