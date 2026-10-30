package trabajos;

public class Pacialpuntodosa {
    static public void main(String[] args) {

        System.out.println("\n---CONSUMO DE MB POR DIA---");//Tirulo de la aplicacin para saber el promedio de mb diarios//

        //Variables//Llamar escaner//
        int mbSemanales = Entrada.leerEntero("¿MB consumidos durante la semana?: ");
        int diasDeUso = Entrada.leerEntero("¿Cuantos dias de la semana de uso tiene registrado?: ");
        //Calculo del promedio//
        int promedioMbusado = mbSemanales / diasDeUso;//Se dibiden las dos variables para obtener el promedio//

        System.out.println("El promedio de uso de MB por dia es: " + promedioMbusado);//Mensaje de cuanto es el promedio//

        if (promedioMbusado <= 500){//En caso del promedio ser bajo//
            System.out.println("El consumo de MB usado por dia es bajo");

        }else {//En caso del promedio ser alto//
            System.out.println("El consumo de MB usado por dia es alto");
        }





    }
}
