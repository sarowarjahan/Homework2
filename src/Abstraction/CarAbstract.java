package Abstraction;

public abstract class CarAbstract implements Types {
	
	
	public void Cartype1(){
		System.out.println("car type1"); 
	}
	public void Cartype2(){
		System.out.println("car type2"); 
	}
	
	public abstract void stop();
	public abstract void start();
	

}


