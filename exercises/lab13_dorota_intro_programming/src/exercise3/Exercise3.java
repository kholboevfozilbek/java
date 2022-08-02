package exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		get_array(arr);
		System.out.println("Avearge of the elements:  " + average(arr));
		System.out.println("Avearge of the elements belonging to range [-5,5]:  " + average_interval(arr));
		
		int p, q;
		System.out.println("\nEnter the interval [p,q]  ");
		System.out.print("p:  "); 
		p = input.nextInt();
		System.out.print("q:  "); 
		q = input.nextInt();
		
		System.out.println("Avearge of the elements belonging to range [" + p + ", " + q + "]:  " + average_interval_given(arr, p, q));
		if(sum_odd(arr) != -1)
		{
			System.out.println("Sum of odd elements:  " + sum_odd(arr));
		}
		else
		{
			System.out.println("There is no odd numbers in the array");
		}
		if(elements_diviseble(arr) != -1)
		{
			System.out.println("Number of elements divisible by 3:  " + elements_diviseble(arr));
		}
		else
		{
			System.out.println("There is no elements divisible by 3");
		}
		
		System.out.println("Largest from the array:  " + largest(arr));
		System.out.println("Largest odd from the array:  " + large_odd(arr));
		input.close();

	}
	
	public static void get_array(int arr[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the elements of the array:  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + ":  ");
			arr[i] = input.nextInt();
		}
		
	}
	
	public static float average(int arr[])
	{
		float sum=0.0f;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum / arr.length;
	}
	
	public static float average_interval(int arr[])
	{
		int counter=0;
		float sum=0.0f;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= -5 && arr[i] <= 5)
			{
				sum += arr[i];
				++counter;
			}
		}
		
		return sum / counter;
	}
	
	public static float average_interval_given(int arr[], int p, int q)
	{
		int counter=0;
		float sum=0.0f;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= p && arr[i] <= q)
			{
				sum += arr[i];
				++counter;
			}
		}
		
		return sum / counter;
	}
	
	public static float sum_odd(int arr[])
	{
		float sum=0.0f;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0)
			{
				sum += arr[i];
				
			}
		}
		
		if(sum != 0.0f)
			return sum;
		else
			return -1;
	}
	
	public static int elements_diviseble(int arr[])
	{
		int counter=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0)
			{
				++counter;
				
			}
		}
		
		if(counter != 0)
			return counter;
		else
			return -1;
	}

	public static int largest(int arr[])
	{
		int large = arr[0];
		
		for(int x : arr)
		{
			if(x > large)
				large = x;
		}
		
		return large;
	}

	public static int large_odd(int arr[])
	{
		int large = arr[0];
		
		for(int x : arr)
		{
			if(x % 2 != 0)
			{
				if(x > large)
					large = x;
			}
		}
		
		return large;
	}
}
