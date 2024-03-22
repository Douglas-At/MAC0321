class ContaCorrentev3 {
	public int numConta;
	public String titular;
	public double saldo = 0;
	
	private static int proximoNumero = 0;
	
	public ContaCorrentev3(String titular) {
		numConta = proximoNumero++;
		this.titular = titular;
	}
}
//Como o proximoNumero só é usado dentro da classe ContaCorrente, ele foi declarado private
// isso é interessante que para inicializar a classe ele precisa de 3 parametros 
//mas conta e saldo são default e só precisa inciializar com o nome do titular

// statico é estilo variavel global dentro da classe

// o uso de apenas um construtor que ja seta o numero da conta é a mlehor par aevitar erros 