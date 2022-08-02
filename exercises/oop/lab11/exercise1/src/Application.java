
public abstract class Application extends Process
{
    protected String m_ownername;

    public Application() {

    }

    public Application(String name, String owner_name) {
        super(name);
        this.m_ownername = owner_name;
    }

}
