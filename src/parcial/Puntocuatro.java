
package parcial;

public class Puntocuatro {

    public static void main(String[] args) {

        System.out.println("=== ANÁLISIS DE ENTRENAMIENTO DE CICLISMO ===");

        int n = Entrada.leerEntero("Ingrese el número de vueltas realizadas: ");

        double tiempoTotal = 0;
        int vueltasRapidas = 0;

        for (int i = 1; i <= n; i++) {

            double tiempo = Entrada.leerDecimal(
                    "Ingrese el tiempo de la vuelta " + i + " (en minutos): "
            );

            tiempoTotal += tiempo;

            if (tiempo < 3.0) {
                vueltasRapidas++;
            }
        }

        double tiempoPromedio = 0;

        if (n > 0) {
            tiempoPromedio = tiempoTotal / n;
        }

        System.out.println("\n--- RESULTADOS FINALES ---");
        System.out.println("Tiempo total: " + tiempoTotal + " minutos");
        System.out.println("Tiempo promedio por vuelta: " + tiempoPromedio + " minutos");
        System.out.println("Vueltas rápidas (< 3.0 min): " + vueltasRapidas);

        if (n > 0 && tiempoPromedio <= 3.0) {
            System.out.println("Mensaje: Ritmo competitivo");
        } else if (n > 0) {
            System.out.println("Mensaje: Debe mejorar el ritmo");
        } else {
            System.out.println("No se registraron vueltas.");
        }
    }
}

