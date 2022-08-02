package exercise1;

import java.util.Random;

public class Exercise1 {

	static void display_array(int arr[][])
	{
		for(int i=0; i<5; ++i)
		{
			for(int j=0; j<3; ++j)
			{
				System.out.print(arr[i][j] + "  ");	 
			}
			System.out.println("");
		}
	}
	static void rowwise_big(int arr[][])
	{
		int bigs[] = new int[5];
		for(int i=0; i<5; ++i)
		{
			int biggest = arr[i][0];
			for(int j=0; j<3; ++j)
			{
				if(arr[i][j] > biggest)
				{
					biggest = arr[i][j];
				}
			}
			bigs[i] = biggest;
		}
		
		System.out.println("\n\n");
		for(int i=0; i<bigs.length; ++i)
		{
			System.out.println("Row " + (i+1) + " biggest:  " + bigs[i]);
		}
		
	}
	static void colwise_big(int arr[][])
	{
		System.out.println("\n\n");
		
		int bigs[] = new int[3];
		for(int j=0; j<3; ++j)
		{
			int biggest=arr[0][j];
			for(int i=0; i<5; ++i)
			{
				if(arr[i][j] > biggest)
				{
					biggest = arr[i][j];
				}
			}
			bigs[j] = biggest;
		}
		
		for(int i=0; i<bigs.length; ++i)
		{
			System.out.println("Column " + (i+1) + " biggest:  " + bigs[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Random rand  = new Random();
		int arr[][] = new int[5][3];
		
		for(int i=0; i<5; ++i)
		{
			for(int j=0; j<3; ++j)
			{
				arr[i][j] = rand.nextInt(15);
			}
		}
		
		
		System.out.println("\n\nOur 2d array:  ");
		System.out.println("---------------------------");
		display_array(arr);
		rowwise_big(arr);
		colwise_big(arr);
		
		
	}

}
