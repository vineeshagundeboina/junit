package ashokit1.junit5;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import ashokit1.junit5.beans.Polindrome;

public class PolindromeTest {
	
	
	@ParameterizedTest
	@ValueSource(strings= {"racecar","radar","madam","vinni"})
	public void testPolindrome(String str) {
		Polindrome p=new Polindrome();
		boolean actual=p.isPolindrome(str);
		assertTrue(actual);
		
	}

}
