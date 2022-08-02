package exercise4;

import java.util.Scanner;

public class Exercise4 {

	public static double greatest(double arr[])
	{
		double big = arr[0];
		
		for(double x : arr)
		{
			if(x > big)
				big  =x;
		}
		
		return big;
	}
	public static double lowest(double arr[])
	{
		double low = arr[0];
		
		for(double x : arr)
		{
			if(x < low)
				low  =x;
		}
		
		return low;
	}
	public static double average(double arr[])
	{
		double sum = 0.0d;
		
		for(double x : arr)
		{
			sum += x;
		}
		
		return (double)sum / arr.length;
	}
	public static void show_great_average(double arr[])
	{
		double av = average(arr);
		System.out.println("LIST OF PERSONS WITH SALARIES GREATER THAN: " + av);
		for(int i=0; i<arr.length; ++i)
		{
			if(arr[i] > av)
			{
				System.out.println("Person " + (i+1) + ":  " + arr[i]);
			}
		}
	}
	public static int count_lowest(double arr[])
	{
		int counter = 0;
		double low = lowest(arr);
	
		for(double x : arr)
		{
			if(x == low)
				++counter;
		}
		
		return counter;
	}
	public static int count_greatest(double arr[])
	{
		int counter = 0;
		double big = greatest(arr);
		
		for(double x : arr)
		{
			if(x == big)
				++counter;
		}
		
		return counter;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*System.out.print("How many integers:  ");
		int n = input.nextInt();*/
		
		double arr[] = new double[10];
		
		System.out.println("Please enter 10 persons’ salaries: ");
		System.out.println("----------------------------------");
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(i+1 + ":  ");
			arr[i] = input.nextDouble();
		}
		
		System.out.println("\n\nthe array: ");
		System.out.println("---------------");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------------");
		System.out.println("HIGHEST SALARY :  " + greatest(arr) + "  (" + count_greatest(arr) + " persons)");
		System.out.println("LOWEST SALARY: :  " + lowest(arr) + "  (" + count_lowest(arr) + " persons)");
		System.out.println("AVERAGE OF SALARIES :  " + average(arr));
		
		System.out.println("------------------------");
		show_great_average(arr);

		input.close();
	}

}
