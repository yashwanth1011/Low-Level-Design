interface VehicleStrategy{
    void drive();
}

class sportStrategy implements VehicleStrategy{
    @Override
    public void drive(){
        System.out.println("Passenger with 2 Capacity");
    }
    
}

class normalStrategy implements VehicleStrategy{
    @Override
    public void drive(){
        System.out.println("Passenger with 4 Capacity");
    }
    
}

class Vehicle{
    
    VehicleStrategy obj;
    Vehicle(VehicleStrategy obj){
        this.obj = obj;
    }
    public void drive(){
        obj.drive();
    }
}

class SportVehicle extends Vehicle{
    SportVehicle(){
        super(new sportStrategy());
    }
  
}

class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new normalStrategy());
    }
   
}

class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new sportStrategy());
    }
}



public class Main
{
	public static void main(String[] args) {
	    Vehicle vehicle = new OffRoadVehicle();
	    vehicle.drive();
        vehicle = new SportVehicle();
        vehicle.drive();
	    vehicle = new PassengerVehicle();
	    vehicle.drive(); 
	}
}