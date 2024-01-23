

import java.util.Scanner;
import java.util.Random;

public class CarreraAutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Definir arreglos para almacenar nombres y números de autos
        String[] nombresAutos = new String[5];
        int[] numerosAutos = new int[5];

        // Solicitar al usuario nombre y número de cada piloto
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del piloto del Auto " + (i + 1) + ": ");
            nombresAutos[i] = scanner.nextLine();

            System.out.print("Ingrese el número del Auto " + (i + 1) + ": ");
            numerosAutos[i] = scanner.nextInt();
            scanner.nextLine();
        }

        // Generar al azar el orden de llegada
        int[] ordenLlegada = generarOrdenLlegada();

        // Mostrar el resultado de la carrera
        System.out.println("\nResultado de la carrera:");
        for (int i = 0; i < 5; i++) {
            int posicion = i + 1;
            int indiceAuto = ordenLlegada[i];

            System.out.println(posicion + "° Lugar: Auto N°" + numerosAutos[indiceAuto] +
                    ". Piloto: " + nombresAutos[indiceAuto]);
        }
    }

    // Método para generar al azar el orden de llegada
    private static int[] generarOrdenLlegada() {
        Random rand = new Random();
        int[] ordenLlegada = {0, 1, 2, 3, 4};

        // Mezclar el arreglo utilizando el algoritmo de Fisher-Yates
        //El algoritmo de Fisher-Yates, también conocido como el algoritmo de mezcla o barajado de Knuth,
        // es un algoritmo para mezclar o permutar elementos en un arreglo de manera aleatoria

        for (int i = ordenLlegada.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            // Intercambiar elementos
            int temp = ordenLlegada[i];
            ordenLlegada[i] = ordenLlegada[j];
            ordenLlegada[j] = temp;
        }

        return ordenLlegada;
    }
}

