import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static BufferedReader in = null;
    public static String line = null, n = null, s = null;
    public static List<EmployeeBankAccount> ipko = new ArrayList<>(); //1020
    public static List<EmployeeBankAccount> mbank = new ArrayList<>(); //1140
    public static BufferedWriter ipko_out = null, mbank_out = null;
    public static EmployeeBankAccount o;

    public static void main(String[] args)
    {
        try
        {
            in = new BufferedReader(new FileReader("accounts.txt"));
            parse();
            ipko_out = new BufferedWriter(new FileWriter("1020.txt"));
            mbank_out = new BufferedWriter(new FileWriter("1140.txt"));

            for(EmployeeBankAccount x : ipko) {
                ipko_out.write("IBAN: " + x.getM_accountnumber() + "\nName: " + x.getM_name() + "\nSalary: " + x.getM_salary()+"\n");
            }

            for(EmployeeBankAccount x : mbank) {
                mbank_out.write("IBAN: " + x.getM_accountnumber() + "\nName: " + x.getM_name() + "\nSalary: " + x.getM_salary()+"\n");
            }

            in.close();
            ipko_out.close();
            mbank_out.close();

        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void parse() throws IOException {
        while ((line = in.readLine()) != null) {
            n = in.readLine();
            s = in.readLine();

            o = new EmployeeBankAccount(n.trim(), Float.parseFloat(s.trim()), line.trim());

            switch (o.getM_accountnumber().substring(5, 9)) {
                case "1020":
                    ipko.add(o);
                    break;
                case "1140":
                    mbank.add(o);
                    break;
                default:
                    System.out.println("Something went wrong!!!");
                    break;
            }
        }
    }

}
