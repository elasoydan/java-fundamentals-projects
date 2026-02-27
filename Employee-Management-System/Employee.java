package cmpe114;
public class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void work() {
        System.out.println("Employee " + name + " is working.");
    }

    public void takeBreak() {
        System.out.println("Employee " + name + " is taking a break.");
    }
}
