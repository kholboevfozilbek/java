package exercise5;

import java.util.Scanner;

public class Exercise5 {

	static void display_array(int arr[][])
	{
		for(int i=0; i<3; ++i)
		{
			for(int j=0; j<3; ++j)
			{
				System.out.print(arr[i][j] + "  ");	 
			}
			System.out.println("");
		}
	}
	static void generate_arrays_random(int arr[][])
	{
		for(int i=0; i<3; ++i)
		{
			for(int j=0; j<3; ++j)
			{
				arr[i][j] = (int)Math.floor(Math.random()*(10-0+1)+0);
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int arr2[][] = new int[3][3];
		int add[][] = new int[3][3];
		
		generate_arrays_random(arr);
		generate_arrays_random(arr2);
		
		System.out.println("\nOur array 1:  ");
		System.out.println("----------------");
		display_array(arr);
		
		System.out.println("\nOur array 2:  ");
		System.out.println("----------------");
		display_array(arr2);

		for(int i=0; i<3; ++i)
		{
			for(int j=0; j<3; ++j)
			{
				add[i][j] = arr[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("\nSUM OF 2 MATRICES:  ");
		System.out.println("----------------------");
		display_array(add);
		
		input.close();
	}

}
