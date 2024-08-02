package teoria;

public class Iteraciones {
    public static void main(String[] args) {
        int i = 11;

        do {
            i++;
            if(i % 2 == 0) {
                System.out.println("No quiero imprimir los pares");
                continue;
            }
            System.out.println("El valor de i es: " + i);
            System.out.println("Otra instrucción");
        } while (i < 10);



        System.out.println("Terminó el loop");

    }
}
