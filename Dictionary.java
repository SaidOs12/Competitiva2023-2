import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Dictionary {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int p = Integer.parseInt(sc.next());
        int cantidad = Integer.parseInt(sc.next());

        String[] palabras = new String[p];

        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = sc.next();
        }

        Arrays.sort(palabras);

        while (cantidad-- > 0) {
            int rta = 0;
            String inicioW = sc.next();
            String finalW = sc.next();

            int startIndex = busquedaBinariaInicio(palabras, inicioW);
            int endIndex = busquedaBinariaFinal(palabras, finalW);
            rta = endIndex - startIndex + 1;

            out.println(rta);
        }
        out.close();
    }

    public static int busquedaBinariaInicio(String[] arreglo, String palabra) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            int comparacion = palabra.compareTo(arreglo[medio]);

            if (comparacion == 0) {
                return medio;
            }

            if (comparacion < 0) {
                derecha = medio - 1;
            } else {
                izquierda = medio + 1;
            }
        }

        return (izquierda + (derecha - izquierda) / 2);
    }
    
        public static int busquedaBinariaFinal(String[] arreglo, String palabra) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            int comparacion = palabra.compareTo(arreglo[medio]);

            if (comparacion == 0) {
                return medio;
            }

            if (comparacion < 0) {
                derecha = medio - 1;
            } else {
                izquierda = medio + 1;
            }
        }
        return (izquierda + (derecha - izquierda) / 2)-1;
    }
        
    static class Scanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        int spaces = 0;
        
        public String next() throws IOException {
            if(spaces-->0) return "";
            while(!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
    }
}
