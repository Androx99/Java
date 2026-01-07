import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una palabra: ");
        String palabra = sc.nextLine(); //Almacena lo escrito por el usuario
        char [] letra = palabra.toCharArray(); //tochararray pasa una frase a una lista de caracteres

        for (int i = 0; i < letra.length; i++) {
            System.out.print(letra[i]+" ");
        }
        sc.close();
    }
}