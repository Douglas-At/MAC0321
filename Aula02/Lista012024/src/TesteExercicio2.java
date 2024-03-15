import java.math.BigInteger;

public class TesteExercicio2 {
	// teste exemplo do professor 
	public static void assertEquals(BigInteger result, BigInteger expected, String message) {
		if (!result.equals(expected)) {
			System.err.println(message+String.format(": Expected: %d got: %d", expected, result));
			System.exit(1);
		}
	}
	
	public static void testeTreze() {
		assertEquals(Exercicio2.CalcFatorialBig(13),new BigInteger("6227020800"), "Teste Treze");
	}
	
	
	public static void testeVinte() {
		assertEquals(Exercicio2.CalcFatorialBig(20),new BigInteger("2432902008176640000"), "Teste Vinte");
	}
	
	public static void testeTrinta() {
		assertEquals(Exercicio2.CalcFatorialBig(30),new BigInteger("265252859812191058636308480000000"), "Teste Trinta");
	}
	
	public static void testeNegativo() {
		assertEquals(Exercicio2.CalcFatorialBig(-2),new BigInteger("1"), "Teste Negativo");
	}
	
	public static void testeZero() {
		assertEquals(Exercicio2.CalcFatorialBig(0),new BigInteger("1"), "Teste Zero");
	}

	
	public static void main(String[] args) {
		
		testeTreze();
		testeVinte();
		testeTrinta();
		testeNegativo();
		testeZero();
		System.out.println("Todos os testes passaram.");
	}

}
