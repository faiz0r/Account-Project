package banking;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

	public static void main(String[] args) {
		System.out.println("Account Project");

		ObjectMapper objectMapper = new ObjectMapper();
		Person Faizan = new Person(1, "Faizan", "Zaheer");
		Person Jason = new Person(2, "Jason", "Bourne");
		Service s = new Service();
		s.addUser(Faizan);
		s.addUser(Jason);
		try {
			String personAsString = objectMapper.writeValueAsString(s.hmap);
			System.out.println(personAsString);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
