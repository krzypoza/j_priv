package test;

public class HelloTest {

	public static void main(String[] args) {
		
		System.out.println(SpeedConverter.toMilesPerHour(10.5)); // SpeedConverter
		SpeedConverter.printConversion(-2); // SpeedConverter

		MegaBytesConverter.printMegaBytesAndKiloBytes(5000); // MegaBytesConverter

		System.out.println(BarkingDog.shouldWakeUp(true, 0));// BarkingDog
		System.out.println("isLeapYear " + LeapYear.isLeapYear(1700));
	}

}
