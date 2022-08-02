package exercise3;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

	static void display_array(int arr[][], int n, int m)
	{
		for(int i=0; i<n; ++i)
		{
			for(int j=0; j<m; ++j)
			{
				System.out.print(arr[i][j] + "  ");	 
			}
			System.out.println("");
		}
	}
	
	static void rowwise_big_sum(int arr[][], int n, int m)
	{
		float sum = 0.0f;
		int big=0, index=0;
		for(int i=0; i<n; ++i)
		{
			sum = 0.0f;
			for(int j = 0; j<m; ++j)
			{
				sum += arr[i][j];
			}
			
			if(sum > big)
			{
				big = (int) sum;
				index = i;
			}
		}
		
		System.out.println("\nThe row " + (index+1) + " has biggest sum:  " + big);
		for(int j=0; j<m; ++j)
		{
			System.out.print(arr[index][j] + "  ");
		}
	}
	
	static void colwise_small_sum(int arr[][], int n, int m)
	{
		float sum = 0.0f;
		float smal=Float.MAX_VALUE;
		int index = 0;
		for(int j=0; j<m; ++j)
		{
			sum = 0.0f;
			for(int i=0; i<n; ++i)
			{
				sum += arr[i][j];
			}
			if(sum < smal)
			{
				smal = sum;
				index = j;
			}
		}
		
		System.out.println("\nThe column " + (index+1) + " has smallest sum:  " + smal);
		for(int i=0; i<n; ++i)
		{
			System.out.println(arr[i][index]);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand  = new Random();
		int n=0, m=0;
		
		System.out.print("Enter row_size (n):  ");
		n = input.nextInt();
		System.out.print("Enter column_size (m):  ");
		m = input.nextInt();
		
		int arr[][] = new int[n][m];
		
		
		for(int i=0; i<n; ++i)
		{
			for(int j=0; j<m; ++j)
			{
				arr[i][j] = rand.nextInt(15);
			}
		}
		
		
		System.out.println("\n\nOur 2d array:  ");
		System.out.println("---------------------------");
		display_array(arr, n, m);
		
		rowwise_big_sum(arr, n, m);
		colwise_small_sum(arr, n, m);
		
		input.close();
	}

}
