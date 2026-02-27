import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int contador = 0;
        int suma = 0;
        int suma2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int n =  sc.nextInt();

        while (contador < n) {
            contador++;
            suma += contador;
        }
        suma2 = n*(n+1)/2;
        System.out.println("Suma: "+suma);
        System.out.println("Suma2: "+suma2);
    }
}
