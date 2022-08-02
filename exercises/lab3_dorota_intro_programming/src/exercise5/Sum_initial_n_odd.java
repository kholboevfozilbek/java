package exercise5;

import java.util.Scanner;

public class Sum_initial_n_odd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("sum of the initial n odd positive integral numbers");
		System.out.print("Enter the n:  ");
		int n = input.nextInt();
		
		float sum=0.0f;
		
		for(int i=0, j=1; i<n; ++i, j+=2)
		{
			sum += j;
			System.out.print(j + " ");
		}
		
		System.out.println(" : " + sum);
		
		input.close();
	}

}
