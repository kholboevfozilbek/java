

public abstract class Entry
{
    protected static int m_count = 0;
    protected int m_number;
    protected String m_description;


    public Entry() {

    }

    public Entry(String des) {
        m_description = des;
        ++m_count;
        m_number = m_count;
    }

    public abstract String getContents();

    public static int getCount() {
        return m_count;
    }

    public int getNumber() {
        return m_number;
    }

    public String getDescription() {
        return m_description;
    }


    public void setM_description(String des) {
        if(des == null) {
            System.out.println("Description can not be empty!");
        }
        else
        {
            this.m_description = des;
        }
    }
}
