package prova1;

public class Calculadora {
	int Resultado;
	public int subtrai(int a, int b) {
		return a - b;
	}
	public static void main (String [] args) {
		Calculadora c1 = new Calculadora();
		c1.Resultado = c1.subtrai(3, 4);
		System.out.println(c1.Resultado);
	}
}

