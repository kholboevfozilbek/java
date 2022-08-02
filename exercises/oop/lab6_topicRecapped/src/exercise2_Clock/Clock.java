package exercise2_Clock;

import java.text.DecimalFormat;

public class Clock {
	
	private int m_hh;
	private int m_mm;
	private int m_ss;
	
	
	public Clock() {
		System.out.println("Everything has been properly set to default values!");
	}
	
	public Clock(int h, int m, int s) {
		m_hh = h;
		m_mm = m;
		m_ss= s;
	}
	
	@Override
	public String toString() {
		String overall = null;
		DecimalFormat formatter = new DecimalFormat("00");
		String aFormatString = formatter.format(m_hh);
		overall = aFormatString + ":";
		
		aFormatString = formatter.format(m_mm);
		overall += aFormatString + ":";
		
		aFormatString = formatter.format(m_ss);
		overall += aFormatString;
		
		return overall;
	}

	public int getM_hh() {
		return m_hh;
	}

	public void setM_hh(int h) {
		this.m_hh = h;
	}

	public int getM_mm() {
		return m_mm;
	}

	public void setM_mm(int m) {
		this.m_mm = m;
	}

	public int getM_ss() {
		return m_ss;
	}

	public void setM_ss(int s) {
		this.m_ss = s;
	}
}