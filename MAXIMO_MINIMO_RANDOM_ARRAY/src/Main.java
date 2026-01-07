//Importamos la funcion random
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Declaramos las variables
       int[] array = new int [10];
       int max;
       int min;
       //Damos nombre a la funcion random
       Random random = new Random();

       //BUCLE AÑADIR NUMEROS ALEATORIOS
       for (int i=0; i < array.length; i++){
           int num_aleatorio = random.nextInt(101);
           array [i] = num_aleatorio;
       }
       //BUCLE MOSTRAR NUMEROS EN PANTALLA
       for (int i=0; i < array.length; i++){
           System.out.print(array[i] + " ");
       }
       //INICIALIZAMOS VARIABLES MAX Y MIN
       max = array[0];
       min = array[0];
       //BUCLE BUSCAR MAXIMOS EN ARRAY
        for (int i=1; i < array.length; i++){
            if (array[i]>max){
                max =  array [i];
            }
        }
        //BUCLE BUSCAR MINIMOS EN ARRAY
        for (int i=1; i < array.length; i++){
            if (array[i]<min){
                min = array [i];
            }
        }
        //Mostramos Maximos y mismos al usuario
        System.out.println("\nEl maximo es: "+max+"\nEl minimos es: "+ min);


    }
}