import java.util.Random;


public class Main {
    static final int[][] matriz = new int[3][9];
    static final Random random = new Random();

    static void RellenarMatriz(){
        for (int col = 0; col < matriz[0].length; col++) {
            int min = 10 + (col * 10); // valor mínimo para la columna actual
            int max = min + 9;     	// valor máximo para la columna actual

            for (int row = 0; row < matriz.length; row++) {
                matriz[row][col] = random.nextInt(max - min + 1) + min;
            }
        }
    }

    static void MostrarMatriz(){
        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[row][col] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Llenar la matriz de acuerdo al rango en cada columna
        RellenarMatriz();

        // Imprimir la matriz
        MostrarMatriz();
    }
}
