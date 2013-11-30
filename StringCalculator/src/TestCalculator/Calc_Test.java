package TestCalculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

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
	
	@Test
	public void AddTwoValues()
	{
		Str_Calculator cal = new Str_Calculator();
		int result = cal.Add("1,2");
		
		assertEquals(3, result);
	}

	@Test
	public void AddUnknownNumbers()
	{
		Str_Calculator cal = new Str_Calculator();
		int result = cal.Add("1,2,3,4,5,6,7,8,9");
		
		assertEquals(45, result);	
	}
	
	@Test
	public void NewLineHandle()
	{
		Str_Calculator cal = new Str_Calculator();
		int result = cal.Add("1\n2,3\n4,5,6\n7,8\n9,10");
		
		assertEquals(55, result);	
	}
	
	@Test
	public void AnyDelimitersHandling()
	{
		Str_Calculator cal = new Str_Calculator();
		int result = cal.Add("1;2$3\n4,5//6");
		
		assertEquals(21, result);
	}

}
