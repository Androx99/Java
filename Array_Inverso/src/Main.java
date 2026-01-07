public class Main {
    public static void main(String[] args) {
        //INICIALIZAR ARRAY
        char [] array = new char[] {'a','b','c','d','f','g'};

        //letras[i] = sc.nextLine().charAt(0); (Para poder hacer print solo a un
        //caracter

        //MOSTRAR ARRAY
        for (int i=0;i < array.length;i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");
        //MOSTRAR ARRAY INVERSO
        for (int i = array.length -1;i >= 0;i--){
            System.out.print(array[i]+" ");
        }
    }
}