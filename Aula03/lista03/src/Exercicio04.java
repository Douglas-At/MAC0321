class ContaCorrentev1 {
    private String nome;
    private int nconta;
    private double saldo;
    private static final String banco = "Banco Santos"; 

    public ContaCorrentev1(String nome, int nconta, double saldo) {
        this.nome = nome;
        this.nconta = nconta;
        this.saldo = saldo;
        
    }

    
    public ContaCorrentev1(String nome, int nconta) {
        this(nome, nconta, 0.0);  
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getNconta() {
        return nconta;
    }

    public void setNconta(int nconta) {
        this.nconta = nconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    	
    public static String getBanco() {
        return banco;
    }

    
    public String toString() {
        return "\nnome= '" + nome + 
               "',\nnconta= " + nconta +
               ",\nsaldo= " + saldo +
               ",\nbanco= '" + banco +"'";
    }

    public void imprime() {
        System.out.println(this.toString());
    }
}
