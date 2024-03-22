public class Exercicio01 {
    private static double[] lista = new double[20];   
    private static boolean isPopulated = false;  

    public static void sequenciaAleatoria() {
        if (!isPopulated) {
            for (int i = 0; i < lista.length; i++) {
                lista[i] = Math.random();
                System.out.println(lista[i]);
            } 
            isPopulated = true; 
        } else {
            for (double num : lista) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Primeira sequência");
        sequenciaAleatoria();
        System.out.println("Segunda sequência");
        sequenciaAleatoria();
    }
}
