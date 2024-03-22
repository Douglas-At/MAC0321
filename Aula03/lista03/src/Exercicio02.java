
public class Exercicio02 {

    // metodo taylor
	public static double arctanTaylor(double x) {
        double sum = 0.0;
		if (x > 1) {
			sum += Math.PI/2;
			
			for (int i = 0; i < 10000; i++) {
				sum += -Math.pow(-1, i) / (Math.pow(x, 2 * i + 1) * (2 * i + 1));
			}
        } else if (x < -1) {
        	sum += -Math.PI/2;
        	for (int i = 0; i < 10000; i++) {
        		sum += -Math.pow(-1, i) / (Math.pow(x, 2 * i + 1) * (2 * i + 1));
        	}
        } else {
        	sum += 0.0;
        	for (int i = 0; i < 10000; i++) {
	            sum += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / (2 * i + 1);
	            
        	}
        }
		return sum;
    }

    // metodo math
    public static double arctanMath(double x) {
        return Math.atan(x);
    }
    
    public static void main(String[] args) {

        double x = 1; // comparacao
        System.out.println("Serie de Taylor: " + arctanTaylor(x));
        System.out.println("Lib Math: " + arctanMath(x));
    }

}
