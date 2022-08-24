
import java.util.Scanner;
import java.text.DecimalFormat;

public class MaiorMenor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Insira o primeiro valor(número inteiro): ");
		int var1 = scan.nextInt();
		System.out.println("Insira o segundo valor(número inteiro): ");
		int var2 = scan.nextInt();
		
		if(var1 > var2) {
			System.out.println("O primeiro número é o maior: "+df.format(var1));
		} else if(var1 < var2) {
			System.out.println("O segundo número é o maior: "+df.format(var2));
		} else {
			System.out.println("Ambos os números são iguais!");
		}
		
		scan.close();
		
		
	}

}
