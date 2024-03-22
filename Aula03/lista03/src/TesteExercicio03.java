
public class TesteExercicio03 {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("Fulano",7851089);
     
        cc.imprime();  // saldo zerado pq n passei saldo no construtos
        cc.setSaldo(1200);
        cc.setNconta(123456);
      
        cc.imprime();
    }
}


