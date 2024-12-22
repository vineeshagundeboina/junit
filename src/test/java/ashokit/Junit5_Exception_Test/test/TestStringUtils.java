package ashokit.Junit5_Exception_Test.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ashokit.Junit5_Exception_Test.beans.StringUtils;

public class TestStringUtils {
	
	@Test
	public void testConvertToInt() {
		String st=null;
		assertThrows(IllegalArgumentException.class, ()->StringUtils.convertToInt(st));
	}

}
