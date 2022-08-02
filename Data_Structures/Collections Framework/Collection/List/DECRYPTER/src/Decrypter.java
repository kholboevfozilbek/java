

import java.io.*;
import java.util.*;
import java.math.BigInteger;


public class Decrypter {

    public void readKey(String filePath) {
        String line = null;
        try {
            BufferedReader file = new BufferedReader(new FileReader(filePath));
            while((line = file.readLine()) != null) {
                int x=2;
                for(int i=0; i<line.length(); ++i) {
                    this.m_keyMap.put(x, line.charAt(i));
                    ++x;
                }
            }
            file.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readEncryptedNumbers(String filePath) {
        String line = null;
        try {
            BufferedReader file = new BufferedReader(new FileReader(filePath));

            while((line = file.readLine()) != null) {

                String pieces[] = line.split(" ");
                for(String p : pieces) {
                    try {
                        int y = Integer.parseInt(p);
                        m_encryptedNumbers.add(y);
                    } catch (NumberFormatException nfe) {

                    }
                }
            }

            file.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void decrypt(int n, int d) {
        BigInteger n_ = new BigInteger(Integer.toString(n));
        BigInteger d_ = new BigInteger(Integer.toString(d));
        for(int i=0; i<m_encryptedNumbers.size(); ++i) {
            BigInteger y_ = new BigInteger(Integer.toString(m_encryptedNumbers.get(i)));
            BigInteger x = y_.modPow(d_, n_);
            System.out.print(this.m_keyMap.get(x.intValue()));
        }
    }

    private HashMap<Integer, Character> m_keyMap = new HashMap<>();
    private Vector<Integer> m_encryptedNumbers = new Vector<>();

    public static void main(String[] args) {
        Decrypter d = new Decrypter();

        d.readKey("keys.txt");
        d.readEncryptedNumbers("numbers.txt");
        d.decrypt(10019,1949);
    }

}
