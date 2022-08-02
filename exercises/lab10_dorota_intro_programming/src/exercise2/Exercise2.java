package exercise2;


public class Exercise2 {

	public static void main(String[] args) {
		
		System.out.println("GCD:  " + gcd(44, 121));
		System.out.println("LCM:  " + lcm(44, 121));
	}
	
	public static int gcd(int a, int b)
	{
		int x = a;
		int y = b;
		
		while(x != y)
		{
			if(x > y )
				x = x - y;
			else
				y = y - x;
		}
		
		return x;
	}
	
	public static int lcm(int a, int b)
	{
		return Math.abs(a * b) / gcd(a, b);
	}

}
