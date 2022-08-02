import java.util.ArrayList;

public class ObjectClass
{
    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        a.add(7);
        a.add(23);
        a.add(4);

        Object o = a.clone();

        System.out.println(o);
    }
}
