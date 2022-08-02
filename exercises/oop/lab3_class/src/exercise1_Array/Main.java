package exercise1_Array;

public class Main {

	public static void main(String[] args) {
		Array collection = new Array(5);
		collection.read();
		collection.print();
		
		System.out.println("\n\nSize of the array:  " + collection.size());
		System.out.println("\nAverage of the Array:  " + collection.avg());
		System.out.println("\nMinimum value:  " + collection.min());
		System.out.println("\nMaximum value:  " + collection.max());
	}

}
