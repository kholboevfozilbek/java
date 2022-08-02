package exercise2;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, m;
		System.out.println("Enter 2 integers:  ");
		n = input.nextInt();
		m = input.nextInt();
		
		System.out.println("Multiples of " + n + " smaller than " + m);
		
		for(int i = n; i<m; ++i)
		{
			if(i%n == 0)
			{
				System.out.print(i + " ");
			}
		}
		
		input.close();

	}

}
