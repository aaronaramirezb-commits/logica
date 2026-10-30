package funcionesYDesiciones;

public class Retodos {
    public static void main(String[] args) {
        double saldoTarjeta = funcionesydecisiones.Entrada.leerEntero("¿Saldo de su tarjeta?: ");
        boolean esEstudiante = funcionesydecisiones.Entrada.leerBooleano("¿Es estudiante?:");


        if ( saldoTarjeta >= 1500 && esEstudiante ){
            System.out.println("Tiene acceso");

        }else {
            System.out.println("No tiene acceso");
        }
    }
}






