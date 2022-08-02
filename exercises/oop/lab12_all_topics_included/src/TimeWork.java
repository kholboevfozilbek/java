
public class TimeWork extends Work
{
    protected float m_numberhours;
    protected float m_priceperhour;

    public TimeWork() {
        super();
    }

    public TimeWork(String work_description, String name_worker, float number_hours, float price_hour) {
        super(work_description, name_worker);

        if(number_hours <= 0)
            throw new IllegalArgumentException("\nNUMBER OF HOURS CAN NOT BE == 0!!!");
        else if(price_hour <= 0)
            throw new IllegalArgumentException("\n$ PRICE  PER HOUR OF THE AREA CAN NOT BE == 0!!!");
       this.m_numberhours = number_hours;
       this.m_priceperhour = price_hour;
    }

    public float getNumberHours() {
        return m_numberhours;
    }

    public void setNumberHours(float number_hours) {
        if(number_hours > 0)
            this.m_numberhours = number_hours;
        else
            System.out.println("\nNUMBER OF HOURS CAN NOT BE == 0!!!");
    }

    public float getPricePerHour() {
        return m_priceperhour;
    }

    public void setPricePerHour(float p) {
        this.m_priceperhour = p;
    }

    @Override
    public float getCost() {
        return m_priceperhour * m_numberhours;
    }

    @Override
    public String toString() {
        return super.toString() + ", cost: " + getCost()+"\u20ac";
    }
}
