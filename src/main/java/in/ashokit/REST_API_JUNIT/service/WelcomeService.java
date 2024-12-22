package in.ashokit.REST_API_JUNIT.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	
	public String getMessage() {
		return "welcome to the junit rest api's !!";
	}

}
