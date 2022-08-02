package exercise3;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int p, q;
		System.out.print("Enter the length of the array:  ");
		int n = input.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the range [p, q]");
		System.out.print("Enter p:  "); p = input.nextInt();
		System.out.print("Enter q:  "); q = input.nextInt();
		
		random_gen(arr, p, q);
		display_array(arr);
		input.close();

	}
	
	public static void random_gen(int arr[], int p, int q)
	{
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(q);
		}
	}
	
	public static void display_array(int arr[])
	{
		System.out.println("\nArray elements:  ");
		System.out.println("-------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
	
}
