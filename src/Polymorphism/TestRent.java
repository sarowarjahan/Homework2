package Polymorphism;

public abstract class TestRent {

	public static void main(String[] args) {
		
		HouseRent houserent = new HouseRent();
		int Ehouserent = houserent.HouseRent(18, 12, 35);
		System.out.println(Ehouserent);
		
		int Dhouserent = houserent.HouseRent(11, 29, 40, 60);
		System.out.println(Dhouserent);
		
		ExtraHouseRent extraHouserent = new ExtraHouseRent();
		int brent = extraHouserent.ExtraHouseRent(10, 25, 30);
		System.out.println(brent);
				

	}

}
