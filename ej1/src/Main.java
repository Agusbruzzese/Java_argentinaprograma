import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// Escribir un programa que pida al usuario que ingrese su nombre (nextLine) y
//luego lo salude.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Podria decirme su nombre>> ");
        String saludo = scanner.nextLine();

        System.out.println("Hola "+saludo);

    }
}