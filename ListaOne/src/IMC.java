
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;  

public class IMC {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Insira o seu peso: ");
		float peso = scan.nextFloat();
		System.out.println("Insira a sua altura: ");
		float altura = scan.nextFloat();
		
		float resultado = peso / (altura * altura);
		
		
		System.out.printf("O resultado do IMC é: "+df.format(resultado));
		scan.close();
		
	}
	
}
