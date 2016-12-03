package Abstraction;

import Abstraction.CarAbstract;

public class Car extends CarAbstract{

	@Override
	public void stop() {
		System.out.println("This is stop");
		
	}

	@Override
	public void start() {
		System.out.println("This is start");
		
	}
	
	
	

}
