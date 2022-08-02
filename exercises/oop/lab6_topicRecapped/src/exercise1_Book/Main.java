package exercise1_Book;

public class Main {

	public static void main(String[] args) {
		
		Book oop1 = new Book("Object Oriented Programming", 2001);
		Book sof = new Book("Software Engineering for Practitioners", 2010);
		oop1.addAuthor("Robert Lafore");
		oop1.addAuthor("Fozilbek Kholboev");
		
		
		oop1.print();
		
		sof.print();
		System.out.println("\nNumber of books created: " + Book.count());
	}

}
