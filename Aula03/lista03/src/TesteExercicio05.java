public class TesteExercicio05 {
	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex(3.0);
		Complex c3 = new Complex(4.0,3.0);
		Complex c4 = new Complex(2.0,1.0);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c1.addToMe(c2).addToMe(c3).toString());
		System.out.println(c4.addToMe(c2).addToMe(c3).toString());
		System.out.println(c4.multiplyMeBy(c2).multiplyMeBy(c3).toString());
    }

}

