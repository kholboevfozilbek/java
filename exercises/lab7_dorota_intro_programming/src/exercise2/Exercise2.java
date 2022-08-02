package exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static float sum_even(int arr[])
	{
		float sum = 0.0f;
		for(int x : arr)
		{
			if(x % 2 == 0)
			{
				sum += x;
			}
		}
		return sum;
	}
	
	public static int counter_even(int arr[])
	{
		int counter = 0;
		for(int x : arr)
		{
			if(x % 2 == 0)
			{
				counter++;
			}
		}
		return counter;
	}
	public static float average_even(int arr[])
	{
		return (float)sum_even(arr) / counter_even(arr);
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*System.out.print("How many integers:  ");
		int n = input.nextInt();*/
		
		int arr[] = new int[5];
		
		System.out.println("please enter 5 integers");
		System.out.println("-----------------------------");
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(i+1 + ":  ");
			arr[i] = input.nextInt();
		}
		
		System.out.println("\n\nthe array: ");
		System.out.println("---------------");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("SUM OF EVEN INTEGERS:  " + sum_even(arr));
		System.out.println("NUMBER OF EVEN INTEGERS :  " + counter_even(arr));
		System.out.println("AVERAGE OF EVEN INTEGERS:  " + average_even(arr));

		input.close();
	}

}
