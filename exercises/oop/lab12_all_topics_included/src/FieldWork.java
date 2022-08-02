
public class FieldWork extends Work
{
    protected float m_width;
    protected float m_length;
    protected float m_pricepersquare;

    public FieldWork() {
        super();
    }

    public FieldWork(String work_description, String name_worker, float width, float length, float per_square) {
        super(work_description, name_worker);

        if(width <= 0 || length <= 0 )
            throw new IllegalArgumentException("\nDIMENSIONS OF THE AREA CAN NOT BE == 0!!!");
        else if(per_square <= 0)
            throw new IllegalArgumentException("\n$ PRICE  PER SQUARE OF THE AREA CAN NOT BE == 0!!!");
        this.m_width = width;
        this.m_length = length;
        this.m_pricepersquare = per_square;
    }

    public float getWidth() {
        return m_width;
    }

    public void setWidth(float width) {
        if(width > 0)
            this.m_width = width;
        else
            System.out.println("\nDIMENSIONS OF THE AREA CAN NOT BE == 0!!!");
    }

    public float getLength() {
        return m_length;
    }

    public void setLength(float length) {
        if(length > 0)
            this.m_length = length;
        else
            System.out.println("\nDIMENSIONS OF THE AREA CAN NOT BE == 0!!!");
    }

    public float getPricePerSquare() {
        return m_pricepersquare;
    }

    public void setPricePerSquare(float p) {
        if(p > 0)
            this.m_pricepersquare = p;
        else
            System.out.println("\n$ PRICE  PER SQUARE OF THE AREA CAN NOT BE == 0!!!");
    }

    @Override
    public float getCost() {
        return m_pricepersquare * (m_length*m_width);
    }

    @Override
    public String toString() {
        return super.toString() + ", cost: " + getCost()+"\u20ac";
    }
}
