public class MediaDeUnArray {
    public static void main(String[] args) {
        int [] array = new int[10];
        Utilidades.rellenaArray(array, 0, 10);
        System.out.println("La media es de: " + mediaDeUnArray(array));
    }
    public static double mediaDeUnArray(int[] array) {
        int sumaNumeros = 0;
        for (int i = 0; i < array.length; i++) {
            sumaNumeros += array[i];
        }
        return (double) sumaNumeros / array.length;
    }
}
