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
