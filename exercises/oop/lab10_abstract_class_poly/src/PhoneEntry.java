
public class PhoneEntry extends Entry
{
    private String m_phonenumber;

    public PhoneEntry() {
        super();
    }

    public PhoneEntry(String des, String phone) {
        super(des);

        m_phonenumber = phone;
    }
    @Override
    public String getContents() {
        return super.m_description + ": phone " + m_phonenumber;
    }

    public String getPhonenumber() {
        return m_phonenumber;
    }

    public void setPhonenumber(String p) {
        this.m_phonenumber = p;
    }
}
