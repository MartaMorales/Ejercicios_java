package Bucles;

import java.util.Scanner;

public class Ejercicio8 {
    //Muestra la tabla de multiplicar de un número introducido por teclado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el numero del cual quieres saber la tabla de multiplicar");

        int numero = scanner.nextInt();

        for(int i = 1; i <=10; i++ ){
            System.out.println( numero + " * " + i + " = " + numero*i);
        }
    }
}
