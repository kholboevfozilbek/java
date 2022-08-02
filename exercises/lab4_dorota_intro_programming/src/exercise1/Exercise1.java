package exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter positive M:  ");
		int m=input.nextInt();
		
		if(m <= 0)
		{
			System.out.println("Please enter psotive m!");
			System.exit(-1);
		}
		
		float sum=0.0f;
		int counter=0, i=1;
		while(sum <= m)
		{
			sum+=i;
			++counter;
			++i;
		}
		
		System.out.println(counter + " consecutive integers needed -> " + sum);
		
		input.close();

	}

}
