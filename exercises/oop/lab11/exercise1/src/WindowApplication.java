

public class WindowApplication extends  Application
{
    protected int m_width;
    protected int m_length;

    public WindowApplication() {
        super();
    }

    public WindowApplication(String name, String owner_name, int width, int length) {
        super(name, owner_name);
        if(width <= 0 || length <= 0)
            throw new IllegalArgumentException("\nSCREEN DIMENTIONS CAN NOT BE <= 0!");

        this.m_width = width;
        this.m_length = length;
    }

    public int getWidth() {
        return m_width;
    }

    public void setWidth(int width) {
        if(width > 0)
            this.m_width = width;
        else
            System.out.println("\nSCREEN WIDTH CAN NOT BE <= 0!");
    }

    public int getLength() {
        return m_length;
    }

    public void setLength(int length) {
        if(length > 0)
            this.m_length = length;
        else
            System.out.println("\nSCREEN LENGTH CAN NOT BE <= 0!");
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
            throw new StopError("Process <" + this.getPIUD() + ", " + this.getProcessName() + "is not running" );
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
