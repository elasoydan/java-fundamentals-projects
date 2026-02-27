package cmpe114;

public abstract class Vehicle {

    protected String name;
    protected int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println("Vehicle is moving at speed " + speed + ".");
    }

    public void stop() {
        System.out.println("Vehicle has stopped.");
    }
}
