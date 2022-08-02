package exercise4;

import java.util.Scanner;

public class LCM {

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
	
	static int lcm(int a, int b)
	{
		return (a*b) / gcd(a, b);
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a=0, b=0;
		System.out.println("Enter 2 integers: ");
		System.out.print("a:  "); a= input.nextInt();
		System.out.print("b:  "); b = input.nextInt();
		
		
		System.out.println("LCM(" + a + ", " + b + ") = " + lcm(a, b));

		input.close();
	}

}
