package exercise4;

import java.util.Scanner;

public class Exercise4 {

	static void display_array(int arr[][])
	{
		for(int i=0; i<3; ++i)
		{
			for(int j=0; j<4; ++j)
			{
				System.out.print(arr[i][j] + "  ");	 
			}
			System.out.println("");
		}
	}
	
	static void colwise_sum(int arr[][])
	{
		for(int j=0; j<4; ++j)
		{
			float sum = 0.0f;
			for(int i=0; i<3; ++i)
			{
				sum += arr[i][j];
			}
			
			System.out.println("Column " + (j+1) + " sum:  " + sum);
		}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int arr[][] = new int[3][4];
		
		int a, b;
		System.out.println("Give the range [a, b]");
		System.out.print("a:  "); a = input.nextInt();
		System.out.print("b:  "); b = input.nextInt();
		
		for(int i=0; i<3; ++i)
		{
			for(int j=0; j<4; ++j)
			{
				arr[i][j] = (int)Math.floor(Math.random()*(b-a+1)+a);
			}
		}
		
		
		System.out.println("\n\nOur array:  ");
		System.out.println("------------------");
		display_array(arr);
		colwise_sum(arr);
		input.close();

	}

}
