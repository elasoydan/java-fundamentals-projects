package cmpe114;

public class Mainn {
	    public static void main(String[] args) {

	        Vehicle[] truckArray = new Vehicle[2];
	        truckArray[0] = new Truck("TruckObject1", 20);
	        truckArray[1] = new Truck("TruckObject2", 10);

	        for (Vehicle v : truckArray) {
	            v.move();
	            v.stop();

	            if (v instanceof Truck) {
	                ((Truck) v).honk();
	            }
	        }

	        Vehicle[] motorArray = new Vehicle[2];
	        motorArray[0] = new Motorbike("MotorbikeObject1", 50);
	        motorArray[1] = new Motorbike("MotorbikeObject2", 40);

	        for (Vehicle v : motorArray) {
	            v.move();
	            v.stop();

	            if (v instanceof Motorbike) {
	                ((Motorbike) v).honk();
	            }
	        }
	    }
	}

