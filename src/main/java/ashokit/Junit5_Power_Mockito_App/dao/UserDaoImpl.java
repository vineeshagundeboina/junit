package ashokit.Junit5_Power_Mockito_App.dao;

public class UserDaoImpl implements UserDao{
	
	public String findNameById(Integer id) {
		System.out.println("findNameById method called");
		return "jhon";
	}
	
	public String findEmailById(Integer id) {
		System.out.println("findEmailById method called");
		return"jhon.k@gmail.com";
	}

}
