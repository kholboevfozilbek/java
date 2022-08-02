package exercise2;

import java.util.Scanner;

public class temprature_converter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float celsius;
		float kelvin;
		float fahrenheit;
		
		System.out.println("Temperature converter from Celsius into Kelvin and Fahrenheit\n");
		
		System.out.print("Enter the value of temperature in Celsius scale: ");
		celsius = input.nextFloat();
		
		System.out.println(celsius + " celsius = " + (celsius + 273.15) + " kelvin");
		System.out.println(celsius + " celsius = " +  (32 + 9/5.0 * celsius) + " fahrenheit");
		
		input.close();

	}

}
