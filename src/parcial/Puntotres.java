
package parcial;

public class Puntotres {

    public static void main(String[] args) {

        System.out.println("=== CALCULADORA DE COSTO DE EQUIPAJE ===");

        int tipoTarifa = Entrada.leerEntero(
                "Ingrese el tipo de tarifa (1: Básica, 2: Flexible, 3: Premium, 4:ejecutivo): "
        );

        double peso = Entrada.leerDecimal(
                "Ingrese el peso de la maleta (en kg): "
        );

        double costoTotal = calcularCostoEquipaje(tipoTarifa, peso);

        if (costoTotal == -1) {
            System.out.println("Error: Tipo de tarifa no válido.");
        } else {
            System.out.println(
                    "El costo total a pagar por el equipaje es: $" + costoTotal
            );
        }
    }

    public static double calcularCostoEquipaje(int tipoTarifa, double peso) {

        double costo = 0;

        switch (tipoTarifa) {

            case 1:
                if (peso <= 23) {
                    costo = 60000;
                } else {
                    costo = 60000 + (peso - 23) * 8000;
                }
                break;

            case 2:
                if (peso <= 23) {
                    costo = 0;
                } else {
                    costo = (peso - 23) * 8000;
                }
                break;

            case 3:
                if (peso <= 32) {
                    costo = 0;
                } else {
                    costo = (peso - 32) * 8000;
                }
                break;
            case 4:
                if (peso <= 40) {
                    costo = 0;
                } else {
                    costo = (peso - 40)* 8000;
                }
                break;

            default:
                costo = -1;
                break;
        }

        return costo;
    }
}

