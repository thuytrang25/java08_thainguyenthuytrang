package ThuyTrang.lesson02_submit;

import java.util.Scanner;

public class symmetric {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		Test(n);

	}

	public static int Symmetric(int n) {
		int Socuoi, SoDao = 0;
		int tmp = n;
		while (tmp != 0) {
			Socuoi = tmp % 10;
			SoDao = SoDao * 10 + Socuoi;
			tmp = tmp / 10;
		}
		return SoDao;
	}

	public static void Test(int n) {
		if (Symmetric(n) == n) {

			System.out.println( n + ":La so doi xung");
		} else
			System.out.println( n + ": k la so doi xung");
	}

}
