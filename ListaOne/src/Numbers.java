
import java.util.Scanner;
import java.util.*;  

public class Numbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro: ");
		int var1 = scan.nextInt();
		System.out.println("Insira um número grande: ");
		long var2 = scan.nextLong();
		System.out.println("Insira um número decimal: ");
		float var3 = scan.nextFloat();
		
		
		System.out.printf("O número inteiro digitado foi: "+var1+". o número long digitado foi: "+
				  		  var2+". E o número float digitado foi: "+var3);
		scan.close();
		
	}
	
}