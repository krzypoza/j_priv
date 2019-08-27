package test;

public class DecimalComparator {

	public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
		boolean equal = false;

		if ((int) (first * 1000) == (int) (second * 1000)) {
			equal = true;
		}
		return equal;
	}
}
