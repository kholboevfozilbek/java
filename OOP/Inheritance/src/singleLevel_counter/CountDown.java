package singleLevel_counter;

public class CountDown extends Counter 
{
	public CountDown() {
		setCount(0);
	}
	public CountDown(int start) {
		setCount(start);
	}
	public void decrement() { setCount(getCount() - 1); }
}
