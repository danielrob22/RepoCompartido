package githubcompartido;

import java.util.Arrays;
import java.util.Scanner;

public class ahorcado {
//Prueba
    public static void main(String[] args) {
        //Se declaran variables
        Scanner in = new Scanner(System.in);
        int intentos = 0;
        int x = 0; //Variable que se utilizará para mostrar las letras falladas
        //String de palabras relacionadas con la programacion para jugar al ahorcado
        String palabras[] = {"Programa", "Codigo", "Desarrollo", "Compilar", "Depurar", "Array", "Variable", "Funcion", "Objeto", "Bucle"};
        int numeroAleatorio = (int) (Math.random() * 10);
        //Se selecciona una palabra aleatoria de la lista
        String palabra = palabras[numeroAleatorio];
        //Array que almacena el monigote
        String[] monigote = {"---", "   |", "   |", "   |", "  --- ", "   0", "  \\ /", "   |", "   |", "  / \\"};
        char array[] = palabra.toCharArray(); //Array que almacena la palabra en chars
        //Arrays que se usan para almacenar las letras falladas, usadas y acertadas del usuario
        char espacios[] = new char[palabra.length()];
        char usadasFallo[] = new char[11];
        char usadas[] = new char[11];
        //Se rellenan los arrays
        Arrays.fill(espacios, '-');
        Arrays.fill(usadasFallo, ' ');
        Arrays.fill(usadas, ' ');
        System.out.println("Vamos a jugar al ahorcado\nLa palabra tiene " + palabra.length() + " letras ");
        for (int i = 0; i < espacios.length; i++) {
            System.out.print(espacios[i]);
            
        }
        System.out.println("");
        while (intentos <= 10) {
            //Booleanos para determinar si el usuario ha ganado el juego y si ha acertado la letra
            boolean ganar = true;
            boolean encontrada = false;
            if (intentos == 10) { //Control para salir del juego cuando se tienen 10 fallos
                System.out.println("Te has quedado sin intentos, has perdido");
                break;
            }
            System.out.println("Introduce una letra: ");
            char letra = in.nextLine().charAt(0);
            for (int i = 0; i < array.length; i++) {
                //Cuando el usuario introduce una letra se controla que no la haya metido antes
                while (letra == usadas[i] || letra == usadasFallo[i]) {
                    System.out.println("Has introducido una letra que ya has usado, introduce una distinta: ");
                    letra = in.nextLine().charAt(0);
                    i = 0;
                }
            }
            for (int i = 0; i < array.length; i++) {
                //Si la letra del usuario está contenida en la palabra, se asigna al array que muestra el progreso del juego
                if (letra == array[i]) {
                    espacios[i] = letra;
                }
            }
            for (int i = 0; i < espacios.length; i++) {
                //Cundo el usuario introduce una o varias letras correctas, se informa de que la letra esta en la palabra
                if (espacios[i] == letra) {
                    usadas[i] = letra;
                    System.out.println("La letra " + letra + " está en la palabra!");
                    encontrada = true;
                    break;
                }
            }
             for (int i = 0; i < espacios.length; i++) {
                    //Si el usuario ha acertado la letra, se muestra su progreso
                    System.out.print(espacios[i]);
                }
             System.out.println("");
             //Cuando el usuario introduce una letra correcta, se comprueba si ha ganado
             for (int i = 0; i < palabra.length(); i++) {
                if (espacios[i] != palabra.charAt(i)) {
                    ganar = false;
                }
            }
            if (ganar == true) {
                System.out.println("Has adivinado la palabra, has ganado el juego!");
                break;
            }
            if (encontrada == false) {
                /**
                 * Si la letra que ha metido el usuario no está en la palabra,
                 * se suma un fallo y se almacena en el array para mostrar las
                 * letras falladas. Con un switch se va mostrando el muñeco
                 * segun la cantidad de fallos
                 */
                intentos++;
                usadasFallo[x] = letra;
                x++;
                System.out.println("La letra " + letra + " no está en la palabra! Te quedan " + intentos + " intentos");
                switch (intentos) {
                    case 1 -> {
                        for (int j = 0; j < 1; j++) {
                            System.out.println(monigote[j]);
                        }
                    }
                    case 2 -> {
                        for (int j = 0; j < 2; j++) {
                            System.out.println(monigote[j]);
                        }
                    }
                    case 3 -> {
                        for (int j = 0; j < 3; j++) {
                            System.out.println(monigote[j]);
                        }
                    }
                    case 4 -> {
                        for (int j = 0; j < 4; j++) {
                            System.out.println(monigote[j]);
                        }
                    }
                    case 5 -> {
                        for (int j = 0; j < 5; j++) {
                            System.out.println(monigote[j]);
                        }
                    }
                    case 6 -> {
                        for (int j = 0; j < 6; j++) {
                            System.out.println(monigote[j]);
                        }
                    }
                    case 7 -> {
                        for (int j = 0; j < 7; j++) {
                            System.out.println(monigote[j]);
                        }
                    }
                    case 8 -> {
                        for (int j = 0; j < 8; j++) {
                            System.out.println(monigote[j]);
                        }
                    }
                    case 9 -> {
                        for (int j = 0; j < 9; j++) {
                            System.out.println(monigote[j]);
                        }
                    }
                    case 10 -> {
                        for (int j = 0; j < 10; j++) {
                            System.out.println(monigote[j]);
                        }
                    }
                }
            } 
            //Se muestran las letras falladas por el usuario
            System.out.println("");
            System.out.println("Letras falladas: ");
            for (int i = 0; i < 10; i++) {
                if (usadasFallo[i] == ' ') {
                    break;
                }
                System.out.print(usadasFallo[i] + " ");
            }
            System.out.println("");
            
        }
    }
}
