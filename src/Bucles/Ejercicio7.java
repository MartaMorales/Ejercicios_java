package Bucles;

import java.util.Scanner;

public class Ejercicio7 {
    //Realiza el control de acceso a una caja fuerte.
    // La combinación será un número de 4 cifras.
    // El programa nos pedirá la combinación para abrirla.
    // Si no acertamos, se nos mostrará el mensaje
    // “Lo siento, esa no es la combinación” y
    // si acertamos se nos dirá “La caja fuerte se
    // ha abierto satisfactoriamente”.
    // Tendremos cuatro oportunidades para abrir la caja fuerte.

    public static void main(String[] args) {

        final int COMBINACION = 1234;

        Scanner scan = new Scanner(System.in);

        int intentos = 4;

        int combinacion_usuario;

        while( intentos > 0){
            System.out.println("Introduzca la combinacion, tiene " + intentos + " intentos.");
            intentos -= 1;

            combinacion_usuario = scan.nextInt();
            if(COMBINACION == combinacion_usuario){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                }else {
                System.out.println("Lo siento, esa no es la combinación");
            }
        }
    }
}
