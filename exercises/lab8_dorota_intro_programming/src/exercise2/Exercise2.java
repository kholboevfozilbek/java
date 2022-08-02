package exercise2;

import java.util.Scanner;

public class Exercise2 {
	
	static void first_occur(int arr[])
	{
		for(int i=0; i<arr.length; ++i)
		{
			if(arr[i] > 0)
			{
				System.out.print("The first positive number is " + arr[i]);
				System.out.println(" and it is located at index " + i);
				break;
			}
		}
	}
	static void last_occur(int arr[])
	{
		for(int i=arr.length-1; i >= 0; --i)
		{
			if(arr[i] > 0)
			{
				System.out.print("The last positive number is " + arr[i]);
				System.out.println(" and it is located at index " + i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many integers:  ");
		int n = input.nextInt();
		int a, b;
		
		int arr[] = new int[n];
		
		System.out.println("Give the range:  [a, b]");
		System.out.print("a:  "); a = input.nextInt();
		System.out.print("b:  "); b = input.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)Math.floor(Math.random()*(b-a+1)+a);
		}
		
		System.out.println("\n\nNumbers from range  [" + a + ", " + b + "]: ");
		
		for(int i=0; i<arr.length; ++i)
		{
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n");
		
		first_occur(arr);
		last_occur(arr);

	}

}
