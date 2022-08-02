package clone;

class Test {
    int x, y;
}

class Test2 implements Cloneable{
    int a, b;

    Test c = new Test();

    public Object clone() throws CloneNotSupportedException {
        Test2 t2 = (Test2)super.clone();

        t2.c = new Test();

        t2.c.x = c.x;
        t2.c.y = c.y;

        return  t2;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

}

public class DeepCopy_Clone
{
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.a = 10;
        t.b = 20;
        t.c.x = 30;
        t.c.y = 40;

        try {
            Test2 t2 = (Test2)t.clone();
            t2.a = 100;
            t2.c.x=300;

            System.out.println(t.a + " " + t.b + " " + t.c.x + " " + t.c.y);
            System.out.println(t2.a + " " + t2.b + " " + t2.c.x + " " + t2.c.y);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
