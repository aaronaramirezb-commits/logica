package actividad;

public class Numerodedias {
    public static void main(String[] args) {

        int mes = Entrada.leerEntero("Para saber el número de días que tiene el mes ingrese el número de mes (Enero = 1, Febrero = 2, ... Diciembre = 12): ");

        switch (mes) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 días");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 días");
                break;

            case 2:
                System.out.println("El mes tiene 28 días");
                break;

            default:
                System.out.println("Mes no válido");
                break;
        }
    }
 
}
