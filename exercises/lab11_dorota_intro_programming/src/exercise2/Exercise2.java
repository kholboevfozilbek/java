package exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the array:  ");
		int n = input.nextInt();
		int arr[] = new int[n];
		
		input_array(arr);
		
		System.out.println("There are " + count_odd(arr) + " odd elements");
		
		input.close();

	}
	
	public static void input_array(int arr[])
	{
		System.out.println("Enter the elements of the array");
		System.out.println("-------------------------------");
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + ":  ");
			arr[i] = input.nextInt();
		}
		
		input.close();
	}
	
	public static int count_odd(int arr[])
	{
		int counter = 0;
		for(int x : arr)
		{
			if(x % 2 != 0)
			{
				++counter;
			}
		}
		return counter;
	}

}
