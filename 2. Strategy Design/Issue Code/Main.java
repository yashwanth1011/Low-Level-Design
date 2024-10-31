
class Vehicle{
    void drive(){
        System.out.println("Total Capacity is 4");
        
    }
}

class SportVehicle extends Vehicle{
    void drive(){
        System.out.println("Total Capacity is 2");
        
    }
}

class PassengerVehicle extends Vehicle{
    void drive(){
        System.out.println("Total Capacity is 4"); 
    }
}

class OffRoadVehicle extends Vehicle{
    void drive(){
        System.out.println("Total Capacity is 2"); 
    }
}



public class Main
{
	public static void main(String[] args) {
		SportVehicle sv = new SportVehicle();
		sv.drive();
		
		PassengerVehicle pv = new PassengerVehicle();
		pv.drive();
		
		OffRoadVehicle orv = new OffRoadVehicle();
		orv.drive();
		
	}
}