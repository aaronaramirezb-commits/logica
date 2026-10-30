
package parcial;

public class Puntocinco {

    public static void main(String[] args) {

        System.out.println("=== ESTACIÓN METEOROLÓGICA ===");

        int n = Entrada.leerEntero(
                "Ingrese el número de lecturas a registrar: "
        );

        boolean todasMayores20 = true;
        boolean calorExtremo = false;

        for (int i = 1; i <= n; i++) {

            double temp = Entrada.leerDecimal(
                    "Ingrese la temperatura de la lectura " + i + " (°C): "
            );

            if (temp <= 20) {
                todasMayores20 = false;
            }

            if (temp > 35) {
                calorExtremo = true;
            }
        }

        System.out.println("\n--- RESULTADO CLIMATOLÓGICO ---");

        if (calorExtremo) {
            System.out.println("ALERTA: se registró calor extremo");
        } else if (todasMayores20 && n > 0) {
            System.out.println("Clima templado constante");
        } else {
            System.out.println("Clima variable");
        }
    }
}
