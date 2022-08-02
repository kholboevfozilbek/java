import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Extention
{
    public static int m_banks;
    public static Map<String, String> m_identifiers = new HashMap<>();
    public static BufferedReader m_filein;
    public static Map<String, BufferedWriter> m_fileout = new HashMap<>();

    public static Scanner m_input = new Scanner(System.in);

    public static void main(String[] args)
    {
        getBanksIdentifiers();

        try
        {
            parse("accounts.txt");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }

    public static boolean isValid(String name, String id)
    {
        if(name == null || id == null)
            return false;
        else if(id.length() != 4)
            return false;
        return true;
    }

    public static void getBanksIdentifiers()
    {
        String n=null, id = null;
        try
        {
            System.out.println("\nHow many banks you want to enter:  ");
            m_banks = Integer.parseInt(m_input.nextLine());
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }


        for (int i = 0; i < m_banks; i++)
        {
            System.out.print((i+1) + ". Name of the bank:  ");
            n = m_input.nextLine();
            System.out.print("   Identifier of the bank:  ");
            id = m_input.nextLine();

            if(isValid(n, id) == true)
            {
                m_identifiers.putIfAbsent(n, id);
            }
            else
                System.out.println("putting id smth went wrong!!!");
        }
    }

    public static void parse(String path) throws FileNotFoundException, IOException
    {
        String line=null, n=null, s=null;
        EmployeeBankAccount o;
        m_filein = new BufferedReader(new FileReader(path));

        if(m_filein.ready())
        {
            System.out.println("\nFILE OPENED!!!");
            while ((line = m_filein.readLine()) != null)
            {
                System.out.println(line);
                System.out.println(m_filein.readLine());
                System.out.println(m_filein.readLine());

                o = new EmployeeBankAccount(n.trim(), Float.parseFloat(s.trim()), line.trim());

            }
        }
        else
            throw new IllegalArgumentException("Smth is wrong with file path");
    }
}
