import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "EDIFICIO"; // palabra secreta
        //String letrasAdivinadas = "c";
        char letrasAdivinadas = 'c';

        // Mostramos el progreso
        // letrasAdivinadas.indexOf(letra) != -1
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            //
            if(letra==letrasAdivinadas){
                //if (letra==letrasAdivinadas.charAt(0)) {
                System.out.print(letra + " ");
            } else {
                System.out.print("_ ");
            }
        }
    }
}
public class Main_Prime  {
    public static void main(String[] args) {
        //INCIALIZAR VARIABLES
        Scanner sc = new Scanner(System.in); //sc nombre escaner
        int cont_letras= 0;
        int num_aciertos=0;
        char letra_user;
        //PALABRA A ADIVINAR
        String palabra_adivinar =  "casa";
        char[] palabra = palabra_adivinar.toLowerCase().toCharArray();
        for (int i=0;i<palabra.length;i++){
            if (Character.isLetter(palabra[i])){
                cont_letras++;
            }
        }
        //RELLENAR ARRAY PARA EL USUARIO
        char[] palabra_usuario = new char [cont_letras];
        char relleno = '_';
        for (int i=0;i<palabra_usuario.length;i++){
            palabra_usuario[i]=relleno;
        }
        //PARTE DEL JUEGO
        do { //HASTA QUE SE ACIERTE LA PALABRA
            System.out.print("Introduce una letra: ");
            letra_user = sc.next().charAt(0);
            //COMPROBAR SI EL USUARIO A ACERTADO
            for(int i=0;i<palabra.length;i++){
                if (palabra[i]==letra_user && palabra_usuario[i]!=letra_user){
                    palabra_usuario[i]=palabra[i];
                    num_aciertos++;
                }
            }
            //MOSTRAR ACIERTOS AL USUARIO
            for (int i=0;i<palabra_usuario.length;i++){
                System.out.print(palabra_usuario[i] + " ");
            }
        }while (num_aciertos!=cont_letras);
        System.out.println("Enorabuena has acertado!!");

    }