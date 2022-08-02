
public class Student implements Comparable<Student>
{
    private String m_surname;
    private String m_name;
    private int m_id;
    private float m_grade;

    public Student() {

    }

    public Student(String surname, String name, int id, float grade) {
        this.m_surname = surname;
        this.m_name = name;
        this.m_id = id;
        this.m_grade = grade;
    }

    public String getM_surname() {
        return m_surname;
    }

    public void setM_surname(String m_surname) {
        this.m_surname = m_surname;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public float getM_grade() {
        return m_grade;
    }

    public void setM_grade(float m_grade) {
        this.m_grade = m_grade;
    }

    public void setALL(String surname, String name, int id, float grade) {
        m_surname = surname;
        m_name = name;
        m_id = id;
        m_grade = grade;
    }

    @Override
    public String toString() {
        return "\nname: " + m_name + " " + m_surname + " " + m_id + " " + m_grade;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getM_id() == o.getM_id())
            return 0;
        else if(this.getM_id() > o.getM_id())
            return 1;
        else
            return -1;
    }
}
