//Crea un array de caracteres que contenga las letras de la ’A’ a la ’Z’ (
//mayusculas). Despu ´ es, ve pidiendo posiciones del array por teclado ´
//y si la posicion es correcta, se a ´ nadir ˜ a el car ´ acter a una cadena que se ´
//mostrara al final, se dejar ´ a de insertar cuando se introduzca un -1. ´
//Por ejemplo, si escribo los siguientes numeros ´
//0 //Anadira la ’A’ ˜
//5 //Anadira la ’F’ ˜
//25 //Anadira la ’Z’ ˜
//50 //Error, inserte otro numero ´
//-1 //fin
//Cadena resultante: AFZ


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] abc = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        //             1   2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26  27
        int posicion;
        StringBuilder palabra = new StringBuilder();
        System.out.println("Insterta una posicion ");
        posicion = sc.nextInt();


        while (posicion != -1){
            if (posicion > 27 || posicion < -2){
                System.out.println("Posicion no valida. Introduzca una entre el 1 y el 27 (-1 para salir)");
            } else {
                palabra.append(abc[posicion - 1]);
                System.out.println("Insterta una posicion ");
                posicion = sc.nextInt();
            }
        }
        System.out.println(palabra);
    }
}