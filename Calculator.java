
public class Calculator 
{

	
	public int calculate(String str)
	{
		if(isEmpty(str))
		{
			return 0;
		}
		return StringToInt(str);
	}
	
	
	private boolean isEmpty(String input)
	{
		return input.isEmpty();
		
	}
	
	private int StringToInt(String input)
	{
		return Integer.parseInt(input);
	}
}
