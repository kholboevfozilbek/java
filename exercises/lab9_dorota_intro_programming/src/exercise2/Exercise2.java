package exercise2;

import java.util.Random;

public class Exercise2 {

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
	
	static void row_sums(int arr[][])
	{
		for(int i=0; i<3; ++i)
		{
			float sum= 0.0f;
			for(int j=0; j<4; ++j)
			{
				sum += arr[i][j];
			}
			
			System.out.println("Row " + (i+1) + " sum :  " + sum);
		}
		
		
	}
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int arr[][] = new int[3][4];
		
		for(int i=0; i<3; ++i)
		{
			for(int j=0; j<4; ++j)
			{
				arr[i][j] = rand.nextInt(20);
			}
		}
		
		System.out.println("\n\nOur array:  ");
		System.out.println("-----------------");
		
		display_array(arr);
		row_sums(arr);

	}

}
