package atividadeUm;
import java.util.Scanner;
public class atividade_001 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int X;
		int Y;
		 System.out.println("Digite um valor.");
			X = myObj.nextInt();
		 System.out.println("Digite um segundo valor.");
		 Y = myObj.nextInt();
		 System.out.printf("A soma de ambos os teus números é %d", X+Y);
	}

}

/* atividade passada no dia 5 de novembro */

package atividadeUm;
import java.util.Scanner;
public class atividade_001 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int X;
		int Y;
		int Z;
		 System.out.println("Digite um valor.");
			X = myObj.nextInt();
		 System.out.println("Digite um segundo valor.");
		 Y = myObj.nextInt();
		 System.out.println("Digite um terceiro valor.");
		 Z = myObj.nextInt();
		 int media = ((X + Y + Z)/3);
		 System.out.printf("A média dos teus números é %d", media);
	}

}

//Trata-se da atividade 2.

package atividadeUm;
import java.util.Scanner;
public class atividade_001 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int X;
		int Y;
		int Z;
		 System.out.println("Digite um valor.");
			X = myObj.nextInt();
		 int paridade = X%2;
		 System.out.printf("Se par fosse 0 e ímpar fosse 1, X seria %d.", paridade);
	}

}

//atividade 3
//Ou

package atividadeUm;
import java.util.Scanner;
public class atividade_001 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int X;
		int Y;
		int Z;
		 System.out.println("Digite um valor.");
			X = myObj.nextInt();
		 int paridade = X%2;
		 if (paridade == 1) {
			 System.out.print("Seu valor é ímpar");
		 }
			 else {
				 System.out.print("Seu valor é par");
			 }
		 }
	}

//essa resolução é melhor

package atividadeUm;
import java.util.Scanner;
public class atividade_001 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int X;
		int Y;
		int Z;
		 System.out.println("Digite sua idade.");
			X = myObj.nextInt();
			 System.out.println("Digite a idade de um amigo.");
				Y = myObj.nextInt();
		 if (X > Y) {
			 System.out.println("Você é mais velho que seu amigo.");
		 }
			 else if(X == Y) {
				 System.out.println("Você é mais velho que seu amigo.");
			 }
			 else {
				 System.out.println("Você é mais novo que seu amigo.");
			 }
		 }
}

//quarta questão

package atividadeUm;
import java.util.Scanner;
public class atividade_001 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int X;
		int Y;
		int Z;
		 System.out.println("Digite um valor.");
			X = myObj.nextInt();
/*			 System.out.println("Digite a idade de um amigo.");
				Y = myObj.nextInt(); 
				*/
		 if (X > 20) {
			 System.out.println("Seu valor excede 20.");
		 }
			 else if(X <= 20 && X >= 10) {
				 System.out.println("Seu valor é aceitável.");
			 }
			 else {
				 System.out.println("Seu valor é inferior à 10.");
			 }
		 }
}

//quinta questão

package atividadeUm;
import java.util.Scanner;
public class atividade_001 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		float X;
		float Y;
		 System.out.println("Digite um preço de produto.");
			X = myObj.nextFloat();			 
			System.out.println("Digite o valor de desconto.");
				Y = myObj.nextFloat(); 
				float Z = (X * ((100-Y)/100));
				System.out.printf(
						"Seu produto, após os descontos, tem o valor aproximado de %f.", Z);
		 }
}

//sexta questão

package atividadeUm;
import java.util.Scanner;
public class atividade_001 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		float X;
		float Y;
		 System.out.println("Digite sua idade: ");
	X = myObj.nextInt();
If (X >= 16) {
System.out.print("Você pode votar.");
} else {
System.out.print("Você não pode votar.");
}
		 }
}

//questão 7

package atividadeUm;
import java.util.Scanner;
public class atividade_001 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		float X;
		float Y;
		 System.out.println("Digite sua idade: ");
	X = myObj.nextInt();
System.out.println("Digite a idade do seu amigo: ");
	Y = myObj.nextInt();
If (X >= 18 && Y >= 18) {

System.out.println("Você e seu amigo atingiram a maioridade.");
}
else { System.out.println("Você, ou seu amigo ou nem você e nem seu amigo são maiores de idade.);
} 
		 }
	}
//questão 8

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite um operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operador inválido. Por favor, use +, -, * ou /.");
                break;
        }
        scanner.close();
    }
	}

//questão 10
