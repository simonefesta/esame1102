package test;
//Optimistic Coverage
//The program converts an int value to its char value.
//The test case checks for the correctness of the conversion from int 65 and relative char value, ‘A’.
//According to the Ascii table, we can convert an int value between 0 and 255. It’s not possibile to convert other values.
//The bug is not discovered because we test an int value included in the Ascii table.
import logic.AsciiTable;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAsciiConverter {
	
	@Test
	public void TestConvertInvalidInput()
	{
	  AsciiTable x = new AsciiTable();
	  char output   = x.ConvertIntAscii(65);
	  char atteso   = 'A';
	  
	  assertEquals(atteso, output);
	  
	  
	}
	

}
