import java.util.Random;

public class ArrPrimo {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] numbers = new int[100];
		boolean flag=true;
		
		for(int i = 0; i<numbers.length; i++) {
		
			numbers[i] = random.nextInt(1000)+1;
		}
		
		
		for(int i=0; i<numbers.length; i++) {
		
			int m = numbers[i]/2;
			
			if(numbers[i] == 0 || numbers[i] == 1){  
				flag=false;      
			}else{  
				for(int j=2;j<=m;j++){      
					if(numbers[i] % j==0){           
						flag=false;      
						break;      
				    } else {
				    	flag=true;
				    }
				}      
			}
			if(flag) { 
				System.out.println(numbers[i]+" é um número primo!"); 
			} else {
				System.out.println(numbers[i]+" não é um número primo!"); 
			}
		}
		
	}

}
