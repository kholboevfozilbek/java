package exercise2;

public class Treadmill_burn {

	public static void main(String[] args) {
		
		System.out.println("CALORIES BURNED 3.6 PER MINUTE!");
		System.out.println("-------------------------------");
		
		for(int i=5; i<=30; i+=5)
		{
			System.out.println("After " + i + " minutes:  " + (i*3.6));
		}

	}

}
