public class Bingo {
    static final int [][]matriz = new int[3][9];

    public static void main(String[] args) {



        int[] a1 = new int[10];
        int[] a2 = new int[10];
        for(int i = 0; i < a1.length - 1 ; i++) {
            a1[i]=47;
            a2[i]=47;
        }
        if(a1[9]== a2[9]) {
            System.out.println("True.\n");
        } else {
            System.out.println("False.\n");
        }
        a2[3] = 11;
        if(a1[9]== a2[9] ||  a1[3]== a2[3]) {
            System.out.println("True.\n");
        } else {
            System.out.println("False.\n");
        }
        String[] s1 = new String[6];
        for(int i= 0; i < s1.length -1 ; i++) {
            s1[i]="Hi";
        }
        String[] s2 = {"Hi", "Hi", "Hi", "Hi", "Hi"};
        int i = 1;
        if(s1[i].equals(s2[i])){
            System.out.println("True.\n");
        } else {
            System.out.println("False.\n");
        }

    }
}


