package templateMethodPattern;

public abstract class Calculator {

	// 전체적으로 일치하는 부분인 calculate(int n)메소드
	public int calculate(int n) {
		int result = getInitValue();// 구체화 객체마다 값이 다르므로 변수 값을 메소드의 반환값으로 처리
		for (int i=1; i<=n; i++) {
		if (valueSelected(i)) result = doCalc(result, i);}  // 구체화 객체마다 값이 다르므로 if의 조건문과 변수 값을 메소드의 반환값으로 처리
		return result;
	}

	// 아래 세 추상 메소드들은 하위 클래스에서 다 다른 로직을 가지고 있으므로 하위 클래스에서 재정의 할 수 있도록 추상메소드로 처리
	protected abstract int doCalc(int result, int n);

	protected abstract int getInitValue();
		
	protected abstract boolean valueSelected(int i);
}