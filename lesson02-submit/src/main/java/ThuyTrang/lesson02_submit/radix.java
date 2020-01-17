package ThuyTrang.lesson02_submit;

public class radix {

	public static void main(String[] args) {

		int n = 4;
		System.out.println("" + xauNP(n));

	}

	public static long xauNP(int n) {
		long tmp = n;
		long rem, i = 1, sum = 0;
		do {

			rem = tmp % 2;
			sum = sum + (i * rem);
			tmp = tmp / 2;
			i = i * 10;
		} while (tmp > 0);
		return sum;
	}
}
