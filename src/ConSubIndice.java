import java.util.Random;

public class ConSubIndice {
    public static void main(String[] args) {

        System.out.println("\n\t\tVECTOR ALEATORIO CON SUBINDICE");

        // Crear un vector de tamaño 5
        int[] vectorAleatorio = new int[5];

        // Generar números aleatorios sin repetir
        generarVectorAleatorioSinRepetir(vectorAleatorio);

        // Mostrar el vector y sus subíndices en pantalla
        System.out.println("Vector aleatorio:");
        mostrarVectorConSubindices(vectorAleatorio);
    }

    // Método para generar un vector aleatorio sin repetir
    private static void generarVectorAleatorioSinRepetir(int[] vector) {
        Random rand = new Random();
        boolean[] numerosUtilizados = new boolean[6];  // Inicialmente todos los números están disponibles

        for (int i = 0; i < vector.length; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = rand.nextInt(5) + 1;  // Generar número aleatorio entre 1 y 5
            } while (numerosUtilizados[numeroAleatorio]);  // Verificar si ya se ha utilizado

            vector[i] = numeroAleatorio;
            numerosUtilizados[numeroAleatorio] = true;  // Marcar el número como utilizado
        }
    }

    // Método para mostrar un vector con sus subíndices
    private static void mostrarVectorConSubindices(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Índice " + i + ": " + vector[i]);
        }
    }
}
