package exercise1;

import java.util.Scanner;

public class Exercise1 {

	static float sum(int arr[])
	{
		float sum=0.0f;
		for(int x : arr)
		{
			sum += x;
		}
		return sum;
	}
	
	static float average(int arr[])
	{
		return (float) sum(arr) / arr.length;
	}
	static int number_big_avearage(int arr[])
	{
		float av = average(arr);
		int counter = 0;
		for(int x : arr)
		{
			if(x > av)
				++counter;
		}
		
		return counter;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*System.out.print("How many integers:  ");
		int n = input.nextInt();*/
		
		int arr[] = new int[5];
		
		System.out.println("please enter 5 integers");
		System.out.println("-----------------------------");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + ":  ");
			arr[i] = input.nextInt();
		}
		
		System.out.println("\n\nthe array: ");
		System.out.println("---------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("--------------------");
		System.out.println("Sum:  " + sum(arr));
		System.out.println("Average:  " + average(arr));
		System.out.println("NUMBER OF INTEGERS GREATER THAN:  " + average(arr) + " = " + number_big_avearage(arr));
	
		input.close();
	}

}
