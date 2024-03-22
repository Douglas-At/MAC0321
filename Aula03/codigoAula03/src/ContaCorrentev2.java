class ContaCorrentev2 {
	public int numConta;
	public String titular;
	public double saldo;
	public ContaCorrentev2(int num, String tit) {
		numConta = num;
		titular = tit;
		saldo = 0;
	}
	public ContaCorrentev2(int num, String tit, double sal) {
		numConta = num;
		titular = tit;
		saldo = sal;
	}
}