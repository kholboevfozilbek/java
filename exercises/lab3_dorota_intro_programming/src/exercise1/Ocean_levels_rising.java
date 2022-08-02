package exercise1;

public class Ocean_levels_rising {

	public static void main(String[] args) {
		
		System.out.println("OCEAN LEVELS ARE RISING BY 1.5 mm EACH YEAR!");
		System.out.println("--------------------------------------------\n");
		
		for(int i=0; i<20; ++i)
		{
			System.out.println("Next " + (i+1) + " year:  " + (i*1.5));
		}

	}

}
