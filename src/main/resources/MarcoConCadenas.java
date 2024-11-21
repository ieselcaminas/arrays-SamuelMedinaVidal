import java.util.Scanner;

class MarcoConCadenas {
    public static void main(String[] args) {
        String[] cadenas = new String[5];
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Introduce 5 cadenas de texto:");
        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = miScanner.nextLine();
        }
        miScanner.close();

        int longitudMax = masGrande(cadenas).length();
        crearMarco(cadenas, longitudMax);
    }

    public static String masGrande(String[] cadenas) {
        String max = "";
        for (String cadena : cadenas) {
            if (cadena.length() > max.length()) {
                max = cadena;
            }
        }
        return max;
    }

    public static void crearMarco(String[] cadenas, int longitudMax) {
        System.out.println(imprimirLineaMarco(longitudMax));
        for (String cadena : cadenas) {
            imprimirLineaTexto(cadena, longitudMax);
        }
        System.out.println(imprimirLineaMarco(longitudMax));
    }

    public static String imprimirLineaMarco(int longitudMax) {
       String cadena = "";
       for (int i = 0; i < longitudMax + 4; i++){
           cadena += "*";
       }
       return cadena;
   }

    public static void imprimirLineaTexto(String cadena, int longitudMax) {
        int espaciosNecesarios = longitudMax - cadena.length();

        String linea = "* " + cadena;

        for (int i = 0; i < espaciosNecesarios; i++) {
            linea += " ";
        }

        linea += " *";
        System.out.println(linea);
    }
}
