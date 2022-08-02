package try_catch;

public class Try_Catch_Example {
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		try {
			System.out.println("In try 1");
			
			arr[3] = 25;
			
			System.out.println("In try 2");
			
		} catch(Exception e) {
			System.out.println("In catch");
		}
		
		System.out.println("Rest of the program");
	}
}
