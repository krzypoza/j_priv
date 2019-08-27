package test;

public class PlayingCat {
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if ((summer == false && temperature > 35) || (summer == false && temperature < 25)
				|| (summer == true && temperature > 45) || (summer == true && temperature < 25)) {
			return false;
		}

		return true;
	}
}
