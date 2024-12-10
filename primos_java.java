//primos

package atividadeUm;

public class primos_02 {

	public static void main(String[] args) {
		int i, count, number;
		for(number = 1; number <= 100; number++) 
		{
			count = 0;
			for (i = 2; i <= number/2; i++) {
				if(number % i == 0) {
					count++;
					break;
				}
				
			}
			if (count == 0 && number != 1) {
				System.out.println(number+ " ");
			}
		}
	}
	
	
}
