package trabajos;

public class Parcialpuntotresb {

    //Funcion para clasificar al estudiante

    public static String calificacion (double promedio){
        if (promedio < 3) {
            return "---REPROBADO---";
        }else if (promedio <=3.9) {
            return "---APROBADO---";
        }else {
            return "---EXELENTE---";
        }
    }


    public static void main(String[] args) {
        System.out.println("\n---CLASIFICACION DEL ESTUDIANTE---");//Titulo del clasificador de estudiante//
        //llamar scanner//poner variables//
        double notaUno = Entrada.leerDecimal("Digite la nota 1: ");//resgistrar nota//
        double notaDos = Entrada.leerDecimal("Digite la nota 2: ");//resgistrar nota//
        double notaTres = Entrada.leerDecimal("Digite la nota 3: ");//resgistrar nota//
        double suma = Parcialpuntotresa.sumarNotas(notaUno,notaDos,notaTres);//llamar funcion de suma de notas//
        double promedio = Parcialpuntotresa.calcularPromedio(suma);//llamar funcion de calculadora de promedio//
        String califica = calificacion(promedio);

        System.out.println("---SU CALIFICAION ES---");//mensaje de la calificacion//
        System.out.println(califica);//mensage de calificacion//


    }

}
