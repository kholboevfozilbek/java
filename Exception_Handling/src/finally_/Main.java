package finally_;

public class Main {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		try 
		{
			System.out.println("In try 1");
			
			arr[10] = 5;
			
			System.out.println("In try 2");
			return;
		}
		catch(Exception e) 
		{
			System.out.println("In catch");
			return;
		}
		finally 
		{
			System.out.println("Important finally block code!");
		}

	}

}
