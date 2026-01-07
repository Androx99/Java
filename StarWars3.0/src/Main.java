//Andres Ara
//14/10/2025
//RELLENAR TABLERO CON X 10x10, Darth Vader en casilla aleatoria excepto 9,9

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int filas = 10;
        int columnas = 10;

        // Como inicializar una matriz (listas):
        int[][] tablero = new int[filas][columnas];
        //Primero indicamos que es una matriz con numeros enteros: int[] []
        //Segundo indicamos el nombre de la matriz: tablero
        //Tecero creamos iniamos la matriz indicando su tamaño: new int[filas][columnas]

        int largo_rndm, ancho_rndm;
        do {
            largo_rndm = random.nextInt(10);
            ancho_rndm = random.nextInt(10);
        }while (largo_rndm != 9 & ancho_rndm != 9);




    }
}