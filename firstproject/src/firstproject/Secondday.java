package firstproject;

public class Secondday {

	public static void main(String[] args) {
		
		System.out.println(Employee.orgName);
		Employee e=new Employee();
		e.init(10001, "Rakesh");
		System.out.println(e.employeeId+" "+e.empName);
	}
}
