package interface_;

public class ByThree implements Series
{
	private int val = 0;
	@Override
	public int getNext() {
		val += 3;
		return val;
	}

}
