class TesteCc {
	// fiz essa main para testar a classe
   public static void main(String[] args) {
        ContaCorrentev4 cc = new ContaCorrentev4("Fulano");
        System.out.println("Testing deposit...");
        cc.deposito(5000.00);
        cc.imprime();  // Should show a balance of 5000.00

        System.out.println("Testing withdrawal...");
        cc.saque(2550.50);
        System.out.println("Novo saldo: " + cc.pegaSaldo());  // Should show a balance of 2449.50

        System.out.println("Testing insufficient balance for withdrawal...");
        try {
            cc.saque(5000);  // This should throw an exception
        } catch (RuntimeException e) {
            System.out.println("Expected exception: " + e.getMessage());
        }

        System.out.println("Testing account information retrieval...");
        System.out.println("Account Number: " + cc.pegaNumero());
        System.out.println("Account Holder: " + cc.pegaTitular());
        System.out.println("Account Balance: " + cc.pegaSaldo());
    }
}