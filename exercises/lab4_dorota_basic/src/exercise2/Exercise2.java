package exercise2;

import java.util.Scanner;

public class Exercise2 {

	static boolean is_ascending(int arr[])
	{
		for(int i=0; i<arr.length; ++i)
		{
			if(i != (arr.length - 1))
			{
				if(arr[i] > arr[i+1])
					return false;
			}
		}
		if(arr[arr.length - 2] > arr[arr.length-1])
			return false;
		
		return true;
		
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many integers:  ");
		int n = input.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("please enter " + n + " integers");
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
		
		System.out.println("array is ascending:  " + is_ascending(arr));
		
		input.close();

	}

}
