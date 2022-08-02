package exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static int greatest(int arr[])
	{
		int big = arr[0];
		
		for(int x : arr)
		{
			if(x > big)
				big  =x;
		}
		
		return big;
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
		
		System.out.println("------------------------");
		System.out.println("greatest :  " + greatest(arr));

		input.close();
	}

}
