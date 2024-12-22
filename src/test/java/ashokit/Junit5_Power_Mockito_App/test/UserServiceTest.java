package ashokit.Junit5_Power_Mockito_App.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;

import ashokit.Junit5_Power_Mockito_App.dao.UserDao;
import ashokit.Junit5_Power_Mockito_App.service.UserService;

public class UserServiceTest {
	
	@Test
	public void testGetNameByUserId() {
		UserDao mockDao=PowerMockito.mock(UserDao.class);
		PowerMockito.when(mockDao.findNameById(101)).thenReturn("Nick");
		
		UserService service=new UserService(mockDao);
		
		String name=service.getNameByUserId(101);
		assertEquals("Nick", name);
	}

}
