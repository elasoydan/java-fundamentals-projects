package cmpe114;

public abstract class Appliance {
	
	protected String brand;
	protected int wattage;
	
	public Appliance(String brand, int wattage) {
		this.brand = brand;
		this.wattage = wattage;
	}
	
	/*public void turnOn() {
		System.out.println("Appliance is now on using X watts.");
	}
	
	public void turnOff() {
		System.out.println("Appliance has been turned off.");
	}*/
	
	    public abstract int compareTo(Appliance other);
	    public abstract boolean equals(Appliance other);

	    public abstract void display();
	}

	


