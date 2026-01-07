import java.util.Scanner;
public class Main {
    public static int calcularSuma(int[] V){
        int suma = 0;
        for (int i = 0; i < V.length; i++) {
            suma += V[i];
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 10;
        int[] V = new int[N];
        for (int i = 0;i<V.length;i++){
            System.out.println("Introduce el "+i+" numero O introduce 0 para dejar el bucle");
            int user_input= sc.nextInt();
            V[i]=user_input;
        }




        System.out.print(calcularSuma(V));

    }
}