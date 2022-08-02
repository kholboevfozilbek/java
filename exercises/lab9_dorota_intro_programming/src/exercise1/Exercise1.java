package exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence:  ");
		String arr = input.nextLine();
		char target;
		
		System.out.print("Enter a character to search :  ");
		target = input.next().charAt(0);
		
		int counter=0;
		for(int i=0; i<arr.length(); ++i)
		{
			if(arr.charAt(i) == target)
				++counter;
		}
		int count_low=0;
		for(int i=0; i<arr.length(); ++i)
		{
			if(Character.isLowerCase(arr.charAt(i)))
				++count_low;
		}
		
		System.out.println("char " + target + " occurs " + counter + " times in sentence:  ");
		System.out.println(arr);
		
		System.out.println("Lowercase letters occurs " + count_low + " times in sentence:  ");
		System.out.println(arr);
		
		input.close();
	}

}
