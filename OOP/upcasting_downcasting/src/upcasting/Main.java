package upcasting;

public class Main {

	public static void main(String[] args) {	
		
		Dog a = new Dog();
		
		animal(a);
	}
	
	public static void animal(Animal a) {
		a.sound();
		
		Dog d = (Dog)a;
		
		d.growl();
	}

}
