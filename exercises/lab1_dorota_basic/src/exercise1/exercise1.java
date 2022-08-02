package exercise1;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		
		//sorry all versions are included!
		//version1 using if statement
		//version2 using conditional operators
		Scanner input = new Scanner(System.in);

		int a=0, b=0, c=0;
		
		System.out.print("Enter three integers:  ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		System.out.println("\nAverage of" + a + ", " + b + ", " + c + " is " + (a+b+c)/3.0);
		System.out.println("------------------------------------------");
		System.out.print("The greatest value is:  ");
		
		if(a > b && a > c)
		{
			System.out.println(a);
		}
		else if(b > a && b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
		
		System.out.println("------------------------------------------");
		input.close();
	}

}
