package equals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

class Car {
    int x, y;

    Car(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object o) {
        Car s = (Car)o;

        if(this.x != s.x)
            return false;
        else if(this.y != s.y)
            return false;
        return true;
    }
}

public class EqualsMethod
{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Vector<Integer> b = new Vector<>();
        Car car = new Car(1, 2);
        Car car2 = new Car(1, 2);
        a.add(1);
        System.out.println(a.toString());
    }
}
