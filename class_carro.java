//class Carro no pacote Carro

package Carro;

public class Carro {

	String cor;
	String modelo;
	String placa;
	int velocidade;
	
	Carro(String c, String m, String p) {
		cor = c;
		modelo = m;
		placa = p;
	}
	void acelerar() {
		velocidade = velocidade + 10;
		System.out.println(velocidade);
	}
	void desacelerar() {
		velocidade = velocidade - 10;
		System.out.println(velocidade);
	}
	void bater() {
		velocidade = 0;
		System.out.println("FODEU!!! A GENTE VAI MO-");
		System.out.println(velocidade);
	}
} 

//class Main pacote Carro

package Carro;

public class Main {
	
	public static void main (String [] args) {
	
		Carro c1 = new Carro("Azul","Celta","BOO8135");
		System.out.println
		(c1.cor + ", " + 
		c1.modelo + ", " + c1.placa + ".");
				
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.desacelerar();
		c1.desacelerar();
		c1.bater();
	}
}
