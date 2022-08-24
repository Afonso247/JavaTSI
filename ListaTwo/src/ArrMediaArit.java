
import java.util.Random;

public class ArrMediaArit {

	public static void main(String[] args) {
		
		Random random = new Random();
		int mediaNum = 0;
		int mediaDiv = 0;
		
		int[] numbers = new int[100];
		
		for(int i = 0; i<numbers.length; i++) {
		
			numbers[i] = random.nextInt(1000)+1;
		}
		
		
		for(int i = 0; i<numbers.length; i++) {
		
			mediaNum = mediaNum + numbers[i];
			mediaDiv++;
		}
		
		int resultado = mediaNum/mediaDiv;
		
		System.out.println(resultado+" é a média aritmética!");

	}

}
