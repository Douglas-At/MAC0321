
public class TesteExercicio04 {
	public static void main(String[] args) {
		ContaCorrentev1 cc1 = new ContaCorrentev1("Fulano",7851089);
		ContaCorrentev1 cc2 = new ContaCorrentev1("Cliclano",685);
     
		cc1.imprime();  // saldo zerado pq n passei saldo no construtos
		cc1.setSaldo(1200);
		cc2.setSaldo(15650);
		cc1.setNconta(123456);
      
		cc1.imprime();
		cc2.imprime();
    }
}


