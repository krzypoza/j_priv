package test;

public class HelloTest {

	public static void main(String[] args) {
		
		System.out.println(SpeedConverter.toMilesPerHour(10.5)); // SpeedConverter
		SpeedConverter.printConversion(-2); // SpeedConverter

		MegaBytesConverter.printMegaBytesAndKiloBytes(5000); // MegaBytesConverter

		System.out.println(BarkingDog.shouldWakeUp(true, 0));// BarkingDog
		System.out.println("isLeapYear " + LeapYear.isLeapYear(1700));// LeapYear
		System.out.println("DecimalComparator " + DecimalComparator.areEqualByThreeDecimalPlaces(1.2568, 1.256));
		System.out.println("EqualSumChecker " + EqualSumChecker.hasEqualSum(1, -1, 0));// EqualSumChecker
		System.out.println("TeenNumberChecker " + TeenNumberChecker.hasTeen(12, 14, 45));
		System.out.println("TeenNumberChecker " + TeenNumberChecker.isTeen(13));
		System.out.println(AreaCalculator.area(1));
		System.out.println(AreaCalculator.area(2, 5));
		MinutesToYearsDaysCalculator.printYearsAndDays(1441);
		IntEqualityPrinter.printEqual(3, 3, 2);
		System.out.println(PlayingCat.isCatPlaying(true, 10));
		NumberInWord.printNumberInWord(4);
		System.out.println(SumOddRange.sumOdd(100, 1000));
		System.out.println(NumberPalindrome.isPalindrome(12121));
	}

}
