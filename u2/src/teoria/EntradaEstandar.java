// Objetivo: Lograr que el usuario ingrese valores.
package teoria;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EntradaEstandar {
    public static void main(String[] args) {

        int miNumero;
        double miFlotante;
        String miTexto;

        // <Clase del objeto> <identificador> = new Constructor();
        Scanner teclado = new Scanner(System.in);

        // Leer miTexto;
        System.out.println("ingrese una oración: ");
        miTexto = teclado.nextLine();           // Leemos texto.
        System.out.println("Ingrese un número entero: ");
        miNumero = teclado.nextInt();           // Lee un etero.
        System.out.println("ingrese un número decimal:");
        miFlotante = teclado.nextDouble();      // Leemos un flotante.

        System.out.println("El texto fue: " + miTexto);
        System.out.println("El entero fue: " + miNumero);
        System.out.println("El decimal fue: " + miFlotante);

    }
}
