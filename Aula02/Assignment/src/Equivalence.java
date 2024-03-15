public class Equivalence {
	public static void main(String[] args) {
		Integer n1 = Integer.valueOf(47);
		Integer n2 = Integer.valueOf(47);
		System.out.println(n1 == n2); 
		System.out.println(n1 != n2); 
		
		System.out.println(n1.equals(n2));
	}
}
// exericio demosntrativo que == nao funciona para objetos, == serve apenas para saber se os valroes estão na mesma memoria 
// logo use o equals como melhor forma
// outro aprendizado é usar Integer.valueOf() em vez de New Integer

// padrao java, se 2 inteiros são iguais é alocado o mesmo local de memora