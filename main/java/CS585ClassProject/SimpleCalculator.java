package CS585ClassProject;

public class SimpleCalculator {
	private int answer;
	
	public SimpleCalculator(){
		answer = 0;
	}

	public int add(int num1, int num2){
		answer = num1 + num2;
		return answer;
	}
	
	public int subtract(int num1, int num2){
		answer = num1 - num2;
		return answer;
	}
	
	public int multiply(int num1, int num2){
		answer = num1 * num2;
		return answer;
	}
	
	public int divide(int num1, int num2){
		answer = num1 / num2;
		return answer;
	}
}
