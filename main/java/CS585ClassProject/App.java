package CS585ClassProject;

import CS585ClassProject.SimpleEvenOdd;
import CS585ClassProject.SimpleCalculator;

public class App {

	public static void main(String[] args) {
		SimpleEvenOdd simpleEvenOdd = new SimpleEvenOdd();
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		
		
		boolean isEven = simpleEvenOdd.isEvenNumber(2);
		System.out.println(isEven);
		
		int addition = simpleCalculator.add(1, 2);
		System.out.println(addition);
		
		int subtraction = simpleCalculator.subtract(3, 2);
		System.out.println(subtraction);
		
		int multiplication = simpleCalculator.multiply(2, 3);
		System.out.println(multiplication);
		
		int division = simpleCalculator.divide(4, 2);
		System.out.println(division);
		

		

	}

}
