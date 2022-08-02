package exercise3;

import java.util.Scanner;

public class Exercise3 {
	
	static void recurring_number(int arr[])
	{
		int number=0;
		int index=0;
		boolean found = false;
		for(int i=0; i<arr.length; ++i)
		{
			for(int j = i+1; j<arr.length; ++j)
			{
				if(arr[i] == arr[j])
				{
					number = arr[i];
					index = i;
					found = true;
					break;
				}
			}
			
			if(found == true)
				break;
		}
		
		System.out.println("Number " + number + " recurs. First occcurance is at " + index);
		
		for(int x : arr)
		{
			if(x == number)
			{
				System.out.print("(" + number + ")  ");
			}
			else
			{
				System.out.print(x + "  ");
			}
		}
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many integers:  ");
		int n = input.nextInt();
		int a, b;
		
		int arr[] = new int[n];
		
		System.out.println("Give the range:  [a, b]");
		System.out.print("a:  "); a = input.nextInt();
		System.out.print("b:  "); b = input.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)Math.floor(Math.random()*(b-a+1)+a);
		}
		
		System.out.println("\n\nNumbers from range  [" + a + ", " + b + "]: ");
		
		for(int i=0; i<arr.length; ++i)
		{
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n");
		
		recurring_number(arr);
		
		input.close();
	}

}
