package teoria;

public class CadenasDeTexto {
    public static void main(String[] args) {

        String miString = "Hola mundo";
        String otroString = "Hola mundo";
        String unTercerString = new String("Hola mundo");

        miString = "Chau mundo";

        System.out.println(otroString.equals(unTercerString));

    }
}