package cmpe114;

public class Microwave extends Appliance{
	
	private int volume;
	private boolean hasGrillMode;

	    public Microwave(String brand, int wattage, int volume, boolean hasGrillMode) {
	        super(brand, wattage);
	        this.volume = volume ;
	        this.hasGrillMode = hasGrillMode; 
	    }

	   /* @Override
	    public void turnOn() {
	        System.out.println("Microwave “brand” is heating using X watts.);
	    }

	    public void defrost() {
	        System.out.println("Microwave “brand” is defrosting food.");
	    } */

	        @Override
	        public boolean equals(Appliance other) {
	            if (!(other instanceof Microwave)) return false;

	            Microwave m = (Microwave) other;

	            return this.brand.equals(m.brand) &&
	                   this.wattage == m.wattage &&
	                   this.volume == m.volume &&
	                   this.hasGrillMode == m.hasGrillMode;
	        }

	        @Override
	        public int compareTo(Appliance other) {
	            Microwave m = (Microwave) other;

	            if (m.volume > this.volume) return -1;
	            else if (this.volume > m.volume) return 1;
	            else return 0;
	        }

	        @Override
	        public void display() {
	            System.out.println("Microwave: brand: " + brand +
	                    ", wattage: " + wattage +
	                    ", volume: " + volume +
	                    ", hasGrillMode: " + hasGrillMode);
	        }

	        public int getVolume() {
	            return volume;
	        }
	    }

	

