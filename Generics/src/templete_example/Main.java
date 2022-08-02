package templete_example;

public class Main {

	public static void main(String[] args) {

		Printer<Integer> p = new Printer<>(23); 
		p.print();
		
		Printer<Double> d = new Printer<>(33.5);
		d.print();
	
	}

}
