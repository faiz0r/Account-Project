package banking;

public class banking {

	public static void main(String[] args) {
		System.out.println("Account Project");
		
		person Faizan = new person("Faizan", "Zaheer");
		service s = new service();
		s.addUser(Faizan);
		

		//System.out.println("Hello" + " '" + p.getFirstname() + " " + p.getLastName() + "' and Welcome to Banking");
		
		
	}

}
