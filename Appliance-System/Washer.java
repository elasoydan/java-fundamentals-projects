package cmpe114;

public class Washer extends Appliance {

    private int capacity;
    private double waterUsage;
    private boolean hasDryerFunction;

    public Washer(String brand, int wattage, int capacity, double waterUsage, boolean hasDryerFunction) {
        super(brand, wattage);
        this.capacity = capacity;
        this.waterUsage = waterUsage;
        this.hasDryerFunction = hasDryerFunction;
    }
    
    /*@Override 
    public void turnOn() {
    	System.out.println("Washer “brand” is washing using X watts.");
    }
    
    @Override
    public void spin(){
    	System.out.println("Washer “brand” is spinning clothes.");
    } */

    @Override
    public boolean equals(Appliance other) {
        if (!(other instanceof Washer)) return false;

        Washer w = (Washer) other;

        return this.brand.equals(w.brand) &&
               this.wattage == w.wattage &&
               this.capacity == w.capacity &&
               this.waterUsage == w.waterUsage &&
               this.hasDryerFunction == w.hasDryerFunction;
    }

    @Override
    public int compareTo(Appliance other) {
        Washer w = (Washer) other;

        if (w.capacity > this.capacity) return -1;
        else if (this.capacity > w.capacity) return 1;
        else return 0;
    }

    @Override
    public void display() {
        System.out.println("Washer: brand: " + brand +
                ", wattage: " + wattage +
                ", capacity: " + capacity +
                ", waterUsage: " + waterUsage +
                ", hasDryerFunction: " + hasDryerFunction);
    }

    public int getCapacity() {
        return capacity;
    }
}
