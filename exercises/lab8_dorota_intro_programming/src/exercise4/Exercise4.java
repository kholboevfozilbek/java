package exercise4;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many integers:  ");
		int n = input.nextInt();
		int a, b;
		
		int arr[] = new int[n];
		int counters[] = new int[11];
		
		a = 0;
		b = 10;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)Math.floor(Math.random()*(b-a+1)+a);
		}
		
		System.out.println("\n\nNumbers from range  [" + a + ", " + b + "]: ");
		
		for(int i=0; i<arr.length; ++i)
		{
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n");
		
		for(int i=0; i<arr.length; ++i)
		{
			switch(arr[i])
			{
			case 0:
				counters[arr[i]]++;
				break;
			case 1:
				counters[arr[i]]++;
				break;
			case 2:
				counters[arr[i]]++;
				break;
			case 3:
				counters[arr[i]]++;
				break;
			case 4:
				counters[arr[i]]++;
				break;
			case 5:
				counters[arr[i]]++;
				break;
			case 6:
				counters[arr[i]]++;
				break;
			case 7:
				counters[arr[i]]++;
				break;
			case 8:
				counters[arr[i]]++;
				break;
			case 9:
				counters[arr[i]]++;
				break;
			case 10:
				counters[arr[i]]++;
				break;
			}
		}
		
		for(int i=0; i<counters.length; ++i)
		{
			System.out.println(i + ":  " + counters[i]);
		}
		
		input.close();
	}

}
