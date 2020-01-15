package prob2.main;

import prob2.Apartement;
import prob2.Building;
import prob2.LandLord;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LandLord landlord=new LandLord();
		Building bul=landlord.addBuilding(500);
		bul.addApartement(3000);
		bul.addApartement(2000);
		Building bul2=landlord.addBuilding(300);
		bul2.addApartement(4000);
		bul2.addApartement(5000);
		System.out.println("Total Income="+ landlord.totalProfit());

	}

}
