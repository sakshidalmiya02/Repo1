package firstproject;

public class Employee {
			//members
			//member variables
			// 1)class member/static
			//2) instance variable//non static member variable
			//member methods
			//1)instance/non static member variable/class/static
			int employeeId;//0-default value
			String empName;//null-default value for string
			
			//instance member variables are associated with objects
			
			//boolean---false
			
			static String orgName="Accenture"; //static variable
			
			public void init(int employeeId,String empName) {
				this.employeeId=employeeId;
				this.empName=empName;
			}
}
