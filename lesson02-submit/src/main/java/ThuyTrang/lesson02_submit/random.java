package ThuyTrang.lesson02_submit;

import java.util.Random;

public class random {

	public static void main(String[] args) {

		int[] a = new int[5];
		Random(a);

		for (int mang : a) {
			System.out.println(mang);
		}

	}

	public static void Random(int[] a) {

		Random rd = new Random();
		for (int i = 0; i < a.length; i++) {

			a[i] = 20 + rd.nextInt(30 - 20 + 1);
			for (int j = 0; j < i; j++) {

				if (a[i] != a[j])
					continue;

				else {

					a[i] = 20 + rd.nextInt(30 - 20 + 1);
					i = j;

				}
			}
		}
	}
}
