package exercise1;


import java.util.Scanner;

public class Exercise1 {

	static void show_positive(int arr[])
	{
		int counter = 0;
		for(int x: arr)
		{
			if(x > 0)
				++counter;
		}
		
		System.out.println("\n\nThere are " + counter + " positive numbers in the array: ");
		for(int x: arr)
		{
			if(x > 0)
				System.out.print(x + "  ");
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
		
		System.out.println("Numbers from range  [" + a + ", " + b + "]: ");
		
		for(int i=0; i<arr.length; ++i)
		{
			System.out.print(arr[i] + "  ");
		}
		
		show_positive(arr);
		
		input.close();

	}

}
