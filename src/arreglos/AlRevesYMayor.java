package arreglos;

public class AlRevesYMayor {

    public static void main(String[] args) {

        int cantidad = Entrada.leerEntero("¿Cuantos numeros quieres evaluar?: ");

        int[] numeros = new int [cantidad];


        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = Entrada.leerEntero("Numero " + (i+1) + ": ");

        }
        alReves(numeros);

        int mayor = buscarMayor(numeros);

        System.out.println("El numero mayor es:" + mayor);

    }

    public static void alReves(int[] numeros) {

        System.out.println("EL oreden al reves es: ");
        for (int i = numeros.length -1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");

        }
        System.out.println();
    }
    public static int buscarMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];

            }

        }
        return mayor;
    }
}
