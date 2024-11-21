import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        rellenarArray(numeros);

        int cantidadPares = contarPares(numeros);
        int cantidadImpares = contarImpares(numeros);

        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
    }

    public static void rellenarArray(int[] numeros) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número para el array:");
            numeros[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static int contarPares(int[] numeros) {
        int contador = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarImpares(int[] numeros) {
        int contador = 0;
        for (int num : numeros) {
            if (num % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }
}
