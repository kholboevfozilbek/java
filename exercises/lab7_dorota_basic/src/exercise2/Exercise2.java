package exercise2;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the array:   ");
		int n = input.nextInt();
		
		int arr[] = new int[n];
		read_array(arr);
		
		System.out.println("\nLargest value:  " + largest(arr));
		System.out.println("\nSmallest value:  " + smallest(arr));
		input.close();
	}
	
	public static void read_array(int arr[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array elements:   ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + ":  ");
			arr[i] = input.nextInt();
		}
	}
	public static int largest(int arr[])
	{
		int large = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > large)
				large = arr[i];
		}
		
		return large;
	}
	public static int smallest(int arr[])
	{
		int small = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < small)
				small = arr[i];
		}
		
		return small;
	}

}
