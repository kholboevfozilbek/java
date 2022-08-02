package checked_unchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			readFile("hello.txt");			
		}
		catch(FileNotFoundException e) 
		{
			System.out.println(e);
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}
	
	public static void readFile(String filename) throws IOException, FileNotFoundException{
		
		FileReader f = new FileReader(filename);
		
		f.close();
	}

}
