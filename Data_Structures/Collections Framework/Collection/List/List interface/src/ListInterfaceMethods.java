import java.util.ArrayList;
import java.util.List;

public class ListInterfaceMethods
{
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        Integer arr[] = {12, 13, 14, 15};
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.addAll(2, List.of(arr));
        /*l.add(2, 5);
        //l.addAll(List.of(arr));
        l.addAll(2, List.of(arr));

        System.out.println(l);

        if(l.contains(7))
            System.out.println("Yes contains 7");
        else
            System.out.println("No does not contain 7");*/

        if(l.containsAll(List.of(arr)))
            System.out.println("Contains all");
        else
            System.out.println("Do not contain all!");

        System.out.println("Element at index 3: " + l.get(3));
        //System.out.println(l.hashCode());

        System.out.println(l.indexOf(3));

        l.clear();
        System.out.println(l);
    }
}
