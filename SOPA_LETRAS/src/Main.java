import java.util.Random;
public class Main {
    static final Random rd = new Random();
    static final int tamañoSopaLetras = 10;
    static final String [] PalabrasAdivinar = new String[] {"Hola","que","ase"};
    static char [][] sopaLetras = new char[tamañoSopaLetras][tamañoSopaLetras];
    static char [][] tableroPalabras = new char [tamañoSopaLetras][tamañoSopaLetras];
    static final char relleno = '*';
    static char [] letrasRandom = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m', 'n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
    static void rellenarTableroLetras (char[][] tablero ){
        for (int i = 0; i < tablero.length;i++){
            for (int j = 0; j < tablero.length;j++){
                tablero[i][j] = letrasRandom[rd.nextInt(letrasRandom.length)];
            }
        }
    }
    static void rellenarTableroRelleno(char[][] tablero ){
        for (int i = 0; i < tablero.length;i++){
            for (int j = 0; j < tablero.length;j++){
                tablero[i][j] = relleno;
            }
        }
    }
    static void imprimirTablero (char[][] tablero ){
        for (int i = 0; i < tablero.length;i++){
            for (int j = 0; j < tablero.length;j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean salirBordeX ( char [][] tablero,int x){
        boolean fueraRango = true;
        if (x+PalabrasAdivinar[0].length() > tablero.length){
        }
        return fueraRango;
    }
    static boolean salirBordeY ( char [][] tablero, int y){
        boolean fueraRango = true;
        if (y+PalabrasAdivinar[0].length() > tablero.length){
        }
        return fueraRango;
    }
    static void introducirPalabras (char[][] tablero){
        int x = rd.nextInt();
        int y = rd.nextInt();
        if (x+PalabrasAdivinar[0].length() > tableroPalabras.length){

        }
    }
    public static void main(String[] args) {
        rellenarTableroLetras(sopaLetras);
        rellenarTableroRelleno(tableroPalabras);
        imprimirTablero(sopaLetras);
        System.out.println();
        imprimirTablero(tableroPalabras);
    }
}