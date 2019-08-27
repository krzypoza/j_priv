package test;

public class EqualSumChecker {
	public static boolean hasEqualSum(int A, int B, int C) {
		boolean equal = false;
		if (A + B == C) {
			equal = true;
		}
		return equal;
	}
}
