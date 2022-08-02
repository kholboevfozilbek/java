import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionMethods
{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Integer arr[] = {12, 13, 14, 15};
        a.add(1); // adds the elements to the end of the collection;
        a.add(2); // adds the elements to the end of the collection;
        a.add(3); // adds the elements to the end of the collection;

        System.out.println(a.toString());
        System.out.println(a.size());

        Collections.addAll(a, arr); // adds all the element of specified collection to the end of our list
        System.out.println(a);
        System.out.println(a.size());

        /*if(a.contains(8))
            System.out.println("Yes contains 2");
        else
            System.out.println("NO");

        if(a.containsAll(List.of(arr)))
            System.out.println("Yes contains all");
        else
            System.out.println("No do not contains all");

        System.out.println(a.isEmpty());

        Iterator<Integer> it = a.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + "  ");
        }
        System.out.println("");
        a.remove(1);
        System.out.println(a);

        a.removeIf(x -> x%2==0);
        System.out.println(a);

        a.removeAll(List.of(arr));
        System.out.println(a);*/

        a.retainAll(List.of(arr));
        System.out.println(a);
        System.out.println(a.size());

        a.clear();
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.isEmpty());

    }
}
