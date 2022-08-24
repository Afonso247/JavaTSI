
import java.util.Scanner;
import java.text.DecimalFormat;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Insira um valor(número inteiro): ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O valor é par!");
		} else {
			System.out.println("O valor é impar!");
		}
		
		scan.close();
		
		
	}

}