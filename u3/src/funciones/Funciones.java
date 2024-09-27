package funciones;

import java.util.Scanner;

public class Funciones {

    public static void imprimirVector(int[] vector) {

        for (int elemento : vector) {
            System.out.println(elemento);
        }

    }

    public static int[] vectorAleatorio(int min, int max, int n) {
        int[] vectorAleatorio = new int[n];

        for (int i = 0; i < n; i++) {
            vectorAleatorio[i] = enteroAleatorio(min, max);
        }

        return vectorAleatorio;
    }

    public static int enteroAleatorio(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }

    public static int[] subvector(int[] vector, int min, int max) {
        int[] subvector = new int[max - min + 1];

        for (int i = 0, j = i + min; i < subvector.length; i++, j++) {
            subvector[i] = vector[j];
        }
        return subvector;
    }
}