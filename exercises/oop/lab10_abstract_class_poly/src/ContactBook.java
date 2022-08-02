
import java.util.HashMap;
import java.util.Map;

public class ContactBook
{
    private HashMap<String, Entry> m_list = new HashMap<>();
    private String m_des;

    public ContactBook() {

    }

    public ContactBook(String des) {
        this.m_des = des;
    }

    public void add(String short_name, Entry o) {
        m_list.put(short_name, o);
    }

    public void removeAll() {
        m_list.clear();
    }

    public Entry at(String key) throws NameError{
        if(m_list.containsKey(key)) {
            return m_list.get(key);
        }
        else
            throw new NameError(key + " was not found!");
    }

    public void display() {
        if(m_list.size() > 0) {
            for (Map.Entry<String, Entry> set : m_list.entrySet()) {
                System.out.println(set.getValue().getContents());
            }
        }
        else
            System.out.println("\nEMPTY");
    }
}
