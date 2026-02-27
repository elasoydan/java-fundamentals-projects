package cmpe114;
public class ProductionManagerAssistant extends Employee {

    public ProductionManagerAssistant(String name, int id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(
            "Production Manager Assistant " + name +
            " is assisting the tasks."
        );
    }

    public void manage() {
        System.out.println(
            "Production Manager Assistant " + name +
            " is managing the tasks."
        );
    }
}
