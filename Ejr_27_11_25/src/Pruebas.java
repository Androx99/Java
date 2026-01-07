import java.util.Arrays;
import java.util.Scanner;
public class Pruebas {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Array en orden ascendente: " + Arrays.toString(array));
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);

        Scanner scanner = new Scanner(System.in);
        // Paso 1: Leer un número entero del usuario
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Paso 2: Convertir el número a una cadena
        String cadena = Integer.toString(numero);
        System.out.println("Número convertido a cadena: " + cadena);

        //Pasar una palabra a letras
        char[] caracteres = cadena.toCharArray();
        System.out.println("Cadena convertida a caracteres:");

        for (char c : caracteres) {
            System.out.println("Carácter: " + c);
        }
    }

}

