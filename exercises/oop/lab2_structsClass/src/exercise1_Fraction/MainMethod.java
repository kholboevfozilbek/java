package exercise1_Fraction;

public class MainMethod {

	public static void main(String[] args) {
		
		Fraction f = new Fraction();
		
		f.read();
		
		Fraction q = new Fraction();
		q.read();
		
		System.out.println(f);
		System.out.println(q);
		
		System.out.println(f.isGreater(q));
		
		System.out.println("\nSum:  " + f.sum(q));
		System.out.println("\nProduct:  " + f.product(q));
	}

}
