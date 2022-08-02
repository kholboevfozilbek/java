package exercise1;

import java.util.Scanner;

public class Exercise1 {

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
		
		System.out.print("Enter a number to search:  ");
		int x = input.nextInt();
		
		System.out.println("Number " + x + " ouccurs " + count_occurrences(arr, x) + " times");
		
		if(find_integer(arr, x) != -1)
				System.out.println("First ouccurance index: " + find_integer(arr, x));
		else
			System.out.println("The number does not exist in the array!");
		
		input.close();

	}
	
	public static void random_gen(int arr[], int p, int q)
	{
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (int)Math.floor(Math.random()*(q-p+1)+p);
		}
	}
	public static void display_array(int arr[])
	{
		System.out.println("\nArray elements:  ");
		System.out.println("--------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  " );
		}
	}
	
	public static int count_occurrences(int arr[], int x)
	{
		int counter=0;
		for(int xx: arr)
		{
			if(xx == x)
				++counter;
		}
		
		return counter;
	}
	
	public static int find_integer(int arr[], int x)
	{
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == x)
				return i;
		}
		
		return -1;
	}

}
