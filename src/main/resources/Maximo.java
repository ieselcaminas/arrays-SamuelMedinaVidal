import java.util.Scanner;

public class Maximo {
    public static void main(String[] args) {
        int array [] = new int[10];
        rellenarArray(array);
        System.out.println(masGrande(array));
    }
    public static void rellenarArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime un número para el array: ");
            array[i] = scanner.nextInt();
        }
    }
    public static int masGrande(int[] array) {
        int masGrande = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > masGrande) {
                masGrande = array[i];
            }
        }
        return masGrande;
    }
}
