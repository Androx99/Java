import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // ------------------- Declaracion de variables ----------------
        int myEntero = 1;
        boolean myBoolean = true;
        String myString = "Hello There";
        char myChar = 'x';

        //-------------- Sentencias de control ----------------

        if (myBoolean == true) { //Tambien se puede escribir como = (myBoolean) para verdadero y  (!myBoolean) para falso
            System.out.println("Vedadero!!");
        } else {
            System.out.println("Falso!!");
        }

        // ------------Bucles--------------
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola que ase");
        }

        int contador = 0;
        do {
            System.out.println(contador);
            contador++;
        } while (contador < 10);


        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }
        int arrayNumeros[] = new int [10];
        char arrayCaracteres[] = new char [10];
        String arraycCadenas[] = new String [10];
        int matrizNumeros[][] = new int [10][10];

        for (int i=0; i<10;i++){
            arrayNumeros[i] = 1;
        }
        for (int i=0; i<10;i++){
            for (int j=0; j<10;j++){
                matrizNumeros[i][j] = 1;
            }
        }
        Random aleatorio = new Random();
        int al = aleatorio.nextInt(10);
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++) {
                al = aleatorio.nextInt(10);
                matrizNumeros[i][j] = al;
            }
        }


    }
}