import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] mochila = new String[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mochila.length; i++){
            System.out.print("Escrbe tus artilugios: ");
            mochila[i] = sc.next();
        }
        for (int i = 0; i < mochila.length; i++){
            System.out.print(mochila[i] + " " );
        }
    }
}