
public class AddressEntry extends Entry
{
    private String m_city;
    private String m_street;
    private int m_house_number;

    public AddressEntry() {
        super();
    }

    public AddressEntry(String des, String city, String street, int house_num) {
        super(des);
        this.m_city = city;
        this.m_street = street;
        this.m_house_number = house_num;
    }

    @Override
    public String getContents() {
        return super.m_description + ": " + m_city + ", " + m_street + m_house_number;
    }

    public String getCity() {
        return m_city;
    }

    public String getStreet() {
        return m_street;
    }

    public int getHouseNumber() {
        return m_house_number;
    }

    public void setCity(String c) {
        this.m_city = c;
    }

    public void setStreet(String s) {
        this.m_street = s;
    }

    public void setHouseNumber(int house_num) {
        this.m_house_number = house_num;
    }
}
