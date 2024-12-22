package ashokit.Junit5_CSV_Parameterized_Test_App;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class EvenOddTest {
	
	@ParameterizedTest
	@CsvFileSource(resources="/data.csv",numLinesToSkip=1)
	public void testEvenOdd(String input,String expected) {
		System.out.println(input);
		EvenOdd e=new EvenOdd();
		String actualResult=e.evenOrOdd(Integer.parseInt(input));
		assertEquals(expected, actualResult);
		
	}

}
