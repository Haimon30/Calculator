package TestCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calc_Test {

	@Test
	public void AddEmptyString() {
		
		Str_Calculator cal = new Str_Calculator();
		int result = cal.Add("");
		
		assertEquals(0, result);
	}
	
	@Test
	public void AddOneValue()
	{
		Str_Calculator cal = new Str_Calculator();
		int result = cal.Add("1");
		
		assertEquals(1, result);
	}

}
