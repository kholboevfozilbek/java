package exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of the array:   ");
		int n = input.nextInt();
		System.out.println("Enter the range [a, b]   ");
		System.out.print("a:  "); int a = input.nextInt();
		System.out.print("b:  "); int b = input.nextInt();
		
		int arr[] = new int[n];
		
		generateArray(arr, a, b);
		displayArray(arr);
		
		bubble_sort(arr);
		
		System.out.println("\nArray has been sorted ascendingly!  ");
		displayArray(arr);

	}
	
	public static void generateArray(int arr[], int a, int b)
	{
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.floor(Math.random() * (b - a+1)+a);
		}
	}
	public static void displayArray(int arr[])
	{
		System.out.println("\nThe array elements:  ");
		System.out.println("--------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("");
	}
	
	public static void bubble_sort(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
