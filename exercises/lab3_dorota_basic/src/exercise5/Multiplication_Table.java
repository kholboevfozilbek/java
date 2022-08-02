package exercise5;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int n, m;
		System.out.print("Enter n:  ");
		n = input.nextInt();
		System.out.print("Enter m:  ");
		m = input.nextInt();
		
		System.out.print("*\t");
		for(int i=n; i<=m; ++i)
		{
			System.out.print(i + "\t");
		}
		System.out.println("");
		for(int i=n; i<=m; ++i)
		{
			System.out.print(i + "\t");
			for(int k=n; k<=m; ++k)
			{
				System.out.print(i*k +"\t");
			}
			System.out.println("");
		}
		
		input.close();

	}

}
