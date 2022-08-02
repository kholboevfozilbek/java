package interface_example;

public class Car implements Drivable
{
	@Override
	public void start() {
		System.out.println("\nCar has started");
	}
	
	@Override
	public void stop() {
		System.out.println("\nCar has stopped");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("\nCar turned left");
		
	}

	@Override
	public void turnRight() {
		System.out.println("\nCar turned right");
		
	}

	@Override
	public void accelerate() {
		System.out.println("\nCar started accelarating");
	}

	@Override
	public void reverse() {
		System.out.println("\nCar is reversing");
		
	}

	
}