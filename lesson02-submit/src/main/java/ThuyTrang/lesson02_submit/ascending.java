package ThuyTrang.lesson02_submit;

public class ascending {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 9;
		sort_ascending(a, b, c);
	}

	public static void sort_ascending(int a, int b, int c) {
		int temp;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}

		if (a > c) {
			temp = a;
			a = c;
			c = temp;
		}

		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}

		System.out.print(a + "\t" + b + "\t" + c);

	}

}
