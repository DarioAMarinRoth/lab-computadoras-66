package ejercicios;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {

        int contadorVocales = 0;
        String cadena;
        Scanner ent = new Scanner(System.in);

        System.out.println("Por favor, ingrese una cadena de texto");
        cadena = ent.nextLine();
        System.out.println(cadena);
        System.out.println(cadena.length());

        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))) {
                contadorVocales++;
            }
        }

        System.out.println("La cantidad de vocales es " + contadorVocales);

    }

    public static boolean esVocal(char caracter) {

        return switch (caracter) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };



    }
}
