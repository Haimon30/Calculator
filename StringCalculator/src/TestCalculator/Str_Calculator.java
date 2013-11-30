package TestCalculator;

public class Str_Calculator 
{
	public int Add(String numbers) 
	{
		int num1, num2;
		
		if(numbers.length() == 0)
		{
			return 0;
		}  
		
		num1 = Integer.parseInt(numbers);
		
		return num1;
	}
}
