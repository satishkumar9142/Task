package com.reactiveworks.facade.mainmethod;

import com.reactiveworks.facade.services.ShapeMaker;

public class FacadePatternDemo {
	 public static void main(String[] args) {
	      ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		
	   }
}
