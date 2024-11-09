package VehicleFactoryPackage;

public class VehicleFactory {
    VehicleFactory vf;

    public VehicleInterface getObj(String type){

        
        switch(type){
            case "luxury" : return new LuxuryVehicle();
            case "ordinary" : return new OrdinaryVehicle();
            default: return null;
        }

    }


}
