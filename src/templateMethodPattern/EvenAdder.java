package templateMethodPattern;

public class EvenAdder extends Calculator {

	@Override
	protected int doCalc(int result, int i) {
		return result+i;
	}

	@Override
	protected int getInitValue() {
		return 0;
	}
	
	@Override
	protected boolean valueSelected(int i) {  
		if(i%2==0) return true;
		else  return false;
	}

}
     