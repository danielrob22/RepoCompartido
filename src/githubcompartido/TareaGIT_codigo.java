package PracticaGIT;

import java.util.Scanner;

public class TareaGIT_codigo {

    public static void main(String[] args) {
        String cambio="Esta variable la ha escrito Daniel";
        System.out.println(cambio);
        /*ENUNCIADO
            Pida 10 n�meros por teclado y saque lo siguiente por pantalla: 
                - Suma de esos 10 n�meros.
                - Cu�ntos n�meros positivos hay.
                - Cu�ntos n�meros negativos hay. 
         */
        
        Scanner scanner = new Scanner(System.in);

        // Pedir 10 n�meros por teclado
        double[] numeros = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el n�mero " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Calcular la suma de los n�meros
        double sumaTotal = 0;
        for (double numero : numeros) {
            sumaTotal += numero;
        }

        // Contar n�meros positivos y negativos
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
        System.out.println("La suma de los n�meros es: " + sumaTotal);
        System.out.println("Cantidad de n�meros positivos: " + positivos);
        System.out.println("Cantidad de n�meros negativos: " + negativos);
    }
}