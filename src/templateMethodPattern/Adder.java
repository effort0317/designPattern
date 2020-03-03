package templateMethodPattern;

public class Adder extends Calculator {
    
	protected int doCalc(int result, int i) {
		return result+i;
	}
	
	protected int getInitValue() { return 0;}
	
	@Override
	protected boolean valueSelected(int i) {  
		return true;
	}

	

}
