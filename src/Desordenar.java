
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Desordenar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\tVECTOR DESORDENADO");

        // Solicitar al usuario el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int tamanoVector = scanner.nextInt();

        // Crear un vector y permitir al usuario llenarlo
        int[] vectorOriginal = new int[tamanoVector];
        llenarVectorDesdeEntrada(vectorOriginal);

        // Mostrar el vector original
        System.out.println("Vector original: " + Arrays.toString(vectorOriginal));

        // Obtener un nuevo vector con los mismos números desordenados aleatoriamente
        int[] vectorDesordenado = desordenarVector(vectorOriginal);

        // Mostrar el vector desordenado
        System.out.println("Vector desordenado: " + Arrays.toString(vectorDesordenado));
    }

    // Método para llenar un vector desde la entrada del usuario
    private static void llenarVectorDesdeEntrada(int[] vector) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
    }

    // Método para desordenar un vector aleatoriamente
    private static int[] desordenarVector(int[] vector) {
        int[] vectorDesordenado = vector.clone();  // Crear una copia del vector original

        // Desordenar aleatoriamente utilizando el algoritmo de Fisher-Yates (mezcla)
        Random rand = new Random();
        for (int i = vectorDesordenado.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            // Intercambiar elementos
            int temp = vectorDesordenado[i];
            vectorDesordenado[i] = vectorDesordenado[j];
            vectorDesordenado[j] = temp;
        }

        return vectorDesordenado;
    }
}
