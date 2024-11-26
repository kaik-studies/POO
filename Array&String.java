//aula 26/11/2024

package atividadeUm;
import java.util.Scanner;
public class filenameclass {
	public static void main(String[] args) {
		System.out.println("Entre com o nome de 4 verduras: ");
		Scanner myObj = new Scanner(System.in);
		
		String [] Verduras = new String[4];

		for (int I = 0; I <= 3; I++) {
			Verduras[I] = myObj.next();
		}
		
		for (int I = 0; I <= 3; I++) {
			System.out.println("");
			System.out.println(Verduras[I]);
		}
	}
}
//teste de Foreach (For each)

package atividadeUm;
import java.util.Scanner;
public class filenameclass {
	public static void main(String[] args) {
		System.out.println("Entre com o nome de 4 verduras: ");
		Scanner myObj = new Scanner(System.in);
		
		String [] Verduras = new String[4];

		for (int I = 0; I <= 3; I++) {
			Verduras[I] = myObj.next();
		}
		
		for (String v: Verduras) {
			System.out.println();
			System.out.println(v);
		}
	}
}

//

package atividadeUm;
import java.util.Scanner;
public class filenameclass {
	public static void main(String[] args) {
		System.out.println("Entre com o nome de 4 verduras: ");
		Scanner myObj = new Scanner(System.in);
		
		int [] numeros = new int[4];

		for (int I = 0; I <= 3; I++) {
			numeros[I] = myObj.nextInt();
		}
		
		for (int v: numeros) {
			System.out.println();
			System.out.println(v*2);
		}
				
		}
	}

//teste

package atividadeUm;
import java.util.Scanner;
public class filenameclass {
	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		
		int [] num = { 1, 2, 3, 4, 5};
		
		int [] num_dobra = new int [5];
		
		for(int I = 0;I <= 4; I++) {
			num_dobra[I] = num[I]*2;
			System.out.print(num_dobra[I]);
			System.out.print(",");
		}
		
		}
	
	}
