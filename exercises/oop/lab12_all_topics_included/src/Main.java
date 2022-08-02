
public class Main
{
    public static void main(String[] args) {

        Schedule repairs = new Schedule("Expected repairs of my room", 2000); //budget=2000€
        System.out.println("Number of works:  " + Work.getCountWorks());

        try {
            repairs.addNewWork(1, new FieldWork("floor", "John", 4.5f, 6, 30)); //4.5x6, 30€
            repairs.addNewWork(2, new FieldWork("walls", "Luke", 21, 2.5f, 15)); //21x2.5, 15€
            repairs.addNewWork(1, new PieceWork("electric points", "Ben", 7, 20)); //7pcs, 20€
            repairs.addNewWork(4, new TimeWork("cleaning", "Mary", 18, 10)); //18h, 10€
            repairs.addNewWork(4, new PieceWork("lighting", "Tom", 4, 30)); //4pcs, 30€
        }
        catch(DeficitError e)
        {
            System.out.println(e);
        }

        System.out.println(repairs);
        System.out.println("Number of works:  " + Work.getCountWorks());
        System.out.println("Summary cost: " + repairs.summaryCost());

    }
}
