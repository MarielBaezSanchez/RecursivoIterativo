import java.util.Scanner;

public class algoritmoIterativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Programa para encontrar el Maximo Comun Divisor (MCD )de dos numeros enteros.");
        System.out.println("-------------------Version Iterativa------------------");

        System.out.print("Por favor,introduzca el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Por favor,introduzca el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("El Maximo Comun Divisor de " + num1 + " y " + num2 + " es: " + mcd(num1, num2));
    }

    public static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}