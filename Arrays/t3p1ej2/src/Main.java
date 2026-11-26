import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Crea un array para almacenar numeros enteros generados aleatoria- ´
//mente. El numero de n ´ umeros a generar, lo solicitaremos como dato ´
//de entrada. Muestra por pantalla el valor de cada posicion y la suma ´
//de todos los valores.
public class Main {
    public static void main(String[] args) {
        int numeroNumeros, suma;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int limite = 10;

        System.out.println("Introduce un numero");
        numeroNumeros = sc.nextInt();

        int[] listaNumeros = new int[numeroNumeros];

        for (int i = 0; i <= numeroNumeros - 1; i++) {
            listaNumeros[i] = random.nextInt(limite);
            System.out.println("El numero en la posicion " + (i+1) + " es " + listaNumeros[i]);
        }
        suma = Arrays.stream(listaNumeros).sum();
        System.out.println("La suma de todo es "+ suma);

    }
}