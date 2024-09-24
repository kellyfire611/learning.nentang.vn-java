package lab7_4;

public class MathProcessor extends Processor {

	@Override
	public int sum(int a, int b) {
		int result = a + b;
		System.out.printf("SUM of 2 numbers: %f + %f = %f", a, b, result);
		return result;
	}
}
