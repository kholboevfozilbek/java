package exercise4;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {

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
		System.out.println("\nAverage of elements:  " + average(arr));
		System.out.println("Modified. less elements than average has been replaced!");
		modify(arr);
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
	
	public static float average(int arr[])
	{
		float sum = 0.0f;
		for(int x : arr)
		{
			sum += x;
		}
		
		return sum / arr.length;
	}
	
	public static void modify(int arr[])
	{
		float av = average(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < av)
			{
				arr[i] = Math.round(av);
			}
		}
	}
}
