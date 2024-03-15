import java.math.BigInteger;

public class Exercicio2 {
    public static BigInteger CalcFatorialBig(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static void main(String[] args) {
    	// nao faz fatorial de big integer apenas 
        int number = 5; // Número para o qual quero calcular o fatorial

        BigInteger factorial = CalcFatorialBig(number);
        System.out.println("Factorial de " + number + " é: " + factorial);
    }
}
