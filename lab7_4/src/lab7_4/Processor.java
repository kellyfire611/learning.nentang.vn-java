package lab7_4;

public class Processor {
	public int sum(int a, int b) {
		int result = a + b;
		System.out.printf("Tong 2 so: %f + %f = %f", a, b, result);
		return result;
	}

	public int sum(int a, int b, int c) {
		int result = a + b + c;
		System.out.printf("Tong 3 so: %f + %f = %f", a, b, c, result);
		return result;
	}

	public int sum(int[] arrNumbers) {
		int result = 0;
		for (int n : arrNumbers) {
			result += n;
		}
		System.out.printf("Tong %f so = %f", arrNumbers.length, result);
		return result;
	}
}
