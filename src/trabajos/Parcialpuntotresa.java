package trabajos;

public class Parcialpuntotresa {
    //Funcion de sumar notas//
    public static double sumarNotas (double notaUno,double notaDos,double notaTres) {
        return notaUno + notaDos + notaTres;

    }
    //funcion de calcular promedio
    public static double calcularPromedio (double sumarNotas) {
        return sumarNotas / 3;

    }

    public static void main(String[] args) {
        System.out.println("\n---CALCULADORA DE PROMEDIO DE NOTAS---");//Titulo de la calculadora de promedio//
        //llamar escaner//variables//
        double notaUno = Entrada.leerDecimal("Digite la nota 1: ");//resgistrar nota//
        double notaDos = Entrada.leerDecimal("Digite la nota 2: ");//resgistrar nota//
        double notaTres = Entrada.leerDecimal("Digite la nota 3: ");//resgistrar nota//

        double sumaNotas = sumarNotas (notaUno,notaDos,notaTres);//variable de suma de notas//
        double promedio = calcularPromedio (sumaNotas);//variable de calcular promedio//

        System.out.println("\n---EL PROMEDIO ES---");//mensaje//
        System.out.println("-------" + promedio + "-------");//resultado del promedio//





    }



}
