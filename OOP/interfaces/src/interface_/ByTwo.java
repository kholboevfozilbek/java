package interface_;

public class ByTwo implements Series
{
	private int val = 0;
	@Override
	public int getNext() {
		val += 2;
		return val;
	}

}
