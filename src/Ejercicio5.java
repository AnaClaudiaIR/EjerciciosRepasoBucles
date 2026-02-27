import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "Hola1234";
        int intentos = 0;

        do {
            System.out.println("Introduce la contraseña: ");
            String contra =  sc.nextLine();
            intentos++;

            if (contra.equals(password)) {
                System.out.println("Has acertado.");
                System.out.println("Adivinado en " + intentos + " intentos.");
                break;
            } else {
                System.out.println("No has acertado.");
            }
        } while (intentos < 3);

        if (intentos >= 3) {
            System.out.println("Has gastado todos tus intentos.");
        }
    }
}
