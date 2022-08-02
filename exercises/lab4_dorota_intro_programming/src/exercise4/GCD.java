package exercise4;

import java.util.Scanner;

public class GCD {

	static int gcd(int a, int b)
	{
		int x = a;
		int y = b;
		
		while(x != y)
		{
			if(x > y)
			{
				x = x - y;
			}
			else if(y > x)
			{
				y = y - x;
			}
		}
		
		return x;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a=0, b=0;
		System.out.println("Enter 2 integers: ");
		System.out.print("a:  "); a= input.nextInt();
		System.out.print("b:  "); b = input.nextInt();
		
		
		System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
		
		input.close();

	}

}
