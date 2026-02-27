package cmpe114;

public abstract class HeadOfficeEmployee extends Employee {
    protected String department;

    public HeadOfficeEmployee(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    public abstract void attendMeeting();
}


