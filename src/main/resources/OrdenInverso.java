import javax.swing.text.Utilities;
import java.util.Scanner;

public class OrdenInverso {
    public static void main(String[] args) {
        int [] array = new int [10];
        rellenarArray(array);
        System.out.println(arrayInverso(array));
    }
    public static void rellenarArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime un número para el array: ");
            array[i] = scanner.nextInt();
        }
    }
    public static String arrayInverso(int [] array){
        String resultado = "";
        for (int i = array.length - 1; i >= 0; i--) {
            resultado += array[i] + " ";
        }
        return resultado;
    }
}
