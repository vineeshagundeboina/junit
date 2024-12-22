package ashokit.junit_app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import ashokit.junit_app.beans.Calculator;

public class CalculatorTest {

	
		// TODO Auto-generated method stub
		
		@Test
		public void addTest() {
			Calculator calc=new Calculator();
			Integer actualResult=calc.add(10, 20);
			
			Integer expectedResult=60;
			assertEquals(expectedResult, actualResult);
			
			
					
		}
		
		
		@Test
		public void multiplyTest() {
			Calculator calc=new Calculator();
			
			Integer actualResult=calc.multiply(3, 5);
			Integer expectedResult=15;
			assertEquals(expectedResult, actualResult);
		}

	

}
