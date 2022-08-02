package wildcards;

public class Main {
	public static void main(String[] args) {
		NumericFunction<Integer> i = new NumericFunction<>(6);
		NumericFunction<Double> d = new NumericFunction<>(-6.0d);
		
		System.out.println(i.absEqual(d));
	}

}
