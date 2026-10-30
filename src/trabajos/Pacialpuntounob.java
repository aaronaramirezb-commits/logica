package trabajos;

public class Pacialpuntounob {
    public static void main(String[] args) {

        System.out.println("\n---RECIBE UN MES GRACTIS EN TU SUBSCRIBSION DE STREEMING---");//Titulo de la aplicacion para conseguir un mes gratis//

        //Variable Principal//llamar scanner//
        boolean planFamiliar = Entrada.leerBooleano("¿Tiene plan familiar?: ");

        if (planFamiliar){//Decicion inicial//
            System.out.println("---Recibe un mes gratis---");

        }else {//Decicion Alternativa//
            int mesesSubscritos = Entrada.leerEntero("¿Cuantos meses lleva subscrito?: ");//llamar scanner//
            int peliculasCalificados = Entrada.leerEntero("¿Cuantas peliculas a calificado?: ");//llamar scanner//
            //Ultima Decicion//
            if (mesesSubscritos >= 12 && peliculasCalificados >= 5) {
                System.out.println("---Recibe un mes gratis---");
            }else {//En caso de no cumplir con ninguna//
                System.out.println("---No recibe un mes gratis---");
            }


        }
    }
}
