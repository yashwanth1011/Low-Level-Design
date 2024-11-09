package VehicleFactoryPackage;

import VehiclePackage.GTR;
import VehiclePackage.Lambo;
import VehiclePackage.Vehicle;

public class LuxuryVehicle implements VehicleInterface{

    @Override
    public Vehicle getCar(String carName){
        switch(carName){
            case "GTR" : return new GTR();
            case "lambo" : return new Lambo();
            default: return null;
            
        }
    }


    @Override
    public void carCompany(){
        System.out.println("Select the Car Company. You have\n1. Lambo\n2. GTR");

    }

    
}
