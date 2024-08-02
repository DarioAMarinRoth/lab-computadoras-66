package ejercicios;


import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        int sumaPares = 0;
        int contadorDePares = 0;
        double promedio;
        int numeroIngresado;
        Scanner ent = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            // Ingreso de números
            numeroIngresado = ent.nextInt();
            // Procesamiento
            if (numeroIngresado % 2 == 0) {
                contadorDePares++;
                sumaPares += numeroIngresado;
            }
        }

        promedio = (double) sumaPares / contadorDePares;
        System.out.println(promedio);

    }
}
