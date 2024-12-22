package in.ashokit.REST_API_JUNIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.REST_API_JUNIT.service.WelcomeService;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private WelcomeService welcomeService;
	
	
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getMsg(){
		return ResponseEntity.ok(welcomeService.getMessage());
	}

}
