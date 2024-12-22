package in.ashokit.REST_API_JUNIT.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.ashokit.REST_API_JUNIT.controller.WelcomeRestController;
import in.ashokit.REST_API_JUNIT.service.WelcomeService;

@WebMvcTest(value = WelcomeRestController.class)
public class WelcomeRestControllerTest {

	@MockBean
	private WelcomeService welcomeService;
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testWelcomeMSg() throws Exception {
		when(welcomeService.getMessage()).thenReturn("Good Morning");
		
		MockHttpServletRequestBuilder reqBuilder= MockMvcRequestBuilders.get("/welcome");
		ResultActions perform=mockMvc.perform(reqBuilder);
		
		MvcResult mvcResult=perform.andReturn();
		
		MockHttpServletResponse response=mvcResult.getResponse();
		int status=response.getStatus();
		assertEquals(200, status);
	
	
	}
	
	

}
