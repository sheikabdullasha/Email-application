package projectEmail;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email gmail=new Email("sheik","Abu");
		System.out.println(gmail.EmployeeDetails());
		gmail.setAlternateEmail("sheik11abu10@gmail.com");
		System.out.println(gmail.EmployeeDetails());

		
	}

}
