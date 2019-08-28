package test;

import java.util.Scanner;

public class ReadingConsole {

	public static void scannerChelenge() {
		Scanner scanner = new Scanner(System.in);
		int count = 1;
		while (count < 11) {
			System.out.println("Enter number #" + count);

		boolean isEnter = scanner.hasNextInt();

			if (isEnter) {
			int number = scanner.nextInt();
				System.out.println("your number = " + number);
			count++;
				continue;
			}
		}
		System.out.println("End, you enter 10 value");
		scanner.close();
	}
}
