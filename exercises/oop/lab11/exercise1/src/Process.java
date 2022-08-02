
public abstract class Process
{
    protected static int m_count=0;
    protected int m_piud;
    protected String m_name;
    protected boolean m_running;
    protected boolean m_stop = true;

    public Process() {
        m_count++;
        m_piud = m_count;
    }
    public Process(String name) {
        if(name == null)
            throw new IllegalArgumentException("Process name can not be 0!");

        this.m_name = name;
        m_count++;
        m_piud = m_count;
    }

    public int getPIUD() {
        return m_piud;
    }

    public String getProcessName() {
        return m_name;
    }

    public void setProcessName(String name) {
        this.m_name = name;
    }

    public abstract void run();

    public abstract void stop();

    public abstract String getStatus();
}
