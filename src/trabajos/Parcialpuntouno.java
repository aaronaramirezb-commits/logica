package trabajos;

public class Parcialpuntouno {
    public static void main(String[] args){

        System.out.println("\n---ACCESO A LA BIBLIOTECA CENTRAL DE LA UNIQUINDIO---");//Titulo del programa//
        //Variables principal//llamar scanner//
        boolean esProfesor = Entrada.leerBooleano("¿Es profesor?: ");
        



        //Decicion Inicial//
        if (esProfesor) {
            System.out.println("---Tiene acceso a la biblioteca---");


        }else {//Decicion alternativa//
            int edad = Entrada.leerEntero("¿Que edad tiene?: ");//llamar scanner//Digitar edad//
            boolean carneEstudiantilVigente = Entrada.leerBooleano("¿Cuenta con carnet estudiantil vigente?: ");//llamar scanner//vigencia del carnet//
            //Ultima decicion//
            if (carneEstudiantilVigente && edad >=16) {
                System.out.println("---Tiene acceso a la biblioteca---");

            }else {//En caso de no cumplir con ninguna//
                System.out.println("---No tiene acceso a la biblioteca---");
            }


        }



    }
}
