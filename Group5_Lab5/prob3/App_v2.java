package prob3_extpackage;

import java.util.ArrayList;
import java.util.List;

import prob3.Vehicle;
import prob3.VehicleFactory;


public class App {
	public static void main(String[] args) {		
		List<Vehicle> vehicles = new ArrayList<>();

		try {
			Vehicle v1 = new VehicleFactory().getVehicle("Bus");
			vehicles.add(v1);
			Vehicle v2 = new VehicleFactory().getVehicle("Car");
			vehicles.add(v2);
			Vehicle v3 = new VehicleFactory().getVehicle("Truck");
			vehicles.add(v3);
			Vehicle v4 = new VehicleFactory().getVehicle("ElectricCar");
			vehicles.add(v4);
			
			for(Vehicle v: vehicles) {
				v.startEngine();
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
