package ThuyTrang.lesson02_submit;

public class factorial {

	public static void main(String[] args) {

		int[] a = { 4, 7, 12, 18 };
		System.out.println("" + Sum(a));

	}

	public static long DeQuy(int a) {
		if (a == 1 || a == 0)
			return 1;
		return a * DeQuy(a - 1);

	}

	public static long Sum(int[] a) {
		long s = 0;
		for (int i = 0; i < a.length; i++) {
			s = s + DeQuy(a[i]);
		}
		return s;

	}

}
