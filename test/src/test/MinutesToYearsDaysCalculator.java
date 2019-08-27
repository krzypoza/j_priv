package test;

public class MinutesToYearsDaysCalculator {
	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("invalid value");
		} else {
			System.out.println(minutes + " minutes = " + minutes / 525600 + " years and "
					+ (minutes % 525600) / 1440 + " days");
		}
	}
}
