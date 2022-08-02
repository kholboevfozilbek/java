
public class EmailEntry extends Entry
{
    private String m_email;

    public EmailEntry() {
        super();
    }

    public EmailEntry(String des, String email) {
        super(des);

        m_email = email;
    }

    @Override
    public String getContents() {
        return super.m_description + ":  e-mail " + m_email;
    }

    public String getEmail() {
        return m_email;
    }

    public void setEmail(String e) {
        this.m_email = e;
    }
}
