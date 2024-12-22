package in.ashokit.REST_API_JUNIT.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.REST_API_JUNIT.controller.BookRestController;
import in.ashokit.REST_API_JUNIT.entity.Book;
import in.ashokit.REST_API_JUNIT.service.BookService;

@WebMvcTest(value=BookRestController.class)
public class TestBookRestController {
	
	@MockBean
	private BookService bookService;
	
	@Autowired
	private MockMvc mockMvc;
	
	
	
	@Test
	public void testAddBook() throws Exception {
		
		when(bookService.saveBook(ArgumentMatchers.any())).thenReturn(true);
		Book book=new Book(101,"spring",450.00);
		ObjectMapper mapper=new ObjectMapper();
	
		String bookJson=mapper.writeValueAsString(book);
		
		MockHttpServletRequestBuilder reqBuilder=MockMvcRequestBuilders.post("/addBook").contentType(MediaType.APPLICATION_JSON).content(bookJson);
		
		ResultActions perform=mockMvc.perform(reqBuilder);
		MvcResult andReturn=perform.andReturn();
		MockHttpServletResponse response=andReturn.getResponse();
		
		int status=response.getStatus();
		assertEquals(201, status);
				
		
		
	}
	
	
	@Test
	public void testAddBook1() throws Exception {
		
		when(bookService.saveBook(ArgumentMatchers.any())).thenReturn(false);
		Book book=new Book(101,"spring",450.00);
		ObjectMapper mapper=new ObjectMapper();
	
		String bookJson=mapper.writeValueAsString(book);
		
		MockHttpServletRequestBuilder reqBuilder=MockMvcRequestBuilders.post("/addBook").contentType(MediaType.APPLICATION_JSON).content(bookJson);
		
		ResultActions perform=mockMvc.perform(reqBuilder);
		MvcResult andReturn=perform.andReturn();
		MockHttpServletResponse response=andReturn.getResponse();
		
		int status=response.getStatus();
		assertEquals(400, status);
				
		
		
	}


}
