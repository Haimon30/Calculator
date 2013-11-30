package TestCalculator;

public class Str_Calculator 
{
	public int Add(String numbers) 
	{
		int num1, num2, result=0;
		String[] tmp;
		
		if(numbers.length() == 0)
		{
			return 0;
		}  
		
		if(numbers.length() == 1)
		{
			num1 = Integer.parseInt(numbers);
			return num1;
		}
		
		tmp = numbers.split("[,\n]+");
		if(tmp.length == 2)
		{
			num1 = Integer.parseInt(tmp[0]);
		
			if(tmp.length >= 2)
				num2 = Integer.parseInt(tmp[1]);
			else
				num2 = 0;
			return num1 + num2;
		}
		
		for(int i=0; i < tmp.length; i++)
			result += Integer.parseInt(tmp[i]);
		
		return result;

	}
}
