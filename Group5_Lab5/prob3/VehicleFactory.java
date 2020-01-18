package prob3;

public class VehicleFactory {

	private VehicleFactory() {}
	
	public static Vehicle getVehicle(String v) {
		Vehicle vehicle=null;
		if(v.equals("Bus")) {
			vehicle=new Bus();
		}else if(v.equals("Truck")) {
			vehicle=new Truck();
		}else if(v.equals("Car")) {
			vehicle=new Car();
		}else if(v.equals("ElectricalCar")) {
			vehicle=new ElectricalCar();
		}
		return vehicle;
	}
}
