package filename.java;
import java.util.Scanner;
public class pares {
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		int fator = 1;
		System.out.println("Digite um limite de fatorial");
		int limite = myObj.nextInt();
		for(int numeros = 1; numeros <= limite; numeros++) {
			fator *= numeros;
		
			System.out.println(fator);
			
		}
		//troque a chave de lugar para limitar os prints//
	}

}
//quadrado

package filename.java;

public class cube {
public static void main (String[] args) {
	for(int A = 5; A <= 6; A++) {
		
		for(int B = 5; B <= 5; B++) {
			System.out.println("******************");
		}
		for(int B = 5; B <= 5; B++) {
			System.out.println("******************");
		}
		for(int B = 5; B <= 5; B++) {
			System.out.println("******************");
		}
		for(int B = 5; B <= 5; B++) {
			System.out.println("******************");
		}
		
		
	}
}
}

//
package filename.java;
import java.util.Scanner;
public class filemame

{
  public static void main(String[] args) {
	  Scanner myObj = new Scanner(System.in);
	  System.out.println("Nota da prova 1, da prova 2  da prova 3: ");
	  double nota1 = myObj.nextDouble(), nota2 = myObj.nextDouble(), nota3 = myObj.nextDouble();
	  if (nota1 > nota2 && nota1 > nota3) {
		  System.out.println("Nota 1 é a maior nota.");
		} else if (nota2 > nota1 && nota2 > nota3) {
			System.out.println("Nota 2 é maior.");
		} else if(nota3 > nota1 && nota3 > nota2){
			System.out.println("Nota 3 é maior."); }
			else {
				System.out.println("Todas as notas são iguais.");
			}
		}

  }

