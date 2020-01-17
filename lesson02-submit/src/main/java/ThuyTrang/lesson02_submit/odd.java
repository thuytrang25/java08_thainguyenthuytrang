package ThuyTrang.lesson02_submit;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {

		int n;
		Scanner c = new Scanner(System.in);
		do {
			System.out.print("Nhập vào số phần tử của mảng: ");
			n = c.nextInt();
		} while (n < 0);
		int[] a = new int[n];
		NhapMang(a, n);
		System.out.println(" số lẻ lớn nhất thứ hai :" + Maxsecond(a, n));

	}

	public static void NhapMang(int[] a, int n) {
		Scanner c = new Scanner(System.in);

		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			a[i] = c.nextInt();
		}

	}

	public static int Maxfirst(int a[], int n) {
		int max = 0;
		for (int j = 0; j < n; j++) {

			if (a[j] > max && a[j] % 2 != 0)
				max = a[j];

		}
		return max;

	}

	public static int Maxsecond(int a[], int n) {
		int max2 = 0;
		for (int i = 0; i < n; i++) {
			if (Maxfirst(a, n) == a[i]) {
				continue;
			} else if (max2 < a[i] && a[i] % 2 != 0) {
				max2 = a[i];
			}

		}
		return max2;
	}

}
