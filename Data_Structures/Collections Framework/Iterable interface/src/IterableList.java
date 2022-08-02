import java.util.ArrayList;
import java.util.Iterator;

public class IterableList
{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);

        Iterator<Integer> it = a.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
