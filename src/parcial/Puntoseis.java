
package parcial;

public class Puntoseis {

    public static void main(String[] args) {

        int opcion;
        int carros = 0;
        int motos = 0;
        int total = 0;

        do {
            System.out.println("\n=== PARQUEADERO ===");
            System.out.println("1. Entra un carro ($5.000)");
            System.out.println("2. Entra una moto ($2.000)");
            System.out.println("3. Ver resumen");
            System.out.println("4. Salir");

            opcion = Entrada.leerEntero("Seleccione una opción: ");

            switch (opcion) {

                case 1:
                    if (carros <2){
                        total+= 5000;

                    }else {total += 4000;}
                    carros++;

                    System.out.println("Carro registrado.");
                    break;

                case 2:
                    motos++;
                    total += 2000;
                    System.out.println("Moto registrada.");
                    break;

                case 3:
                    System.out.println("=== RESUMEN ===");
                    System.out.println("Recaudo total: $" + total);
                    System.out.println("Cantidad de carros: " + carros);
                    System.out.println("Cantidad de motos: " + motos);
                    break;

                case 4:
                    System.out.println("=== RESUMEN FINAL ===");
                    System.out.println("Recaudo total: $" + total);
                    System.out.println("Cantidad de carros: " + carros);
                    System.out.println("Cantidad de motos: " + motos);
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 4);
    }
}

