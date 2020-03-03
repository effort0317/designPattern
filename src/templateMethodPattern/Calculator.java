package templateMethodPattern;

public abstract class Calculator {

	// ��ü������ ��ġ�ϴ� �κ��� calculate(int n)�޼ҵ�
	public int calculate(int n) {
		int result = getInitValue();// ��üȭ ��ü���� ���� �ٸ��Ƿ� ���� ���� �޼ҵ��� ��ȯ������ ó��
		for (int i=1; i<=n; i++) {
		if (valueSelected(i)) result = doCalc(result, i);}  // ��üȭ ��ü���� ���� �ٸ��Ƿ� if�� ���ǹ��� ���� ���� �޼ҵ��� ��ȯ������ ó��
		return result;
	}

	// �Ʒ� �� �߻� �޼ҵ���� ���� Ŭ�������� �� �ٸ� ������ ������ �����Ƿ� ���� Ŭ�������� ������ �� �� �ֵ��� �߻�޼ҵ�� ó��
	protected abstract int doCalc(int result, int n);

	protected abstract int getInitValue();
		
	protected abstract boolean valueSelected(int i);
}