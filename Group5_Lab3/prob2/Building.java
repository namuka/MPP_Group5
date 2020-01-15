package prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	
	private double mcost;
	private List<Apartement> apartements;
	
	Building(double mcost) {
		this.mcost=mcost;
		apartements=new ArrayList<Apartement>();
	}
	
	public void addApartement(double rent) {
		apartements.add(new Apartement(rent));
	}
	
	public double profit() {
		double sum=0;
		for (Apartement apartement : apartements) {
			sum+=apartement.getRent();
		}
		return sum-mcost;
	}

	public double getMcost() {
		return mcost;
	}

	public List<Apartement> getApartements() {
		return apartements;
	}
	
}
