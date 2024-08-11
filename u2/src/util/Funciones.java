package util;

public class Funciones {

    public static void contarHasta3() {
        System.out.println("Inicio la cuenta");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        System.out.println("Terminó la cuenta");
    }

    public static void contarHasta(int comienzoCuenta, int finalCuenta) {

        System.out.println("Inicio la cuenta");
        for (int i = comienzoCuenta; i <= finalCuenta; i++) {
            System.out.println(i);
        }
        System.out.println("Terminó la cuenta");
    }

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
