package exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the array:  ");
		int n = input.nextInt();
		int arr[] = new int[n];
		
		input_array(arr);
		System.out.println("The average of the elements:  " + average(arr));
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
	
	public static float average(int arr[])
	{
		float sum = 0.0f;
		for(int x : arr)
		{
			sum += x;
		}
		
		return sum / arr.length;
	}

}
