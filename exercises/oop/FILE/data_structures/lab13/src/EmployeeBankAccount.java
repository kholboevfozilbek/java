
public class EmployeeBankAccount
{
    private String m_name;
    private float m_salary;
    private String m_accountnumber;

    EmployeeBankAccount() {

    }

    public EmployeeBankAccount(String name, float salary, String accountnumber) {
        this.m_name = name;
        this.m_salary = salary;
        this.m_accountnumber = accountnumber;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public float getM_salary() {
        return m_salary;
    }

    public void setM_salary(float m_salary) {
        this.m_salary = m_salary;
    }

    public String getM_accountnumber() {
        return m_accountnumber;
    }

    public void setM_accountnumber(String m_accountnumber) {
        this.m_accountnumber = m_accountnumber;
    }

    public void setAll(String name, float salary, String accountnumber) {
        this.m_name = name;
        this.m_salary = salary;
        this.m_accountnumber = accountnumber;
    }

    @Override
    public String toString() {
        return m_accountnumber + "\n" + m_name + "\n" + m_salary;
    }
}
