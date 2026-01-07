import java.util.Random;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final Random aleatorio = new Random();
    //Definir las variables del tablero
    static final int tamaño_tablero = 10;
    static char tablero [][] = new char[tamaño_tablero][tamaño_tablero];
    static final char relleno = 'X';

    //Rellenar el tablero
    static void Rellenar_tablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = relleno;
            }
        }
    }
    //variables para el homer
    static final char HOMER  = 'H';
    static int fila_aleatorio () {
        int fila_aleatoria = aleatorio.nextInt(0,9);
        return fila_aleatoria;
    }
    static int columna_aleatorio (){
        int columna_aleatoria = aleatorio.nextInt(0,9);
        return columna_aleatoria;
    }
    static int posicion_X;
    static int posicion_Y;
    static int posicion_X_auxiliar;
    static int posicion_Y_auxiliar;

    //Poner al Homer
    static void colocar_homer (){
        int fila;
        int columna;
        //colocar al HOMER, SOLO si la casilla está libre
        do{
            fila =fila_aleatorio();
            columna=columna_aleatorio();
        }while(comprobar_casilla(fila,columna)== false && comprobar_libre(fila,columna)== false);
        tablero[fila][columna] = HOMER;
        //guardar posiciones para los movimientos.
        posicion_X = fila;
        posicion_Y = columna;
        posicion_X_auxiliar =posicion_X;
        posicion_Y_auxiliar = posicion_Y;
    }

    //comprobar que no está en la [9][9]
    static boolean comprobar_casilla (int fila_comprobacion, int columna_comprobacion){
        if (fila_comprobacion == 9 && columna_comprobacion == 9){
            return true;
        }
        return false;
    }

    //comprobar que la cassilla está libre para homer
    static boolean comprobar_libre(int fila_libre, int columna_libre){
        if (tablero[fila_libre][columna_libre] == relleno){
            return true;
        }
        return false;
    }

    //variables para los muros
    static final char MURO ='M';
    static final int cant_muro= 10;
    //colocar los muros
    static void colocar_muro () {
        int fila;
        int columna;
        //colocar los muros, SOLO si la casilla está libre
        for (int contador = 0; contador < cant_muro; contador++) {
            do {
                fila = fila_aleatorio();
                columna = columna_aleatorio();
            } while (comprobar_casilla(fila,columna) == false && comprobar_libre(fila,columna) == false);
            tablero[fila][columna] = MURO;
        }
    }
    //No pasar por los muros
    static boolean no_pasar (){
        if(tablero[posicion_X_auxiliar][posicion_Y_auxiliar] == MURO) {
            return true;
        }
        return false;
    }

    //Hacer que si llega al borde, no pueda pasar
    static boolean salir_borde(){
        if(posicion_X_auxiliar < 0 || posicion_X_auxiliar > tablero.length -1 || posicion_Y_auxiliar < 0 || posicion_Y_auxiliar > tablero.length -1 ){
            return true;
        }
        return false;
    }
    //variables para los BART
    static final char BART ='B';
    static final int cant_bart= 5;

    //colocar a los 5 BART
    static void colocar_bart () {
        int fila;
        int columna;
        //poner los BART, SOLO, si la casilla está libre
        for (int contador = 0; contador < cant_bart; contador++) {
            do {
                fila = fila_aleatorio();
                columna = columna_aleatorio();
            } while (comprobar_casilla(fila, columna) == false && comprobar_libre(fila, columna) == false);
            tablero[fila][columna] = BART;
        }
    }

    //variables para las pociones
    static final char pociones  ='P';
    static int cant_pociones = 3;

    //colocar las 3 pociones en el mapa
    static void colocar_pociones (){
        int fila;
        int columna;
        //poner las pociones, SOLO, si la casilla está libre
        for(int contador = 0;contador < cant_pociones; contador++){
            do {
                fila = fila_aleatorio();
                columna = columna_aleatorio();
            } while (comprobar_casilla(fila, columna) == false && comprobar_libre(fila, columna) == false);
            tablero[fila_aleatorio()][columna_aleatorio()] = pociones;
        }
    }
    //entrada de usuario
    static String entrada_usuario= new String();

    //movimientos homer
    static void moviemiento() {
        System.out.println("Introduzca un movimiento (wasd, qezc)");
        entrada_usuario = sc.next();
        switch (entrada_usuario) {
            //movimientos hacia la izquierda
            case "a", "A":
                posicion_Y_auxiliar= posicion_Y-1;
                posicion_X_auxiliar = posicion_X;
                if(no_pasar()|| salir_borde()){
                    System.out.println("No puedes pasar");
                } else {
                    tablero[posicion_X][posicion_Y]=relleno; //
                    quitar_vida();
                    curarse();
                    posicion_X =posicion_X_auxiliar;
                    posicion_Y =posicion_Y_auxiliar;
                    tablero[posicion_X][posicion_Y] = HOMER;
                }
                break;
            //movimientos hacia arriba
            case "w","W":
                posicion_X_auxiliar = posicion_X - 1;
                posicion_Y_auxiliar = posicion_Y;
                if (no_pasar()|| salir_borde()){
                    System.out.println("Hay un muro, no puedes pasar");
                } else {
                    tablero[posicion_X][posicion_Y] = relleno;
                    quitar_vida();
                    curarse();
                    posicion_X =posicion_X_auxiliar;
                    posicion_Y =posicion_Y_auxiliar;
                    tablero[posicion_X][posicion_Y] = HOMER;
                }
                break;
            //movimientos hacía la derecha
            case "d","D":
                posicion_Y_auxiliar = posicion_Y + 1;
                posicion_X_auxiliar = posicion_X;
                if (no_pasar()|| salir_borde()){
                    System.out.println("Hay un muro, no puedes pasar");
                } else {
                    tablero[posicion_X][posicion_Y] = relleno;
                    quitar_vida();
                    curarse();
                    posicion_X =posicion_X_auxiliar;
                    posicion_Y =posicion_Y_auxiliar;
                    tablero[posicion_X][posicion_Y] = HOMER;
                }
                break;
            //movimientos hacía abajo
            case "s","S":
                posicion_X_auxiliar = posicion_X + 1;
                posicion_Y_auxiliar = posicion_Y;
                if (no_pasar()|| salir_borde()){
                    System.out.println("Hay un muro, no puedes pasar");
                } else {
                    tablero[posicion_X][posicion_Y] = relleno;
                    quitar_vida();
                    curarse();
                    posicion_X =posicion_X_auxiliar;
                    posicion_Y =posicion_Y_auxiliar;
                    tablero[posicion_X][posicion_Y] = HOMER;
                }
                break;
            case "e","E":
                posicion_X_auxiliar = posicion_X - 1;
                posicion_Y_auxiliar = posicion_Y + 1;
                if (no_pasar()|| salir_borde()){
                    System.out.println("Hay un muro, no puedes pasar");
                } else {
                    tablero[posicion_X][posicion_Y] = relleno;
                    quitar_vida();
                    curarse();
                    posicion_X =posicion_X_auxiliar;
                    posicion_Y =posicion_Y_auxiliar;
                    tablero[posicion_X][posicion_Y] = HOMER;
                }
                break;
            case "q","Q":
                posicion_X_auxiliar = posicion_X - 1;
                posicion_Y_auxiliar = posicion_Y - 1;
                if (no_pasar()|| salir_borde()){
                    System.out.println("Hay un muro, no puedes pasar");
                } else {
                    tablero[posicion_X][posicion_Y] = relleno;
                    quitar_vida();
                    curarse();
                    posicion_X =posicion_X_auxiliar;
                    posicion_Y =posicion_Y_auxiliar;
                    tablero[posicion_X][posicion_Y] = HOMER;
                }
                break;
            case "z","Z":
                posicion_X_auxiliar = posicion_X + 1;
                posicion_Y_auxiliar = posicion_Y + 1;
                if (no_pasar()|| salir_borde()){
                    System.out.println("Hay un muro, no puedes pasar");
                } else {
                    tablero[posicion_X][posicion_Y] = relleno;
                    quitar_vida();
                    curarse();
                    posicion_X =posicion_X_auxiliar;
                    posicion_Y =posicion_Y_auxiliar;
                    tablero[posicion_X][posicion_Y] = HOMER;
                }
                break;
            case "c","C":
                posicion_X_auxiliar = posicion_X + 1;
                posicion_Y_auxiliar = posicion_Y - 1;
                if (no_pasar()|| salir_borde()){
                    System.out.println("Hay un muro, no puedes pasar");
                } else {
                    tablero[posicion_X][posicion_Y] = relleno;
                    quitar_vida();
                    curarse();
                    posicion_X =posicion_X_auxiliar;
                    posicion_Y =posicion_Y_auxiliar;
                    tablero[posicion_X][posicion_Y] = HOMER;
                }
                break;
        }
    }
    static int vidas = 3;
    //función de quitar vida, si pasa por encima de una B, se resta vida
    static void quitar_vida (){
        if(tablero[posicion_X][posicion_Y] == BART) {
            tablero[posicion_X_auxiliar][posicion_Y_auxiliar] = HOMER;
            vidas = vidas - 1;
            System.out.println("Te quedan: " + vidas + " vidas");
        }
    }
    //función de curarse, si pasa por encima de una P, se cura
    static void curarse (){
        if(tablero[posicion_X][posicion_Y] == pociones) {
            vidas = vidas + 1;
            cant_pociones = cant_pociones - 1;
            System.out.println("Te quedan: " + vidas + " vidas");
            System.out.println("");
            System.out.println("Te quedan: " + cant_pociones + " pociones");
            System.out.println("");
        }
    }


    //mostrar tablero
    static void mostrar_tablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " "+ " ");
            }
            System.out.println();
        }
    }

    //Programa principal
    public static void main(String[] args) {
        Rellenar_tablero();
        colocar_homer();
        colocar_muro();
        colocar_bart();
        colocar_pociones();
        mostrar_tablero();

        do {
            moviemiento();
            mostrar_tablero();
            quitar_vida();
        }while(tablero[posicion_X][posicion_Y] != tablero[9][9]|| vidas == 0);
        if(vidas >0){
            System.out.println("Enhorabuena has ganado");
        }else{
            System.out.println("Womp womp has perdido");
        }
    }
}