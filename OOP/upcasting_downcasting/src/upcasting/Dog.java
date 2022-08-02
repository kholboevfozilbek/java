package upcasting;

public class Dog extends Animal
{
	
	@Override
	public void sound() {
		System.out.println("WOOF");
	}
	
	public void growl() {
		System.out.println("GRRRR...");
	}
}
