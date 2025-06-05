package es.vedruna;

public class Calculadora {

    // Métodos públicos y estáticos para realizar operaciones matemáticas
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

}
