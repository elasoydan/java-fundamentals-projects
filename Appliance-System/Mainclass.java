package cmpe114;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainclass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Appliance> list = new ArrayList<>();

        while (true) {
            System.out.println("1. Store a new appliance");
            System.out.println("2. Delete the appliance");
            System.out.println("3. Display all appliances");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter appliance type (1 = Washer, 2 = Microwave): ");
                int type = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter brand: ");
                String brand = sc.nextLine();

                System.out.print("Enter wattage: ");
                int wattage = sc.nextInt();

                if (type == 1) { 
                    System.out.print("Enter capacity: ");
                    int capacity = sc.nextInt();

                    System.out.print("Enter water usage: ");
                    double waterUsage = sc.nextDouble();

                    System.out.print("Has dryer function? (true/false): ");
                    boolean dryer = sc.nextBoolean();

                    list.add(new Washer(brand, wattage, capacity, waterUsage, dryer));
                    System.out.println("Appliance added successfully.");

                } else { 
                	System.out.print("Enter volume: ");
                    int volume = sc.nextInt();

                    System.out.print("Has grill mode? (true/false): ");
                    boolean grill = sc.nextBoolean();

                    list.add(new Microwave(brand, wattage, volume, grill));
                    System.out.println("Appliance added successfully.");
                }

            } else if (choice == 2) {

                System.out.print("Enter appliance type (1 = Washer, 2 = Microwave): ");
                int type = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter brand: ");
                String brand = sc.nextLine();

                System.out.print("Enter wattage: ");
                int wattage = sc.nextInt();

                Appliance toDelete = null;

                if (type == 1) {
                    System.out.print("Enter capacity: ");
                    int cap = sc.nextInt();

                    System.out.print("Enter water usage: ");
                    double water = sc.nextDouble();

                    System.out.print("Has dryer function? (true/false): ");
                    boolean dryer = sc.nextBoolean();

                    toDelete = new Washer(brand, wattage, cap, water, dryer);

                } else {
                    System.out.print("Enter volume: ");
                    int volume = sc.nextInt();

                    System.out.print("Has grill mode? (true/false): ");
                    boolean grill = sc.nextBoolean();

                    toDelete = new Microwave(brand, wattage, volume, grill);
                }

                boolean removed = false;

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).equals(toDelete)) {
                        list.remove(i);
                        removed = true;
                        System.out.println("Appliance is deleted");
                        break;
                    }
                }

                if (!removed) System.out.println("Appliance not found.");

            } else if (choice == 3) {

                for (Appliance a : list) a.display();

            } else if (choice == 4) {

                Washer minW = null, maxW = null;
                Microwave minM = null, maxM = null;

                for (Appliance a : list) {
                    if (a instanceof Washer) {
                        Washer w = (Washer) a;
                        if (minW == null || w.getCapacity() < minW.getCapacity()) minW = w;
                        if (maxW == null || w.getCapacity() > maxW.getCapacity()) maxW = w;
                    } else {
                        Microwave m = (Microwave) a;
                        if (minM == null || m.getVolume() < minM.getVolume()) minM = m;
                        if (maxM == null || m.getVolume() > maxM.getVolume()) maxM = m;
                    }
                }

                if (minM != null) {
                    System.out.print("(Minimum Volume) ");
                    minM.display();
                }
                if (maxM != null) {
                    System.out.print("(Maximum Volume) ");
                    maxM.display();
                }
                if (minW != null) {
                    System.out.print("(Minimum Capacity) ");
                    minW.display();
                }
                if (maxW != null) {
                    System.out.print("(Maximum Capacity) ");
                    maxW.display();
                }

                System.out.println("Exiting system...");
                break;
            }
        }
    }
}
