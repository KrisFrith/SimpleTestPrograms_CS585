package CS585ClassProject;

public class SimpleEvenOdd {
	boolean result;
	
	public SimpleEvenOdd() {
		result = false;
	}
	
    public boolean isEvenNumber(int number){
        
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
}
