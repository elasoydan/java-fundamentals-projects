package cmpe114;
public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Manager(
                "Manager101", 101, "ManagementOffice");

        employees[1] = new RandDEngineer(
                "RandDEngineer102", 102, "Research and Development");

        employees[2] = new ProductionManagerAssistant(
                "ProductionManagerAssistant103", 103);

        employees[3] = new RandDEngineer(
                "RandDEngineer104", 104, "Research and Development");

        employees[4] = new ProductionManagerAssistant(
                "ProductionManagerAssistant105", 105);

        for (Employee e : employees) {
            e.work();        
            e.takeBreak();

            if (e instanceof Manager) {
                ((Manager) e).approveBudget();
            } else if (e instanceof RandDEngineer) {
                ((RandDEngineer) e).fixError();
            } else if (e instanceof ProductionManagerAssistant) {
                ((ProductionManagerAssistant) e).manage();
            }

            System.out.println("-----------------");
        }
    }
}
