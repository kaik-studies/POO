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
System.out.println("Digite-me sua média final em Eletricidades CA: ");
Scanner myObj = new Scanner(System.in);
int value;
value = myObj.nextInt();

String phrase = value >= 6 ? "aprovado" : "reprovado"; 
System.out.println("Você foi " + phrase + ".");

  }
}

//ATIVIDADE PEDIDA PELO PROFESSOR ACIMA!
