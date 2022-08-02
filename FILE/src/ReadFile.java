
import java.io.*;
public class ReadFile
{
    public static void main(String[] args) {

        String line = null;
        try {
            BufferedReader file = new BufferedReader(new FileReader("myfile.txt"));

            while((line = file.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
