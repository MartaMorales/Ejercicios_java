package Bucles;

import java.util.Scanner;

public class Ejercicio9 {
    //Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero para saber el numero de digitos que tiene");
        int numero = scanner.nextInt();

        int contador = 0;

        while(numero>0){
            numero/=10;
            contador+=1;
        }

        System.out.println(contador);
    }
}
