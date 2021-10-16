import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestAdd {
	private Calculator calculator;

	@Test
	public void Addtest() {
	
		Calculator calculator=new Calculator();
		
	}
	public  void emptyStringReturnZero()
	 {
		 assertEquals(calculator.calculate(""),0);
	 }
	public void SingleValueReplies()
	{
		assertEquals(calculator.calculate("1"),1);
	}
		
		

	}


