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
		System.out.println("\nAverage of numbers:  " + average_odd(arr));
		
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
	
	public static float average_odd(int arr[])
	{
		float sum=0.0f;
		int counter = 0;
		
		for(int x:  arr)
		{
			if(x % 2 != 0)
			{
				sum += x;
				++counter;
			}
				
		}
		
		return (float) sum / counter;
	}

}
