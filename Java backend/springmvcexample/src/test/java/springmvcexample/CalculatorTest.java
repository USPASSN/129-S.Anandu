package springmvcexample;

import static org.junit.Assert.*;

import org.junit.Test;

import springmvcexample.utility.Calculator;

public class CalculatorTest {

		@Test
		public void testAdd() {
			Calculator cal=new Calculator();
			assertTrue(cal.add(8, 8)==16);
			
		}
	@Test
		public void testSub() {
			Calculator cal=new Calculator();
			assertTrue(cal.sub(8, 7)==1);
			
		}

		

	}


