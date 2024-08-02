package teoria;

public class FuncionesTeoria {
    public static void main(String[] args) {

        System.out.println("Primera etapa de mi programa");
        contarHasta3();         // Llamamos a la función contarHasta3()
        System.out.println();

        System.out.println("Segunda etapa del programa");
        contarHasta3();
        System.out.println();

        System.out.println("Tercera etapa del programa");
        contarHasta(5, 12);
    }


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

}
