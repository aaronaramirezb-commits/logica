package actividad;

public class Miaventura {
        public static void main(String[] args) {
            boolean eresYasou = Entrada.leerBooleano("Estas en jonia, eres yasou o yone. ¿Eres yasou? (true = yasou, false = yone): ");

            if (eresYasou) {
                // escoge personaje yasou
                boolean ayudasEnLaGuerra = Entrada.leerBooleano("Te piden ayuda en la guerra. ¿ayudas en la guerra? (true = sí, false = no): ");
                if (ayudasEnLaGuerra) {
                    System.out.println("matan a tu maestro, yone te culpa y pelea con tigo y lo asesinas");
                } else {
                    System.out.println("regresas y salvas a tu maestro pero jonia cae");
                }
            } else {
                // escoges personage yone
                boolean yoneVengativo = Entrada.leerBooleano("¿culpas a yasuo por la muerte de tu maestro?. ¿ (true/false): ");
                if (yoneVengativo) {
                    System.out.println("Buscas venganza ante yasou tu propio hermano lo que termina en tu muerte en sus manos");
                } else {
                    System.out.println("Tu y yasou buscan el verdadero culpable");
                }
            }
        }
    }

