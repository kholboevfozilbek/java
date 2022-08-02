package exercise4;

import java.util.Random;
import java.util.Scanner;

public class Random_number {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		//double upperbound = 10000.0d;
		
		double arr[] = new double[100];
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			double double_random=rand.nextDouble();
			arr[i] = double_random*10000;
		}
		
		System.out.println("\n\nthe array: ");
		System.out.println("---------------");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		input.close();

	}

}
