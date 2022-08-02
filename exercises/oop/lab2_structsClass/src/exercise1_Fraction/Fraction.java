package exercise1_Fraction;

import java.util.Scanner;

public class Fraction {
	
	private int numerator;
	private int denominator;
	private Scanner input = new Scanner(System.in);
	
	Fraction(int num, int denom) // java does not have default value constructors
	{
		this.numerator = num;
		this.denominator = denom;
	}
	
	// constructors either has to be parameter or no parameter at all
	
	Fraction() {
		System.out.println("\nConstructor is called");
	}
	
	public void setNumerator(int num) {
		this.numerator = num;
	}
	public void setDenominator(int denom) {
		if(denom != 0)
			this.denominator = denom;
		else
		{
			System.out.println("DENOMINATOR CAN NOT BE 0!");
		}
	}
	
	public int getNumerator() {return this.numerator; }
	public int getDenominator() {return this.denominator; }
	
	
	void read()
	{
		System.out.print("Enter the numerator:  "); 
		this.numerator = input.nextInt();
		System.out.print("Enter the denominator:  "); 
		this.denominator = input.nextInt();
	}
	
	void print()
	{
		System.out.print("Fraction:  ");
		System.out.println(this.numerator + " / " + this.denominator);
	}
	
	@Override
	public String toString()
	{
		return "Fraction: " + Integer.toString(numerator) + " / " + Integer.toString(denominator);
	}
	
	public boolean isGreater(Fraction o)
	{
		float res = (float) this.numerator / this.denominator;
		float res2 = (float) o.numerator / o.denominator;
		
		if(res > res2)
			return true;
		return false;
	}
	
	Fraction sum(Fraction o)
	{
		int common_d = lcm(this.denominator, o.denominator);
		int num;
		
		int top1 = common_d / this.denominator;
		int top2 = common_d / o.denominator;
		
		num = (top1*this.numerator) + (top2*o.numerator);
		
		int g  = gcd(num, common_d);
		if( g != 1 )
		{
			num /= g;
			common_d = common_d / g;
		}
		
		return new Fraction(num, common_d);
	}
	
	Fraction product(Fraction o)
	{
		int num = this.numerator * o.numerator;
		int denom = this.denominator * o.denominator;
		
		int g  = gcd(num, denom);
		if(g != 1)
		{
			num /= g;
			denom /= g;
		}
		
		return new Fraction(num, denom);
	}
	public int gcd(int a, int b)
	{
		int x = a, y = b;
		
		while(x != y)
		{
			if(x > y)
				x = x - y;
			else
				y = y - x;
		}
		
		return x;
	}
	
	public int lcm(int a, int b)
	{
		return (a*b) / gcd(a, b);
	}
	

}
