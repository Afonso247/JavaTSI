
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;  

public class Trapezio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Insira a Base Maior: ");
		float bMaior = scan.nextFloat();
		System.out.println("Insira a Base Menor: ");
		float bMenor = scan.nextFloat();
		System.out.println("Insira a Altura: ");
		float alt = scan.nextFloat();
		
		float resultado = ((bMaior + bMenor)*alt) / 2;
		
		if(bMaior < bMenor) {
			System.out.printf("Uma das bases estão aplicadas de forma errada.");
		} else {
			System.out.printf("A área do trapézio em cm2 é: "+df.format(resultado));
		}
		scan.close();
		
	}
	
}
