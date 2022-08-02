import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{
    public static void main(String[] args) {

        int age = 18;
        float sm = 14.5f;
        String name = "Fozil";
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter("myfile.txt"));

            file.write("Hello I am " + name + " and I am " + age + " years old!");

            file.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {

        }

    }
}
