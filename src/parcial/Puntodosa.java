package parcial;

public class Puntodosa {
    public static void main(String[] args) {
        int cantidad = Entrada.leerEntero("¿Cuántas notas vas a ingresar?: ");

        double promedio = Promedio(cantidad);

        System.out.println("El promedio es: " + promedio);
    }
    public static double Promedio(int n) {
        if (n <= 0) return 0.0; // Validación de seguridad para evitar división por cero

        double suma = 0; // Declarada FUERA del bucle para acumular

        for (int i = 1; i <= n; i++) {
            double nota = Entrada.leerDecimal("Nota " + i + ": ");
            suma += nota;
        }

        return suma / n; // Ahora 'suma' existe en este alcance y contiene la suma real
    }
}
