import java.util.Random;

public class myRandom {
	
	public static int getRandomInt(int min, int max){
		Random rand = new Random();
		int randomInt = rand.nextInt ((max - min) + 1) + min;
		return randomInt;
	}

}
