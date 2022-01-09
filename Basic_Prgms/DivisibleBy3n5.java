package Basic_Prgms;

public class DivisibleBy3n5 {

	public static void main(String[] args) {
		int n = 10, i;
		for (i = 0; i <= n; i++) {

			if (i % 3 == 0) {
				System.out.println(+i + " is divisible by 3 ");
			} else {
				if (i % 5 == 0) {
					System.out.println(+i + " is divisible by 5 ");
				}

			}
		}
	}
}
