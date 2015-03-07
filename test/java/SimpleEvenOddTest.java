import static org.junit.Assert.assertEquals;
import CS585ClassProject.SimpleEvenOdd;
import org.junit.Test;



public class SimpleEvenOddTest {
	SimpleEvenOdd simpleEvenOdd = new SimpleEvenOdd();
	
	@Test
	public void isEvenOddConstructorTest(){
		//SimpleEvenOdd simpleEvenOdd = new SimpleEvenOdd();
		assertEquals(false, simpleEvenOdd.isResult());
		
	}
	
	@Test
	public void isEvenOddResultTest(){
		//SimpleEvenOdd simpleEven
		assertEquals(true, simpleEvenOdd.isEvenNumber(2));
		
	}

}
