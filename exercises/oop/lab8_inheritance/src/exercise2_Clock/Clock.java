package exercise2_Clock;

public class Clock 
{
	protected int m_hour;
	protected int m_minute;
	protected int m_second;
	
	public Clock() {
		
	}
	
	public Clock(int hh, int mm, int ss) {
		if(hh <= 0 || hh > 23 || mm < 0 || mm > 59 || ss < 0 || ss > 59) {
			System.out.println("\nWRONG DATA FORMAT ENTEERED!");
			System.exit(-1);
		}
		
		m_hour = hh;
		m_minute = mm;
		m_second =  ss;
	}

	public int geHour() {
		return m_hour;
	}

	public void setHour(int hh) {
		this.m_hour = hh;
	}

	public int getMinute() {
		return m_minute;
	}

	public void setMinute(int mm) {
		this.m_minute = mm;
	}

	public int getSecond() {
		return m_second;
	}

	public void setSecond(int ss) {
		this.m_second = ss;
	}
	
	public void setAll(Clock time) {
		if(time.isValid() == true)
		{
			this.m_hour = time.geHour();
			this.m_minute = time.getMinute();
			this.m_second = time.getSecond();
		}
		else
		{
			System.out.println("\nTime enetered is incorrect!");
		}
	}
	@Override
	public String toString() {
		return (m_hour < 10 ? "0" : "") + m_hour + ":" +  (m_minute < 10 ? "0" : "") + m_minute
				+":"+ (m_second < 10 ? "0" : "") + m_second;
	}
	
	public boolean isValid() {
		if(m_hour <= 0 || m_hour > 23 || m_minute < 0 || m_minute > 59 || m_second < 0 || m_second > 59)
			return false;
		return true;
	}
	
	public boolean equals(Clock o) {
		if(this.m_hour == o.m_hour && this.m_minute == o.m_minute && this.m_second == o.m_second)
			return true;
		return false;
	}
}
