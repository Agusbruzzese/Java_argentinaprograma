// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Ingrese priemr numero: ");
        int numero_1 = entrada.nextInt();

        System.out.printf("Ingrese otro numero: ");
        int numero_2 = entrada.nextInt();

        int bandera = numero_1;
        numero_1 = numero_2;
        numero_2 = bandera;


        System.out.printf("La priemra variale es: "+numero_1+" y la segunda variable es: "+numero_2);


    }
}