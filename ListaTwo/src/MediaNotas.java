
import java.util.Scanner;
import java.text.DecimalFormat;

public class MediaNotas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Insira a Primeira Nota: ");
		float n1 = scan.nextFloat();
		System.out.println("Insira a Segunda Nota: ");
		float n2 = scan.nextFloat();
		System.out.println("Insira a Terceira Nota: ");
		float n3 = scan.nextFloat();
		System.out.println("Insira a Quarta Nota: ");
		float n4 = scan.nextFloat();
		System.out.println("Insira a Quinta Nota: ");
		float n5 = scan.nextFloat();
		
		float resultado = (n1+n2+n3+n4+n5) / 2;
		
		System.out.printf("A média aritmética das notas é: "+df.format(resultado));
		
		scan.close();
	}

}
