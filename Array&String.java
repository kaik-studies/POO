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
