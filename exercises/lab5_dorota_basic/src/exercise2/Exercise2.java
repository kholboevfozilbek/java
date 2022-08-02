package exercise2;

import java.util.Random;

public class Exercise2 {

	static void display_array(int arr[][])
	{
		for(int i=0; i<4; ++i)
		{
			for(int j=0; j<4; ++j)
			{
				System.out.print(arr[i][j] + "  ");	 
			}
			System.out.println("");
		}
	}
	
	static float sum_diagonal(int arr[][])
	{
		float s = 0.0f;
		for(int i=0; i<4; ++i)
		{
			s += arr[i][i];
		}
		
		return s;
	}
	
	static float under_diagonal(int arr[][])
	{
		float sum=0.0f;
		for(int i=0; i<4; ++i)
		{
			for(int j=0; j<=i; ++j)
			{
				sum += arr[i][j];
			}
		}
		
		return sum;
	}
	
	static float above_diagonal(int arr[][])
	{
		float sum=0.0f;
		for(int i=0; i<4; ++i)
		{
			for(int j=i; j<4; ++j)
			{
				sum +=arr[i][j];
			}
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		Random rand  = new Random();
		int arr[][] = new int[4][4];
		
		for(int i=0; i<4; ++i)
		{
			for(int j=0; j<4; ++j)
			{
				arr[i][j] = rand.nextInt(15);
			}
		}
		
		
		System.out.println("\n\nOur 2d array:  ");
		System.out.println("---------------------------");
		display_array(arr);
		
		System.out.println("\nSum of diagonal numbers:  " + sum_diagonal(arr));
		System.out.println("Sum of under diagonal numbers:  " + under_diagonal(arr));
		System.out.println("Sum of above diagonal numbers:  " + above_diagonal(arr));
		
	}

}
