import java.util.ArrayList;
import java.util.List;

public class Schedule
{
    private String m_scheduledescription;
    private double m_budget;
    private double m_available;
    private List<Work> m_list = new ArrayList<>();

    public Schedule() {

    }

    public Schedule(String schedule_description, double budget) {
        if(schedule_description == null)
            throw new IllegalArgumentException("\nPROVIDE DESCRIPTION FOR Schedule object!!!");
        else if(budget <= 0)
            throw new IllegalArgumentException("\nSCHEDULE BUDGET CAN NOT BE NEGATIVE!!!");
        this.m_scheduledescription = schedule_description;
        this.m_budget = budget;
        this.m_available = budget;
    }

    public String getScheduleDescription() {
        return m_scheduledescription;
    }

    public void setScheduleDescription(String des) {
        this.m_scheduledescription = des;
    }

    public double getBudget() {
        return m_budget;
    }

    public void setBudget(double budget) {
        this.m_budget = budget;
    }

    public double getAvailable() {
        return m_available;
    }


    public void addNewWork(int pos, Work new_work) {
        if(new_work.getCost() > m_available)
            throw new DeficitError("\nNOT ENOUGH FUNDS FOR COST OF NEW TASK" +"\n(" + new_work.toString() + ")");
        if(pos < 1 || pos > m_list.size()+1)
            throw new ArrayIndexOutOfBoundsException("\nINVALID POSITION!!!");

        m_list.add(pos-1, new_work);
        m_available = m_available - new_work.getCost();
    }

    @Override
    public String toString() {
        String final_message =  "\n" + m_scheduledescription + ", total budget: " + m_budget + "\u20ac"
                + ", remaining funds: " + m_available + "\u20ac" + "\n";

        for (int i = 0; i < m_list.size(); i++) {
            final_message += Integer.toString(i+1) + ". " + m_list.get(i).toString() + "\n";
        }
        return final_message;
    }

    public double summaryCost() {
        double sum = 0.0d;
        for(Work x : m_list) {
            sum += x.getCost();
        }
        return sum;
    }
}
