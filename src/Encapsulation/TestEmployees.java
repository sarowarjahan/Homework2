package Encapsulation;

public class TestEmployees {

	public static void main(String[] args) {
		Employees emp1 = new Employees ();
		emp1.setEmployeesID(101);
		emp1.setEmployeesName("joy");
		emp1.setEmployeesSalary("4000");
		
		System.out.println(emp1.getEmployeesID()+" "+emp1.getEmployeesName()+" "+emp1.getEmployeesSalary());
		
		
		
		
		
	}

}
