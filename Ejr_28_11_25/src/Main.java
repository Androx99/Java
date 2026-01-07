// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



public class Main {
    static final int[] numeros = {1, 3, 5, 2, 8, 7, 10, 6};
    static int maximo = numeros[0];
    static int numeroMaximo (int[] array ){
        // Bucle optimizado: Encuentra y muestra el máximo en una sola pasada
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }
        public static void main(String[] args) {

            System.out.println("El número máximo en el array es: " + numeroMaximo(numeros));

        }
}
