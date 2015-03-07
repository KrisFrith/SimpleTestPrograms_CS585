package CS585ClassProject;

public class SimpleCalculator {
	private int answer;
	
	public SimpleCalculator(){
		setAnswer(0);
	}

	public int add(int num1, int num2){
		setAnswer(num1 + num2);
		return getAnswer();
	}
	
	public int subtract(int num1, int num2){
		setAnswer(num1 - num2);
		return getAnswer();
	}
	
	public int multiply(int num1, int num2){
		setAnswer(num1 * num2);
		return getAnswer();
	}
	
	public int divide(int num1, int num2){
		setAnswer(num1 / num2);
		return getAnswer();
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}
}
