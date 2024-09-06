package ejercicios;

public class Evaluacion2 {

    public static void main(String[] args) {
        System.out.println(sumaPrimos(10,20));
    }

    public static int sumaPrimos(int min, int max) {

        int sumaPrimos = 0;
        for (int i = min; i <= max; i++) {
            if (esPrimo(i)) {
                sumaPrimos += i;
            }
        }
        return sumaPrimos;
    }

    public static boolean esPrimo(int numero) {
        int contadorDivisores = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contadorDivisores++;
            }
        }

        return contadorDivisores == 2;
    }


}
