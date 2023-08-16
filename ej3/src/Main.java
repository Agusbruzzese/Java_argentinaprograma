import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// Pedir al usuario que ingrese dos números enteros por teclado e imprimir
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.printf("ingrese un numero: ");
        int num = scanner.nextInt();
        System.out.printf("ingrese otro numero: ");
        int num2 = scanner.nextInt();

        int suma = num + num2;
        int resta = num - num2;
        int mult = num * num2;
        float div = num / num2;

        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicacion es: "+ mult);
        System.out.println("La division es: "+ div);
    }
}