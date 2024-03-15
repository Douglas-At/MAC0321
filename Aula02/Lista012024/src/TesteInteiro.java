/* Na linha : obj = new Inteiro(); esta errado, pois quando chamamos a classe Inteiro precisamos
 * passar algum parametro inteiro também 
 * e outro ponto de erro é que a static void teste() não faz o papel da main, ou seja, o programa não tem ponto de inicio ]
 * logo não da para "rodar" o programa.*/

class Inteiro{
	private int i;
	public Inteiro(int j){
		i = j;
	}
	public void setInt(int j){
		i = j;
	}
	public int getInt(){
		return i;
	}
}
public class TesteInteiro{
	public static void teste(){
		Inteiro obj;
		obj = new Inteiro();
		System.out.println(" O objeto cont´em: " + obj.getInt());
		obj.setInt(4);
		System.out.println(" O objeto cont´em: " + obj.getInt());
	}
}