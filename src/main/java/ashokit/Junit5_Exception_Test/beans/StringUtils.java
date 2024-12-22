package ashokit.Junit5_Exception_Test.beans;

public class StringUtils {
	
	public static Integer convertToInt(String str) {
		if(str==null||str.trim().length()==0) {
			throw new IllegalArgumentException("String must not be null or empty");
			
		}
		else {
			return Integer.valueOf(str);
		}
	}

}
