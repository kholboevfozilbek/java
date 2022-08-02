package exercise2_Clock;

import java.util.ArrayList;
import java.util.List;

public class AlarmClock extends Clock
{
	private List<Clock> m_list = new ArrayList<>();
	private List<Boolean> m_enable = new ArrayList<>();
	
	public AlarmClock() {
		
	}
	public AlarmClock(int hh, int mm, int ss) {
		super(hh, mm, ss);
	}
	
	public void setCurrentTime(Clock time) {
		if(time.isValid() == true)
		{
			this.setAll(time);
		}
		else
		{
			System.out.println("\nTime entered is incorrect!");
		}
	}
	
	public void addAlarm(Clock time) {
		if(time.isValid() == true) {
			m_list.add(time);
			m_enable.add(true);
		}
		else
		{
			System.out.println("Time entered is incorrect!");
		}
	}
	
	public void eraseAlarms() {
		m_list.clear();
		m_enable.clear();
	}
	
	public void enableAlarm(Clock time) {
		if(time.isValid() == true) {
			for (int i = 0; i < m_list.size(); i++) {
				if(m_list.get(i).equals(time) == true)
				{
					m_enable.set(i, true);
				}
			}
		}
		else
		{
			System.out.println("Given time is incorrect!");
		}
	}
	
	public void disableAlarm(Clock time) {
		if(time.isValid() == true) {
			for (int i = 0; i < m_list.size(); i++) {
				if(m_list.get(i).equals(time) == true)
				{
					m_enable.set(i, false);
				}
			}
		}
		else
		{
			System.out.println("Given time is incorrect!");
		}
	}
	
	@Override
	public String toString() {
		String finale = "\nCurrent time: " +  super.toString();
		finale += "\nAlarms:   \n";
		
		for (int i = 0; i < m_list.size(); i++) {
			finale += m_list.get(i).toString();
			if(m_enable.get(i) == true) 
				finale += " ON\n";
			else
				finale += " OFF\n";
		}
		
		return finale;
	}
}
