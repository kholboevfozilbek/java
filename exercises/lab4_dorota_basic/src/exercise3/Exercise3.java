package exercise3;

import java.util.Scanner;

public class Exercise3 {

	static boolean is_unique(int arr[])
	{
		int k = 0;
		for(int i=0; i<(arr.length - 1); ++i)
		{
			
			for(int j = (i+1); j<arr.length; ++i)
			{
				
				if(arr[i] == arr[j])
				{
					System.out.println("i = " + i );
					return false;
				}
			}
		}
		
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

		System.out.println("---------------------");
		System.out.println("Array is unique: " + is_unique(arr));
		input.close();
	}

}
