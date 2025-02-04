
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int soma1 = calculadora.somar(5, 10);
        System.out.println("Soma de 5 e 10: " + soma1);

        int soma2 = calculadora.somar(1, 2, 3);
        System.out.println("Soma de 1, 2 e 3: " + soma2);

        double soma3 = calculadora.somar(2.5, 3.5);
        System.out.println("Soma de 2.5 e 3.5: " + soma3);

        int[] numeros = {1, 2, 3, 4, 5};
        int soma4 = calculadora.somar(numeros);
        System.out.println("Soma do array {1, 2, 3, 4, 5}: " + soma4);
    }
}

// A seguir vem a explicação

public class Calculadora {

    // Método que soma dois números inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método que soma três números inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método que soma dois números de ponto flutuante (double)
    public double somar(double a, double b) {
        return a + b;
    }

    // Método que soma todos os números em um array de inteiros
    public int somar(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}

public class TesteCalculadora {
    public static void main(String[] args) {
        // Instanciando a classe Calculadora
        Calculadora calculadora = new Calculadora();

        // Testando o método somar com dois números inteiros
        int soma1 = calculadora.somar(5, 10);
        System.out.println("Soma de 5 e 10: " + soma1);

        // Testando o método somar com três números inteiros
        int soma2 = calculadora.somar(1, 2, 3);
        System.out.println("Soma de 1, 2 e 3: " + soma2);

        // Testando o método somar com dois números de ponto flutuante
        double soma3 = calculadora.somar(2.5, 3.5);
        System.out.println("Soma de 2.5 e 3.5: " + soma3);

        // Testando o método somar com um array de números inteiros
        int[] numeros = {1, 2, 3, 4, 5};
        int soma4 = calculadora.somar(numeros);
        System.out.println("Soma do array {1, 2, 3, 4, 5}: " + soma4);
    }
}
