package exercise2_Clock;

public class Main {

	public static void main(String[] args) {
		
		AlarmClock a = new AlarmClock(20, 22, 54);
		
		a.addAlarm(new Clock(03, 10, 00));
		a.addAlarm(new Clock(04, 15, 00));
		a.addAlarm(new Clock(8, 00, 00));
		
		System.out.println(a);
		
		a.disableAlarm(new Clock(8, 00, 00));
		
		System.out.println(a);

	}

}
