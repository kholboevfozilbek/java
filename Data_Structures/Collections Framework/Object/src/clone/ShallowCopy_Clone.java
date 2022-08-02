package clone;

class Testt {
    int x, y;
}

class Testt2 implements Cloneable{
    int a, b;

    Testt c = new Testt();

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
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

public class ShallowCopy_Clone
{
    public static void main(String[] args) {
        Testt2 t = new Testt2();
        t.a = 10;
        t.b = 20;
        t.c.x = 30;
        t.c.y = 40;

        try {
            Testt2 t2 = (Testt2)t.clone();
            t2.a = 100;
            t2.c.x=300;

            System.out.println(t.a + " " + t.b + " " + t.c.x + " " + t.c.y);
            System.out.println(t2.a + " " + t2.b + " " + t2.c.x + " " + t2.c.y);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
