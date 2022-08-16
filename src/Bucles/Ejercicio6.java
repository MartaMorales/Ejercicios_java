package Bucles;

public class Ejercicio6 {
    //Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.

    public static void main(String[] args) {

        int i = 320;

        do{
            i-=20;
            System.out.println(i);
        }while (i>160);
    }
}
