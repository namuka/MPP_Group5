package prob3;

public class VehicleFactory {
	
	public Vehicle getVehicle(String v) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Vehicle vh = (Vehicle) Class.forName("prob3."+v).newInstance(); 
		return vh;
	}
}
