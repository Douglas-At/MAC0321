
public class TesteExercicio1 {
	// teste exemplo do professor 
	public static void assertEquals(int value, int expected, String message) {
		if (value != expected) {
			System.err.println(message+String.format(": Expected: %d got: %d", expected, value));
			System.exit(1);
		}
	}
	
	public static void testeUm() {
		assertEquals(Exercicio1.CalcFatorial(1),1, "TesteZero");
	}
	
	public static void testeDois() {
		assertEquals(Exercicio1.CalcFatorial(2),2, "TesteZero");
	}
	
	public static void testeNegativo() {
		assertEquals(Exercicio1.CalcFatorial(-3),1, "Teste Negativo");
	}
	
	public static void TesteNumeroGrande() {
		assertEquals(Exercicio1.CalcFatorial(12),479001600, "Teste Numero Grande");
	}
	
	public static void testeCinco() {
		assertEquals(Exercicio1.CalcFatorial(5),120, "TesteZero");
	}
	
	public static void main(String[] args) {
		
		testeUm();
		testeDois();
		testeNegativo();
		TesteNumeroGrande();
		testeCinco();
		
		
		System.out.println("Todos os testes passaram.");
	}

}
