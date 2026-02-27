import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n1. Mostrar números del 1 al 10.");
            System.out.println("2. Mostrar números pares del 1 al 20.");
            System.out.println("0. Salir.");
            System.out.println("Escoger una opción: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    for (int i = 1; i <=10; i++){
                        System.out.print(i+" ");
                    }
                    break;
                case 2:
                    for (int i = 1; i <=20; i++){
                        if(i%2==0){
                            System.out.print(i+" ");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Has salido.");
                    break;
                default:
                    System.out.println("Opción no permitida.");
            }
        } while (menu != 0);
        sc.close();
        //Ejercicio6 obj = new Ejercicio6();
        //obj.mostrarNumeros();
    }

    /*public void mostrarNumeros(){
        for (int i = 1; i <=10; i++){
            System.out.print(i+" ");
        }
    }*/
}
