
package parcial;

public class Puntounoa {

    public static void main(String[] args) {

        int total = 0;
        int cuenta = 0;
        boolean hubo = false;

        for (int i = 1; i <= 8; i++) {

            if (i % 2 == 0) {
                total += i;

            } else if (i % 3 == 0) {
                cuenta++;
            }

            if (total > 10) {
                hubo = true;
            }
        }

        System.out.println(total + " " + cuenta + " " + hubo);
    }
}
