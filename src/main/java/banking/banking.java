package banking;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class banking {

	public static void main(String[] args) {
		System.out.println("Account Project");
		
		ObjectMapper objectMapper = new ObjectMapper();
		person Faizan = new person("Faizan", "Zaheer");
		service s = new service();
		s.addUser(Faizan);
		try {
			String personAsString = objectMapper.writeValueAsString(Faizan);
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
