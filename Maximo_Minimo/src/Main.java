// Andres Ara
//14/10/2025
//Sacar Maximo minimo de un numero

//Este import sirve para que puedas leer los input del usuario
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos que la variable user_input se va usar para escanear el input del usuario (el nombre "default" deberia es snanne, pero se puede poner lo que quieres Ejm: sc)
        Scanner user_input = new Scanner(System.in);

        int num_user, suma, max, min;

        // Pedimos el primer numero
        System.out.print("Introduce un numero: "); //System.out.print para escribir al usuario en pantalla (print a secas no hace salto de linea)
        num_user = user_input.nextInt();
        // Inicializamos suma, max y min con el primer numero
        suma = num_user;
        max = num_user;
        min = num_user;

        // Bucle que se repite 4 veces más (en total seran 5 números)
        for (int i = 1; i <= 4; i ++) { //Igual que en python 1º Iniciar variable "indice" 2ºComo sale el bucle  3º El paso del "indice ( i ++ es lo mismo que i = i +1 )"
            //Pedir numeros al usuario
            System.out.print("Introduce otro numero: ");
            num_user = user_input.nextInt();

            //Sumar a la suma el numero del usuario [+= seria lo mismo que suma = suma + num_user]
            suma += num_user;

            //Detectar si el numero del usuario es mayor o menor
            if (num_user > max) {
                max = num_user;
            } else if (num_user < min) {
                min = num_user;
            }
        }
        //Se usa + para unir variables y texto (println añade salto de linea despues de escribirlo en pantalla) ("\n" añade un salto de linea)
        System.out.println("El número menor es: " + min + "\n" + "El número mayor es: " + max + "\n" + "La suma total es: " + suma);



    }
}
