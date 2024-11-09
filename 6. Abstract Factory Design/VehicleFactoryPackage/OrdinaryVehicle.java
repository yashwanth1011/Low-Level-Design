package VehicleFactoryPackage;
import VehiclePackage.Maruti;
import VehiclePackage.Swift;
import VehiclePackage.Vehicle;


public class OrdinaryVehicle implements VehicleInterface{

    @Override
    public Vehicle getCar(String carName){
        switch(carName){
            case "maruti" : return new Maruti();
            case "swift" : return new Swift();
            default: return null;            
        }
    }

    @Override
    public void carCompany(){
        System.out.println("Select the Car Company. You have\n1. Maruti\n2. Swift");
    }

    
}
