package exercise3;

import java.util.Scanner;

public class largest_of_two_number {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a=0, b=0;
		
		System.out.print("Enter the first number:  ");
		a = input.nextInt();
		System.out.print("Enter the second number:  ");
		b = input.nextInt();
		
		if(a > b)
		{
			System.out.println(a + " is larger");
		}
		else if(b > a)
		{
			System.out.println(b + " is larger");
		}
		else
		{
			System.out.println("Numbers are equal");
		}
		
		input.close();
	}

}
