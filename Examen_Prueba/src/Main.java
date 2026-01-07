// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Random;
public class Main {
    static final int tamaño_tablero = 10;
    static final char relleno_1 = 'L';
    static final char relleno_2 = 'X';
    static final char personaje = 'A';
    static int personajex;
    static int personajey;
    //MOVIMIENTO CON TECLADO NUMERICO. Orden 789,456,123
    static final int[] movimientox = new int[]{-1,0,1,-1,0,1,-1,0,1};
    static final int[] movimientoy = new int[]{-1,-1,-1,0,0,0,1,1,1};
    static final char pocimas = 'P';
    static final int num_pociones = 10;
    static final char[][] tablero_1 = new char[tamaño_tablero][tamaño_tablero];
    static final char[][] tablero_2 = new char[tamaño_tablero][tamaño_tablero];
    static final Random rd = new Random();


    //1-RELLENAR MATRIZ
    static void rellenar (char tablero [][],char relleno){
        //RELLENAR MATRIZ
        for (int i = 0; i<tablero.length; i++){
            for (int j = 0; j<tablero[i].length; j++){
                tablero[i][j]= relleno;
            }
        }
    }
    //2-RELLENAR MATRIZ ALEATORIAMENTE
    static void rellenar_aleatorio (char tablero [][],char rellenox,char rellenoy){
        //RELLENAR MATRIZ_Aleatoriamente hasta que se llene
        int i = 0;

        do {
            int x = rd.nextInt(tablero.length);
            int y = rd.nextInt(tablero[0].length);
            if (tablero[x][y] ==rellenox){
                tablero[x][y] = rellenoy;
                i ++;
            }
        } while (i<tablero.length*tablero[0].length);
    }
    //1-MOSTRAR MATRIZ
    static void mostrar (char tablero [][]){
        //MOSTRAR MATRIZ
        for (int i = 0; i<tablero.length; i++){
            for (int j = 0; j<tablero[i].length; j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //4-AGREGAR PERSONAJE EN CASILLA ALEATORIA
    static void agregarpersonajeA(char tablero [][]){
        int x = 9;
        int y = 9;
        do {
            x = rd.nextInt(tablero.length);
            y = rd.nextInt(tablero[0].length);
        } while (x == tablero.length-1 || y == tablero[0].length-1);
        tablero[x][y]=personaje;
        personajex = x;
        personajey =y;
    }
    //5-AGREGAR POCIONES EN CASILLA ALEATORIA
    static void agregarpociones(char tablero [][]) {
        int x = 9;
        int y = 9;
        int contador = 0;
        do {
                do {
                    x = rd.nextInt(tablero.length);
                    y = rd.nextInt(tablero[0].length);
                } while (x == tablero.length - 1 || y == tablero[0].length - 1 || tablero[x][y] != relleno_1);
            tablero[x][y] = pocimas;
            contador ++;
        }while(contador<num_pociones);
    }
    //6-MOVIMIENTO DIAGONAL PERSONAJE
    static void movimientoP(char tablero [][], char user_input) {
        if (user_input =='7'){

        }
    }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static void main(String[] args) {


        //EJERCICIO 1
        rellenar(tablero_1,relleno_1);
        mostrar(tablero_1);
        //EJERCICIO 2
        rellenar(tablero_2,relleno_2);
        mostrar(tablero_2);
        rellenar_aleatorio(tablero_2,relleno_2,relleno_1);
        mostrar(tablero_2);
        //EJERCICIO 4
        agregarpersonajeA(tablero_1);
        mostrar(tablero_1);
        //EJERCICIO 5
        agregarpociones(tablero_1);
        mostrar(tablero_1);
        //EJERCICIO 6

     }
}