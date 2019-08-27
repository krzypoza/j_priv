package test;

public class TeenNumberChecker {
	public static boolean hasTeen(int A, int B, int C) {
		boolean isTeen = false;

		if ((A >= 13 && A <= 19) || (B >= 13 && B <= 19) || (C >= 13 && C <= 19)) {
			isTeen = true;
		}

		return isTeen;
	}

	public static boolean isTeen(int A) {
		boolean isTeen = false;

		if (A >= 13 && A <= 19) {
			isTeen = true;
		}

		return isTeen;
	}

}
