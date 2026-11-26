import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] listaNumeros = new double[10];
        double numeroMax = 0, numeroMin = 1000000000;
        Scanner sc = new Scanner(System.in);


        for (double dato: listaNumeros) {
            dato = sc.nextDouble();
            if(dato<numeroMin){
                numeroMin = dato;
            }
            if (dato>numeroMax){
                numeroMax = dato;
            }
        }
        System.out.println("El numero maximo es " + numeroMax);
        System.out.println("El numero minimo es " + numeroMin);
    }
}