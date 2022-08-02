
public abstract class Work
{
    protected String m_workdescription;
    protected String m_nameworker;
    protected static int m_count;

    public Work() {
        ++m_count;
    }
    public Work(String work_description, String name_worker) {
        if(work_description == null || name_worker == null)
            throw new IllegalArgumentException("\nPROVIDE ALL CORRECT ARGUMENTS!!!");
        this.m_workdescription = work_description;
        this.m_nameworker = name_worker;
        ++m_count;
    }

    public String getWorkDescription() {
        return m_workdescription;
    }

    public String getNameWorker() {
        return m_nameworker;
    }

    public static int getCountWorks() {
        return m_count;
    }

    public void setWorkDescription(String work_description) {
        if(work_description != null)
            this.m_workdescription = work_description;
    }

    public void setNameWorker(String name_worker) {
        if(name_worker != null)
            this.m_nameworker = name_worker;
    }

    public abstract float getCost();

    @Override
    public String toString() {
        return m_workdescription + " (" + m_nameworker + ")";
    }

}
