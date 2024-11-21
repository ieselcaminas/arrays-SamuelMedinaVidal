import java.util.Scanner;

public class SumaPositivosYNegativos {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        rellenarArray(numeros);

        int sumaPositivos = sumarPositivos(numeros);
        int sumaNegativos = sumarNegativos(numeros);

        System.out.println("La suma de los números positivos es: " + sumaPositivos);
        System.out.println("La suma de los números negativos es: " + sumaNegativos);
    }

    public static void rellenarArray(int[] numeros) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un número para el array: ");
            numeros[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static int sumarPositivos(int[] numeros) {
        int sumatorio = 0;
        for (int num : numeros) {
            if (num > 0) {
                sumatorio += num;
            }
        }
        return sumatorio;
    }

    public static int sumarNegativos(int[] numeros) {
        int sumatorio = 0;
        for (int num : numeros) {
            if (num < 0) {
                sumatorio += num;
            }
        }
        return sumatorio;
    }
}
