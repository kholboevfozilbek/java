import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main
{
    public static void main(String[] args)
    {
        Queue<Student> list = new PriorityQueue<>();
        Student o;
        String line = null;
        BufferedReader f1=null, f2=null;
        BufferedWriter out=null;

        try
        {
            f1 = new BufferedReader(new FileReader("gr1.txt"));
            f2 = new BufferedReader(new FileReader("gr2.txt"));

            while((line = f1.readLine()) != null)
            {
                String parts[] = line.split("\\s+");
                o = new Student(parts[0].trim(), parts[1].trim(), Integer.parseInt(parts[2].trim()), Float.parseFloat(parts[3].trim()));

                list.offer(o);
            }
            while((line = f2.readLine()) != null)
            {
                String parts[] = line.split("\\s+");
                o = new Student(parts[0].trim(), parts[1].trim(), Integer.parseInt(parts[2].trim()), Float.parseFloat(parts[3].trim()));
                list.offer(o);
            }

            out = new BufferedWriter(new FileWriter("results.txt"));

            while(!list.isEmpty())
            {
                o = list.poll();
                out.write(o.getM_id()+";"+o.getM_grade()+";"+o.getM_surname()+" "+ o.getM_name().charAt(0)+".\n");
            }

            f1.close();
            f2.close();
            out.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            System.out.println("\nEither id or grade went wrong!!!");
        }

    }
}
