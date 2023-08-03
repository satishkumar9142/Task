package Logical_Exercise_5;

import java.util.Scanner;

public class CircleComputation_5_3 {
	public static void main(String[] args) {
	 
	   double radius, diameter, circumference, area;  // inputs and results - all in double
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the radius");
	   radius = sc.nextDouble();
	   diameter = 2*radius;
	   circumference = 2 * Math.PI * radius;
	   area = Math.PI *radius * radius;
	   
	   System.out.printf("radius is: %.2f%n",radius);
	   System.out.printf("Diameter is: %.2f%n", diameter);
	   System.out.printf("circumference is: %.2f%n",circumference);
	   System.out.printf("area is: %.2f%n", area);
	   
	   
	   System.out.println("===========  SphereComputation =======");
	   double surfaceArea = 4 * Math.PI *radius * radius;
	   double volumne  = (4/3) * Math.PI *radius * radius *radius;
	   
	   System.out.printf("surface Area is: %.2f%n",surfaceArea);
	   System.out.printf("Volumne is: %.2f%n", volumne);
	   
	   System.out.println("===========  Cylinder Computation =======");
	   System.out.println("Enter height ");
	   double height = sc.nextDouble();
	   double baseArea = Math.PI * radius * radius;
	   double CylinderSurfaceARea  = 2.0 * Math.PI * radius + 2.0 * baseArea;
	   double CylinderVolumne = baseArea * height;
	   
	   System.out.printf("baseArea Area is: %.2f%n",baseArea);
	   System.out.printf("CylinderSurfaceARea is: %.2f%n", CylinderSurfaceARea);
	   System.out.printf("CylinderVolumne is: %.2f%n", CylinderVolumne);
	
	sc.close();
	}
}
