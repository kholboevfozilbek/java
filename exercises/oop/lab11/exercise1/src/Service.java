

public class Service extends Process{

    protected String m_servicedescription;
    protected String m_servicemode;

    public Service() {
        super();
    }

    public Service(String process_name, String service_description, String service_mode) {
        super(process_name);
        switch (service_mode)
        {
            case "manual":
                this.m_servicemode = service_mode;
                break;
            case "automatic":
                this.m_servicemode = service_mode;
                break;
            default:
                throw new IllegalArgumentException("\nWRONG SERVICE MODE IS ENTERED!!!");
        }
        if(service_description == null)
            throw new IllegalArgumentException("\nSERVICE DESCRIPTION CAN NOT BE null!!!");
        this.m_servicedescription = service_description;
    }

    public String getServiceDescription() {
        return m_servicedescription;
    }

    public void setServiceDescription(String service_des) {
        if(service_des != null)
            this.m_servicedescription = service_des;
        else
            System.out.println("\nYOU CAN NOT PUT null TO SERVICE DESCRIPTION!!!");
    }

    public String getServiceMode() {
        return m_servicemode;
    }

    public void setServiceMode(String service_mode) {

        switch(service_mode)
        {
            case "manual":
                this.m_servicemode = service_mode;
                break;
            case "automatic":
                this.m_servicemode = service_mode;
                break;
            default:
                System.out.println("\nWRONG SERVICE MODE PROVIDED!!!");
                break;
        }
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
