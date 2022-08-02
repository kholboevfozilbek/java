
public class ConsoleApplication extends  Application
{
    protected String m_textencoding;

    public ConsoleApplication() {
        super();
    }

    public ConsoleApplication(String name, String owner_name, String text_encoding) {
        super(name, owner_name);
        this.m_textencoding = text_encoding;
    }

    public String getTextEncoding() {
        return m_textencoding;
    }

    public void setTextEncoding(String text_encoding) {
        this.m_textencoding = text_encoding;
    }


    @Override
    public void run() {
        if(m_running == true)
            throw new RunError("Process <" + this.getPIUD() + ", " + this.getProcessName() + " already started");
        m_running = true;
        m_stop = false;
    }

    @Override
    public void stop() {
        if(m_stop == true)
            throw new StopError("Process <" + this.getPIUD() + ", " + this.getProcessName() + ">" + " is not running" );
        m_running = false;
        m_stop = true;
    }

    @Override
    public String getStatus() {
        if(m_running == true)
            return "running";
        return "stopped";
    }

}
