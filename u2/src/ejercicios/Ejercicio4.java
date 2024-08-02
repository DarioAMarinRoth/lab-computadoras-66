package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int edad;
        double altura;
        String nombre;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(leer.nextLine());
        System.out.println("Ingrese su altura");
        altura = Double.parseDouble(leer.nextLine());
        System.out.println("Ingrese su nombre");

        nombre = leer.nextLine();

        System.out.println(edad);

        System.out.println("El nombre es " + nombre + " la edad es " + edad + " y la altura es " + altura);

    }
}
