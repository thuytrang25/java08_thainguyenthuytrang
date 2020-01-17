package ThuyTrang.lesson02_submit;

public class Prime {

	public static void main(String[] args) {

		System.out.println("" + Test());

	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int Test() {
		int n = 0;
		int count = 0;

		while (true) {

			if (isPrime(n)) {
				count++;
			}
			if (count == 200)
				break;
			n++;
		}
		return n;
	}
}
