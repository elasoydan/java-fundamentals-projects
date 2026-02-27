package cmpe114;

public class RandDEngineer extends HeadOfficeEmployee {

    public RandDEngineer(String name, int id, String department) {
        super(name, id, department);
    }

    @Override
    public void work() {
        System.out.println("RandDEngineer " + name +
                " is designing for the " + department + " department.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("RandDEngineer " + name +
                " is attending a technical meeting.");
    }

    public void fixError() {
        System.out.println("RandDEngineer " + name + " fixed an error.");
    }
}