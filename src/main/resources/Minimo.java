import java.util.Scanner;

public class Minimo {
    public static void main(String[] args) {
        int array [] = new int[10];
        rellenarArray(array);
        System.out.println(numMenor(array));
    }
    public static void rellenarArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime un número para el array: ");
            array[i] = scanner.nextInt();
        }
    }
    public static int numMenor(int[] array) {
        int masMini = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < masMini) {
                masMini = array[i];
            }
        }
        return masMini;
    }
}
