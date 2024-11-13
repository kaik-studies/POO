package filename.java;

public class filemame {
  public static void main(String[] args) {
int I = 3;
System.out.println("Congrats, you'll receive a new message in: ");
do {
	System.out.println(I + "!");
	I--;
} while (I > 0); 
if (I == 0) {
	System.out.println("Happy Birthday, mate!");
}
  }
}

//random code execution #01

package filename.java;

public class filemame {
  public static void main(String[] args) {
	  
for (int Value = 10; Value >= 5; Value--) {
	System.out.println("The value of a random Integer is " + Value + " right now.");
}
  }
}

//random code execution #02

package filename.java;

public class filemame {
  public static void main(String[] args) {
	  
for (int Value = 10; Value >= 5; Value--) {
	System.out.println("The value of a random Integer is " + Value + " right now.");
	
	for (int Value2 = 45; Value2 >= 30; Value2-=5) {
		System.out.println("The value of an inner Integer value is " + Value2 + "right now.");
		if (Value2 <= 35) { 
			break;
		}
	}
}
  }
}

//random code execution #03


//ATIVIDADE PEDIDA PELO PROFESSOR ABAIXO!

package filename.java;
import java.util.Scanner;
public class filemame {
  public static void main(String[] args) {
System.out.println("Digite-me sua primeira nota em Eletricidades CA: ");
Scanner myObj = new Scanner(System.in);
float VALUE1;
VALUE1 = myObj.nextFloat();
System.out.println("Digite-me sua segunda nota em Eletricidades CA: ");
float VALUE2 = myObj.nextFloat();
float MEDIA = ((VALUE1 + VALUE2)/2);
int MEDIA_APROVACAO = 6;
String phrase = MEDIA_APROVACAO != MEDIA ? "aprovado" : "reprovado"; 
System.out.println("Você foi " + phrase + ".");

  }
}
//ATIVIDADE PEDIDA PELO PROFESSOR ACIMA!

//USANDO NOTA

package filename.java;
import java.util.Scanner;
public class filemame {
  public static void main(String[] args) {
System.out.println("Digite-me sua primeira nota em Eletricidades CA: ");
Scanner myObj = new Scanner(System.in);
float VALUE1;
VALUE1 = myObj.nextFloat();
System.out.println("Digite-me sua segunda nota em Eletricidades CA: ");
float VALUE2 = myObj.nextFloat();
float MEDIA = ((VALUE1 + VALUE2)/2);
float MEDIA_APROVACAO;
System.out.println("Qual a média?");
MEDIA_APROVACAO = myObj.nextFloat();
String phrase = MEDIA_APROVACAO <= MEDIA ? "aprovado" : "reprovado"; 
System.out.println("Você foi " + phrase + ".");

  }
}

//USANDO MÉDIA

package filename.java;
import java.util.Scanner;
public class filemame {
  public static void main(String[] args) {
System.out.println("Digite-me média em Eletricidades CA: ");
Scanner myObj = new Scanner(System.in);
float VALUE1;
VALUE1 = myObj.nextFloat();
float MEDIA = (VALUE1);
float MEDIA_APROVACAO;
System.out.println("Qual a média da sua instituição?");
MEDIA_APROVACAO = myObj.nextFloat();
String phrase = MEDIA_APROVACAO <= MEDIA ? "aprovado" : "reprovado"; 
System.out.println("Você foi " + phrase + ".");

  }
}

//ACÁ!

//Right down/below you can see another small code

package atividadeUm;
import java.util.Scanner;
public class filenameclass {
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

//random activities down below

package filename.java;
public class filemame {
  public static void main(String[] args) {
		String [] weekDays = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", 
				"Quinta-Feira", "Sexta-Feira"
				};
		for(int i = 0; i <= 4; i++) {
			System.out.println(weekDays[i]);
		}

  }
}

//another one

package atividadeUm;
import java.util.Scanner;
public class filenameclass {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int i;
		do {
		System.out.println("Qual o número do dia da semana?");
		String [] weekDays = {"Oi...?", "Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", 
				"Quinta-Feira", "Sexta-Feira", "Sábado"
				};
	
		i = myObj.nextInt();
		System.out.println(weekDays[i]);
		
		if (i <= 0) {
			
			System.out.println("Isso não faz sentido.");
			
		}
		else {
			System.out.println("Boa(m)" + " " + weekDays[i] + "!");
		}
		
		 }
		while (i > 0 & i <= 7);
	}
}
