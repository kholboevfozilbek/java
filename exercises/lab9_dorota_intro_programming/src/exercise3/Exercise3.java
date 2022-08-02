package exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence:  ");
		String arr = input.nextLine();
		char char_arr[] = arr.toCharArray();
		
		
		for(int i=0; i<arr.length(); ++i)
		{
			if(Character.isLowerCase(arr.charAt(i)))
			{
				char_arr[i] = Character.toUpperCase(arr.charAt(i));
			}
		}
		
		System.out.println("----------------------");
		System.out.println("CONVERTED TO UPPERCASE");
		System.out.println(char_arr);
		

		input.close();
	}

}
