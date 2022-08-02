package exercise5;

import java.util.Scanner;

public class MODIFICATION {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int n1, m1;
		int n2, m2;
		System.out.print("Enter n1:  ");
		n1 = input.nextInt();
		System.out.print("Enter m1:  ");
		m1 = input.nextInt();
		System.out.print("Enter n2:  ");
		n2 = input.nextInt();
		System.out.print("Enter m2:  ");
		m2 = input.nextInt();
		
		System.out.print("*\t");
		for(int i=n1; i<=m1; ++i)
		{
			System.out.print(i + "\t");
		}
		System.out.println("");
		
		
		for(int i=n2; i<=m2; ++i)
		{
			System.out.print(i + "\t");
			for(int k=n1; k<=m1; ++k)
			{
				System.out.print(i*k +"\t");
			}
			System.out.println("");
		}
		
		input.close();

	}

}
