

import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {

        System.out.println("\n\t\tNUMEROS ALEATORIOS");

        // Crear un vector de tamaño 10
        int[] Aleatorio = new int[10];

        // Generar números aleatorios sin repetir
        AleatorioSinRepetir(Aleatorio);

        // Mostrar el vector en pantalla
        System.out.print("Vector aleatorio sin repetir: ");
        for (int i = 0; i < Aleatorio.length; i++) {
            System.out.print(Aleatorio[i] + " ");
        }
    }

    // Método para generar un vector aleatorio sin repetir
    private static void AleatorioSinRepetir(int[] vector) {
        Random rand = new Random();
        boolean[] Utilizados = new boolean[11];  // Inicialmente todos los números están disponibles

        for (int i = 0; i < vector.length; i++) {
            int Aleatorio;
            do {
                Aleatorio = rand.nextInt(10) + 1;  // Generar número aleatorio entre 1 y 10
            } while (Utilizados[Aleatorio]);  // Verificar si ya se ha utilizado

            vector[i] = Aleatorio;
            Utilizados[Aleatorio] = true;  // Marcar el número como utilizado
        }
    }
}
