class ContaCorrentev4 {
	private int numConta;
	private String titular;
	private double saldo = 0;
	private static int proximoNumero = 0;
	
	public ContaCorrentev4(String titular) {
		numConta = proximoNumero++;
		this.titular = titular;
	}
	
	// Métodos:
	public int pegaNumero() {
		return numConta;
	}
	public String pegaTitular() {
		return titular;
	}
	public double pegaSaldo() {
		return saldo;
	}
	public void deposito(double valor) {
		saldo = saldo + valor;
	}
	public void saque(double valor) {
		if (saldo >= valor)
			saldo = saldo - valor;
		else
			// Isto é provisório (pode ser melhorado)
			throw new RuntimeException("saldo insuficiente");
	}
	public void imprime() {
		System.out.println("numero: " + numConta);
		System.out.println("titular: " + titular);
		System.out.println("saldo: " + saldo);
	}

} 

// Tudo privado e tudo que queremos q seja publico são metodos listados 