package test;

public class NumberPalindrome {

	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int numberCopy = number;
		boolean isFinished = false;

		while (!isFinished) {
			reverse += numberCopy % 10;
			numberCopy = numberCopy / 10;
			if (numberCopy != 0) {
				reverse *= 10;
			} else {
				isFinished = true;
			}
		}
		return (reverse == number);
	}
}
