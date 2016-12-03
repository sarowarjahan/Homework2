package Abstraction;

import Abstraction.Car;
import Abstraction.CarAbstract;

public class TestCar {

public static void main(String[] args) {
		
		CarAbstract carStatus = new Car();
		carStatus.stop();
		carStatus.start();

	}

}
