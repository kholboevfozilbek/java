
public class PieceWork extends Work
{
    protected int m_numberexecution;
    protected float m_priceperexecution;

    public PieceWork() {
        super();
    }

    public PieceWork(String work_description, String name_worker, int number_execution, float price_per_execution) {
        super(work_description, name_worker);
        if(number_execution <= 0)
            throw new IllegalArgumentException("\nNUMBER OF REPEATED ACTIONS CAN NOT BE == 0!");
        else if(price_per_execution <= 0.0f)
            throw new IllegalArgumentException("\nPRICE PER REPEATED ACTIONS CAN NOT BE == 0!");
        this.m_numberexecution = number_execution;
        this.m_priceperexecution = price_per_execution;
    }

    public int getNumberExecution() {
        return m_numberexecution;
    }

    public void setNumberExecution(int number_execution) {
        if(number_execution > 0)
            this.m_numberexecution = number_execution;
        else
            System.out.println("\nNUMBER OF REPEATED ACTIONS CAN NOT BE == 0!");
    }

    public float getPricePerExecution() {
        return m_priceperexecution;
    }

    public void setPricePerExecution(float p) {
        if(p > 0)
            this.m_priceperexecution = p;
        else
            System.out.println("\n$ PRICE PER ACTIONS CAN NOT BE == 0!");
    }

    @Override
    public float getCost() {
        return m_numberexecution * m_priceperexecution;
    }

    @Override
    public String toString() {
        return super.toString() + ", cost: " + getCost()+"\u20ac";
    }
}
