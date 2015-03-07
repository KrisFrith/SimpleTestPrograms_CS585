import static org.junit.Assert.assertEquals;
import CS585ClassProject.SimpleCalculator;
import org.junit.Test;

public class SimpleCalculatorTest {
	
	SimpleCalculator simpleCalculator = new SimpleCalculator();
	
	@Test
	public void simpleCalculatorConstructorTest(){
		assertEquals(0, simpleCalculator.getAnswer());
	}
	
	@Test
	public void simpleCalculatorAddTest(){
		assertEquals(3,simpleCalculator.add(1,2));
	}

	@Test
	public void simpleCalulatorSubtractTest(){
		assertEquals(2, simpleCalculator.subtract(3, 1));
	}
	
	@Test
	public void simpleCalculatorMultiplyTest(){
		assertEquals(6, simpleCalculator.multiply(2, 3));
	}
	
	@Test
	public void simpleCalculatorDividTest(){
		assertEquals(3, simpleCalculator.divide(6, 2));
	}
}
