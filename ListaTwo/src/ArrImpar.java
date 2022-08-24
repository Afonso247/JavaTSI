
import java.util.*;

public class ArrImpar {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] numbers = new int[100];
		
		for(int i = 0; i<numbers.length; i++) {
		
			numbers[i] = random.nextInt(1000)+1;
		}
		
		
		for(int i = 0; i<numbers.length; i++) {
			
			if(numbers[i]%2 != 0) {
				System.out.println(numbers[i]+" é um número impar!");
			}
		}

	}

}
