package test;

import java.util.Scanner;

public class InputCalculator {

	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		double avg = 0;
		int counter = 0;

		while (true) {
			boolean isAnInt = scanner.hasNextInt();

			if (isAnInt) {
				int xx = scanner.nextInt();
				System.out.println(xx);
				sum = sum + xx;
				++counter;
				avg = sum / counter;

			} else {

				System.out.println(
						"SUM = " + (int) sum + " AVG = " + Math.round(avg));
				break;
			}
		}
		scanner.close();
	}
}
