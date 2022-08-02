package exercise6;

import java.util.Scanner;

public class GCD_fraction_simplifier {

	static int gcd(int a, int b)
	{
		int x = a;
		int y=b;
		
		while(x != y)
		{
			if(x>y)
				x = x - y;
			else
				y = y - x;
		}
		
		return x;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num, denom = 0;
		
		System.out.print("Enter numerator:  ");
		num = input.nextInt();
		System.out.print("Enter denominator:  ");
		denom = input.nextInt();
		
		
		if(denom == 0)
		{
			System.out.println("Denominator cantbbe 0!");
			System.exit(-1);
		}
		
		int gcdd = gcd(num, denom);
		
		System.out.print(num + " / " + denom + "  =  ");
		
		if(gcdd != 1)
		{
			num /= gcdd;
			denom /= gcdd;
		}
		System.out.print(num + " / " + denom);
		
		input.close();
	}

}
