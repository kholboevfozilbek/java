package singleLevel_counter;

public class Counter
{
	protected int m_count;
	
	public Counter() {
		setCount(0);
	}
	
	public Counter(int start_off) {
		setCount(start_off);
	}
	
	@Override
	public String toString() {return Integer.toString(getCount()); }
	public int getCount() {return m_count; }
	public void increament() {setCount(getCount() + 1); }

	public void setCount(int c) {
		this.m_count = c;
	}
}
