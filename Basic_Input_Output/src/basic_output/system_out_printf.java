package basic_output;

public class system_out_printf {
	public static void main(String[] args)
	{
		// integer
		int x = 5;
		int y = 3;
		
		System.out.printf("Result: %d + %d = %d\n\n", x, y, x+y);
		
		//double
		double a = 3.14569;
		double b = 2.1234;
		
		System.out.printf("Result: %f + %f = %f\n", a, b, a+b);
		
		//float 
		float f = 1.2f; // when with float 1.2f f is necessary
		float g = 3.5f;
		
		System.out.printf("Result: %.1f + %.2f = %.2f\n\n", f, g, f+g);
		
		// char
		
		char c = 'F';
		char v = '+';
		char n = 'S';
		
		System.out.printf(": %c %c %c\n", c, v, n);
		
		//string 
		String word1 = "Men";
		String word2 = "o'zimni seveman!";
		
		System.out.printf(": %s %s", word1, word2);
	}
}
