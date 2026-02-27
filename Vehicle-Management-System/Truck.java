package cmpe114;

public class Truck extends Vehicle {

    public Truck(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println("Truck " + name + " is driving at speed " + speed + ".");
    }

    public void honk() {
        System.out.println("Truck " + name + " is honking.");
    }
}


