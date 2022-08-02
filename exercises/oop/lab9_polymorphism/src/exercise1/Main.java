package exercise1;

public class Main {

	public static void main(String[] args) {
		
		FigureSet set = new FigureSet();
		
		
		set.addFigure(new Rectangle(4.5f, 12.5f));
		set.addFigure(new Triangle(2, 3, 4));
		set.addFigure(new Circle(0));
		set.addFigure(new Circle(7));			
		
		
		
		set.display();
		System.out.println("Figures created:  " + Figure.countFigures());
		
		System.out.println("\nSummary Area:  " + set.getSummaryArea());
		System.out.println("\nSummary Perimeter:  " + set.getSummaryPerimeter());

	}

}
