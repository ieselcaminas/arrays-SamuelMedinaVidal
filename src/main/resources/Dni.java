public class Dni {
    public static void main(String[] args) {
        int numDni = Utilidades.leerEntero("Dime el número sin letra de tu dni: ");
        System.out.println(letraDni(numDni));
    }
    public static char letraDni(int numDni) {
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int calculo = numDni % 23;
        return letrasDNI[calculo];
    }
}
