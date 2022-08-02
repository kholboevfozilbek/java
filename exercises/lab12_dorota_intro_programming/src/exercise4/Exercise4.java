package exercise4;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int p, q;
		System.out.print("Enter the length of the array:  ");
		int n = input.nextInt();
		int arr[] = new int[n];
		int arr2[] = new int[n];
		System.out.println("Enter the range [p, q]");
		System.out.print("Enter p:  "); p = input.nextInt();
		System.out.print("Enter q:  "); q = input.nextInt();
		
		random_gen(arr, p, q);
		random_gen(arr2, p, q);
		System.out.println("\n\nArray 1");
		display_array(arr);
		
		System.out.println("\n\nArray 2");
		display_array(arr2);
		
		swap_arrays(arr, arr2);
		
		System.out.println("\n\nArray 1");
		display_array(arr);
		
		System.out.println("\n\nArray 2");
		display_array(arr2);
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
		System.out.println("Array elements:  ");
		System.out.println("--------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  " );
		}
	}
	
	public static void swap_arrays(int a[], int b[])
	{
		for(int i=0; i<a.length; ++i)
		{
			int temp = a[i];
			a[i] = b[i];
			b[i] = temp;
		}
	}

}
