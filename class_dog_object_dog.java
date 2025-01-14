/*

1- create a Package
2- create 2 classes, 1 for the class and other one, the Main
3- write the following code in the class


*/

package Cachorro;

public class Cachorro {
	
	String nome;
	int idade;
	String raca;

	public void Latir() {
		System.out.println("AuAu!");
	}
	public void Mimir() {
		System.out.println("The dog's now asleep.");
	}
}

/* 
4- now, the code for the main
*/

package Cachorro;
public class Main {

	public static void main(String [] args) {
		System.out.print("The name, age and race of a given dog are: ");
		Cachorro cachorro1 = new Cachorro();
		cachorro1.nome = "Kal-el";
		cachorro1.idade = 4;
		cachorro1.raca = "Poodle";
		
		System.out.println(cachorro1.nome + ", "+ cachorro1.idade + ", " + cachorro1.raca + ".");
		System.out.print("The dog will howl: ");
		cachorro1.Latir();
		System.out.print("The dog will now rest: ");
		cachorro1.Mimir();
	}
	
}
