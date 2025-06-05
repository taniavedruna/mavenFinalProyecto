package es.vedruna;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

  @Test
  void sumarDosNumeros() {
    System.out.println("Test: Sumar dos números");
    float a = 2.0f;
    float b = 3.0f;
    float expResul = 5.0f;
    float resultado = Calculadora.sumar(a, b);
    Assertions.assertEquals(expResul, resultado);
  }

  @Test
  void restarDosNumeros() {
    System.out.println("Test: Sumar dos números");
    float a = 3.0f;
    float b = 2.0f;
    float expResul = 1.0f;
    float resultado = Calculadora.restar(a, b);
    Assertions.assertEquals(expResul, resultado);
  }

  @Test
  void multiplicarDosNumeros() {
    System.out.println("Test: Sumar dos números");
    float a = 3.0f;
    float b = 2.0f;
    float expResul = 6.0f;
    float resultado = Calculadora.multiplicar(a, b);
    Assertions.assertEquals(expResul, resultado);
  }

  @Test
  void dividirDosNumeros() {
    System.out.println("Test: Sumar dos números");
    float a = 10.0f;
    float b = 2.0f;
    float expResul = 5.0f;
    float resultado = Calculadora.dividir(a, b);
    Assertions.assertEquals(expResul, resultado);
  }

  void dividirEntreCeroDebeLanzarExcepcion() {
    System.out.println("Test: Dividir entre cero (esperando excepción)");
    float a = 8.0f;
    float b = 0.0f;
    Assertions.assertThrows(ArithmeticException.class, () -> {
      Calculadora.dividir(a, b);});
  }

  @Test
  void dividirCeroEntreNumeroDebeDarCero() {
    System.out.println("Test: Dividir 0 entre un número");
    float a = 0.0f;
    float b = 4.0f;
    float expResul = 0.0f;
    float resultado = Calculadora.dividir(a, b);
    Assertions.assertEquals(expResul, resultado);
  }


}