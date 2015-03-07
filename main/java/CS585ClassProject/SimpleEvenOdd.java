package CS585ClassProject;

public class SimpleEvenOdd {
	private boolean result;
	
	public SimpleEvenOdd() {
		setResult(false);
	}
	
    public boolean isEvenNumber(int number){
        
        if(number%2 == 0){
            setResult(true);
        }
        return isResult();
    }

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
}
