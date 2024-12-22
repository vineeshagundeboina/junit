package ashokit.Junit5_Power_Mockito_App.service;

import ashokit.Junit5_Power_Mockito_App.dao.UserDao;

public class UserService {
	
	private UserDao dao;
	
	
	public UserService(UserDao dao) {
		this.dao=dao;
	}
	
	
	public String getNameByUserId(Integer id) {
		String name=dao.findNameById(id);
		return name;
	}
	
	public String getEmailByUserId(Integer id) {
		String email=dao.findEmailById(id);
		return email;
	}

}
