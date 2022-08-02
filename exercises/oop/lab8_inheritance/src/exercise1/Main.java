package exercise1;

public class Main {

	public static void main(String[] args) {
		
		Box x = new Box(4.5f, 2.0f, 1.50f);
		
		x.setContents("fruit", 3.5f);
		
		ColoredBox c = new ColoredBox(3.5f, 2.0f, 1.5f);
		c.setColor("yellow");
		c.setContents("clothes", 5.6f);
		
		System.out.println(c);
		

	}

}
