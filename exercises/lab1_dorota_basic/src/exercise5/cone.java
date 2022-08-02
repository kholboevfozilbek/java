package exercise5;

import java.lang.Math;
import java.util.Scanner;

public class cone {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double radius=0.0d, height=0.0d;
		
		System.out.print("Enter value of radius:  ");
		radius  = input.nextDouble();
		
		System.out.print("Enter value of height:  ");
		height = input.nextDouble();
		
		if(radius < 0 || height < 0)
		{
			System.out.println("Please Enter positive values!");
			System.exit(0);
		}
		
		double volume=0.0d, surface_area=0.0d;
		
		volume = 1/3.0 * Math.PI * Math.pow(radius, 2) * height;
		surface_area = Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
		
		System.out.println("\n----------------------------------------");
		System.out.printf("Volume of the cone:  %.3f\n", volume);
		System.out.printf("Surface area of cone: %.3f\n", surface_area);
		
		input.close();

	}

}
