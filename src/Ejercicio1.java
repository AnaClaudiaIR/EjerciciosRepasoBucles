public class Ejercicio1 {
    public static void main(String[] args) {
        int contador = 0;
        /*for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0) {
                System.out.println("Múltiplos de 3: "+i);
                contador++;
            }
        }
        System.out.println("----------------------------");
        for (int i = 1; i <= 200; i++) {
            if (i % 5 == 0) {
                System.out.println("Múltiplos de 5: "+i);
                contador++;
            }
        }*/

        for (int i = 1; i <= 200; i++) {
            if ((i % 5 == 0) || (i % 3 == 0)) {
                System.out.println("Múltiplos: "+i);
                contador++;
            }
        }

        System.out.println("Número de múltiplos: "+contador);
    }
}
