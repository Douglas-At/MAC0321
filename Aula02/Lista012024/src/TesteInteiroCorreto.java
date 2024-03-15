/* versao "correta" do codigo anterior, a class Inteiro, parece estar com erro pq ja tem uma na TesteInteiro	*/

class Inteiro {
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
public class TesteInteiroCorreto{
	public static void main(String[] args){
		Inteiro obj;
		obj = new Inteiro(0); 
		System.out.println(" O objeto cont´em: " + obj.getInt());
		obj.setInt(4);
		System.out.println(" O objeto cont´em: " + obj.getInt());
	}
}