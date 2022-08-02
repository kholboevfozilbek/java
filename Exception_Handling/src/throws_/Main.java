package throws_;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			divide(1, 0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void divide(int a, int b) throws ArithmeticException {
		int res = a/b;
		
		System.out.println(res);
	}
}
