
import java.util.*;

public class ArrMaiorMenor {

	public static void main(String[] args) {
		
		Random random = new Random();
		int maior = 0;
		int menor = 1001;
		
		int[] numbers = new int[100];
		
		for(int i = 0; i<numbers.length; i++) {
		
			numbers[i] = random.nextInt(1000)+1;
		}
		
		
		for(int i = 0; i<numbers.length; i++) {
			
			if(numbers[i]>maior) {
				maior = numbers[i];
			}
		}
		
		for(int i = 0; i<numbers.length; i++) {
			
			if(numbers[i]<menor) {
				menor = numbers[i];
			}
		}
		
		
		System.out.println(maior+" é o maior número!");
		System.out.println(menor+" é o menor número!");

	}

}
