public class TesteComplex {
	// metodo maravilhosos do professor para teste 
    public static void assertEquals(Complex result, Complex expected, String message) {
        if (result.getReal() != expected.getReal() || result.getImaginary() != expected.getImaginary()) {
            System.err.println(message + String.format(": Expected: %s got: %s", expected.toString(), result.toString()));
            System.exit(1);
        }
    }
    
    public static void assertEqualsTanMod(double result, double expected, String message) {
        if (result != expected) {
            System.err.println(message + String.format(": Expected: %f got: %f", expected, result));
            System.exit(1);
        }
    }

    public static void testeAdicao() {
        Complex c1 = new Complex(3.0, 2.0);
        Complex c2 = new Complex(1.0, 4.0);
        Complex expected = new Complex(4.0, 6.0);
        assertEquals(c1.add(c2), expected, "testeAdicao");
    }

    public static void testeSubtracao() {
        Complex c1 = new Complex(3.0, 2.0);
        Complex c2 = new Complex(1.0, 4.0);
        Complex expected = new Complex(2.0, -2.0);
        assertEquals(c1.subtract(c2), expected, "testeSubtracao");
    }

    public static void testeMultiplicacao() {
        Complex c1 = new Complex(3.0, 2.0);
        Complex c2 = new Complex(1.0, 4.0);
        Complex expected = new Complex(-5.0, 14.0);
        assertEquals(c1.multiply(c2), expected, "testeMultiplicacao");
    }
    
    public static void testeModulo() {

        Complex c = new Complex(3.0, 4.0);
        double expected = 5.0;
		assertEqualsTanMod(c.module(), expected, "testeModulo");
    }
    
    public static void testeAngulo() {
        Complex c = new Complex(1.0, 1.0);
        double expected = Math.PI / 4; 
        assertEqualsTanMod(c.angle(), expected, "testeAngulo");
    }
    
    
   

    public static void main(String[] args) {
    	testeAdicao();
        testeSubtracao();
        testeMultiplicacao();
        testeModulo();
        testeAngulo();
        System.out.println("Todos os testes passaram.");
    }
}
