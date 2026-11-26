import java.util.Arrays;
import java.util.Scanner;

//Desarrolla un programa que solicite al usuario un mes en letra y que
//compruebe que es correcto
public class Main {
    public static void main(String[] args) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un mes (o 'salir' para salir)");
        mes = sc.nextLine().toLowerCase();

        while (!mes.equals("salir")){
            boolean coincide = Arrays.asList(meses).contains(mes);
            if (coincide){
                System.out.println("El mes introdicido es correcto");
            }
            else {
                System.out.println("El mes introducido no coincide");
            }
            System.out.println("Introduce un mes (o 'salir' para salir)");
            mes = sc.nextLine().toLowerCase();
        }

    }
}