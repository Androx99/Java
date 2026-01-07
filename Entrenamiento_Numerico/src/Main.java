import java.util.Random;
public class Main {
    public static void main(String[] args) {
            int suma = 0;
            int[] numeros = new int[10] ;
            Random random = new Random();
            for (int i=0; i < numeros.length; i++){
                int num_aleatorio = random.nextInt(10);
                numeros [i] = num_aleatorio;
            }
            for (int i=0; i < numeros.length; i++){
                suma += numeros[i];
                System.out.print(numeros[i] + " ");
            }
        System.out.println("\nLa suma es igual a: "+ suma);
    }
}
//public class Main {
//    public static void main(String[] args) {
//        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//        //int[] numeros2 = new int[10];
//        int suma = 0;
//        for (int i = 0; i < numeros.length; i++) {
//            suma += numeros[i];
//            suma = suma + numeros[i];
//        }
//        System.out.println(suma);
//    }