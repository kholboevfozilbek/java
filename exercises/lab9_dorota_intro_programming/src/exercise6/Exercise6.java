package exercise6;

import java.util.Scanner;

public class Exercise6 {

	static boolean palindrome(String word)
	{
		if(word.length() % 2 == 0)
		{
			for(int i=0, j=word.length()-1; i<word.length()/2 && j >= word.length()/2; ++i, j--)
			{
				if(word.charAt(i) != word.charAt(j))
					return false;
			}
			
			return true;
		}
		else
		{
			for(int i=0, j=word.length()-1; i<word.length()/2 && j > word.length()/2; ++i, j--)
			{
				if(word.charAt(i) != word.charAt(j))
					return false;
			}
			
			return true;
		}
		
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word:  ");
		String word = input.next();
		
		System.out.println("\nIS THE WORD: " + word + " PALINDROME?  " + palindrome(word));
		
		input.close();
	}

}
