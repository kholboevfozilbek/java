package polymorphism;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		Wolf w = new Wolf();
		Animal base[] = {d,c,w};
		
		for(Animal x : base)
		{
			x.sound();
		}
	}
}
