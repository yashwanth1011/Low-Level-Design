import java.util.Scanner;

import VehicleFactoryPackage.VehicleFactory;
import VehicleFactoryPackage.VehicleInterface;
import VehiclePackage.Vehicle;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select Which Type of Car You want:\n1. Luxury\n2. Ordinary");
        String type = in.next();
        VehicleFactory vf = new VehicleFactory();
        VehicleInterface VI = vf.getObj(type);
        VI.carCompany();
        String carName = in.next();
        Vehicle vehicle = VI.getCar(carName);
        vehicle.driving();

        
        in.close();
        
        
    }
    
}
