
import java.util.Scanner;

public class CalculadoraPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una operación matemática ( 2+2, 5*3, 10-4, 8/2): ");
        String operacion = scanner.nextLine();

        String[] partes = operacion.split("[+*/-]");

        double num1 = Double.parseDouble(partes[1]);
        double num2 = Double.parseDouble(partes[2]);
        int operador = operacion.charAt(partes[0].length());

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2!= 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: no se puede dividir entre cero");
                    return;
                }
                break;
            default:
                System.out.println("Error: operador no válido");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}