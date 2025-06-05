package es.vedruna;

import java.util.Scanner;

public class Calculadora {

    // Metodos para poder pasar por los test
    public static float sumar(float a, float b) {
        return a + b;
    }

    public static float restar(float a, float b) {
        return a - b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        if (b == 0f) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a / b;
    }

    // Metodo para la consola .
    public static void calcular() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        float numero1 = scan.nextFloat();

        System.out.print("Introduce otro número: ");
        float numero2 = scan.nextFloat();

        System.out.println("Elige operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int operacion = scan.nextInt();

        try {
            float resultado = switch (operacion) {
                case 1 -> sumar(numero1, numero2);
                case 2 -> restar(numero1, numero2);
                case 3 -> multiplicar(numero1, numero2);
                case 4 -> dividir(numero1, numero2);
                default -> throw new IllegalArgumentException("Operación no válida");
            };

            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
