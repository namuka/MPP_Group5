package prob4;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		/*for (Object o : properties) {
			if (o instanceof House) {
				House h = (House) o;
				totalRent += h.computeRent();
			}
			else if (o instanceof Condo) {
				Condo h = (Condo) o;
				totalRent += h.computeRent();
			}
			else if (o instanceof Trailer) {
				Trailer h = (Trailer) o;
				totalRent += h.computeRent();
			}	
		}*/
		for(Property p: properties) {
			totalRent += p.computeRent();
		}
		return totalRent;
	}
	
	public static List<Property> getProperties(Property[] properties, String c) {
		List<Property> list = new ArrayList<Property>();
		for(Property p: properties) {
			if(p.getCity().equals(c)) list.add(p);
		}
		return list;
	}
}
