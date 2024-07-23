import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora básica");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();

        System.out.print("Ingrese el primer número de su operacion: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número de su op eraciom: ");
        int num2 = scanner.nextInt();

        int resultado = 0;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: no se puede dividir entre cero");
                    return;
                }
                break;

            default:
                System.out.println("Opción inválida");
                return;
        }
        System.out.println("resultado: " + resultado);
    }
}

