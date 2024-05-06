package PracticaGIT;

import java.util.Scanner;

public class TareaGIT_codigo {

    public static void main(String[] args) {
        /*ENUNCIADO
            Pida 10 números por teclado y saque lo siguiente por pantalla: 
                - Suma de esos 10 números.
                - Cuántos números positivos hay.
                - Cuántos números negativos hay. 
         */
        
        Scanner scanner = new Scanner(System.in);

        // Pedir 10 números por teclado
        double[] numeros = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Calcular la suma de los números
        double sumaTotal = 0;
        for (double numero : numeros) {
            sumaTotal += numero;
        }

        // Contar números positivos y negativos
        int positivos = 0;
        int negativos = 0;
        for (double numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        // Mostrar los resultados
        System.out.println("La suma de los números es: " + sumaTotal);
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
    }
}
