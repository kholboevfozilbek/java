package abstract_class;

public abstract class Animal 
{
	
	protected double amount_eat;
	protected String habitat;
	protected String category;
	
	
	public Animal() {
		
	}

	public Animal(double eat, String hab, String cat) {
		amount_eat = eat;
		habitat = hab;
		category = cat;
	}
	
	public void eat() {
		System.out.println("EATING");
	}
	
	public abstract void sound();
}

class Cat extends Animal
{
	
	public Cat(double eat, String hab, String cat) {
		super(eat, hab, cat);
	}
	
	public Cat() {
		
	}
	
	@Override
	public void sound() {
		System.out.println("\nMEAOW");
	}
}
