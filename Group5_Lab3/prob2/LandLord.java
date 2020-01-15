package prob2;

import java.util.ArrayList;
import java.util.List;

public class LandLord {
	
	private List<Building> buildings;
	
	public LandLord() {
		buildings=new ArrayList<Building>();
	}

	public List<Building> getBuildings() {
		return buildings;
	}
	
	public Building addBuilding(double mcost) {
		Building bul=new Building(mcost);
		buildings.add(bul);
		return bul;
	}
	
	public double totalProfit() {
		double sum=0;
		for (Building building : buildings) {
			sum+=building.profit();
		}
		return sum;
	}
	
}
