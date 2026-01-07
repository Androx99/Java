import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    static final char[] CODES = {'D','A','M','I','C'};
    static final String[] NOMBRES = { "DESAYUNOS","COMIDAS","MERIENDAS","CENAS","COPAS"};

    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        float[] sumaPorCategoria = new float [CODES.length];
        int[] contarEntradasPorCategoria =  new int [CODES.length];

        String linea;
        while ((linea = br.readLine()) != null){
            linea = linea.trim();
            if(linea.isEmpty()) continue;
            StringTokenizer st = new StringTokenizer(linea);
            String textoCategoria = st.nextToken();
            float importe = Float.parseFloat(st.nextToken());
            if(textoCategoria.equals("N") && importe ==  0.0f){

            }else{
                char codigo = textoCategoria.charAt(0);
                int posQueOcupaCategoria = getPostCategoria(codigo);
            }
        }

    }
    static void getPostCategoria(char cod){
        for (int i = 0; i < CODES.length; i++) {
            if (CODES[i] == cod){
                return i;
            }
        }
    }
}