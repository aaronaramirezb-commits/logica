package parcial;

public class Puntodosb {

    public static void main(String[] args) {

        int opcion = Entrada.leerEntero("Elige una opcion: 1.Hola 2.Adios: ");

        switch (opcion) {
            case 1:
                System.out.println("Hola");
                break;

            case 2:
                System.out.println("Adiós");
                break;

            default:
                System.out.println("No válida");
                break;
        }
    }
}
