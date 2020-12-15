package rd.epam.com;

public class Student {

    private final static String SPACE = " ";
    private String name;
    private String secondName;
    private String lastName;
    private Group group;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return secondName + SPACE + name + SPACE + lastName + SPACE + group;
    }
}
