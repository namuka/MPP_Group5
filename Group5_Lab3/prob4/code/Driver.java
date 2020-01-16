package prob4;

import java.util.List;

public class Driver {

	public static void main(String[] args) {

		//Object[] objects = { new House(9000), new Condo(2), new Trailer() };
		Property[] properties = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println("Total Rent: ");
		System.out.println(totalRent);
		
		Property[] properties2 = { new House(9000), new Condo(2), new Trailer(),new House(7000), new Condo(5), new Trailer() };
		properties2[0].getAddress().setCity("Fairfield");
		properties2[1].getAddress().setCity("Fairfield");
		properties2[2].getAddress().setCity("Fairfield");
		properties2[3].getAddress().setCity("Fairfield");
		properties2[4].getAddress().setCity("Chicago");
		properties2[5].getAddress().setCity("Chicago");
		List<Property> list = Admin.getProperties(properties2, "Fairfield");
		System.out.println("Properties in Fairfield city");
		System.out.println(list);
		
		List<Property> list2 = Admin.getProperties(properties2, "Chicago");
		System.out.println("Properties in Chicago city");
		System.out.println(list2);
	}
}
