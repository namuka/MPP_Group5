package prob3;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v= VehicleFactory.getVehicle("Car");
		v.startEngine();
		
		Vehicle v2= VehicleFactory.getVehicle("Truck");
		v2.startEngine();
		
		Vehicle v3= VehicleFactory.getVehicle("Bus");
		v3.startEngine();
		
		Vehicle v4= VehicleFactory.getVehicle("ElectricalCar");
		v4.startEngine();
	}

}
