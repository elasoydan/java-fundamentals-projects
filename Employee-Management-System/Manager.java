package cmpe114;
public class Manager extends HeadOfficeEmployee {

    public Manager(String name, int id, String department) {
        super(name, id, department);
    }

    @Override
    public void work() {
        System.out.println("Manager " + name +
                " is managing the " + department + " department.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager " + name +
                " is attending a strategic meeting.");
    }

    public void approveBudget() {
        System.out.println("Manager " + name + " approved the budget.");
    }
}

