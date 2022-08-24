
import java.util.*;

public class ArrImpInv {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] numbers = new int[100];
		
		for(int i = 0; i<numbers.length; i++) {
		
			numbers[i] = random.nextInt(1000)+1;
		}
		
		
		System.out.println("Impressão de números aleatórios:");
		
		for(int i = 0; i<numbers.length; i++) {
			
			System.out.println(numbers[i]);
		}
		
		
		System.out.println("Impressão INVERSA de números aleatórios:");
		
		for(int i = numbers.length-1; i>=0; i--) {
			
			System.out.println(numbers[i]);
		}

	}

}
