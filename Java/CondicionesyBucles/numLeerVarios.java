//Pedir números hasta que se teclee uno negativo,
//Y Mostrar cuantos números se han introducido.

package CondicionesyBucles;

public class numLeerVarios {
    public static void main(String[] args) {
        int num,contador;
        //num guardará los números introducidos
        //Y contador se incrementara para llevar la cuenta
        //de los números introducidos.
        System.out.println("Introduzca un numero");
        num = Entrada.entero();
        contador =0;
        while(num>0){
            contador = contador+1;
            System.out.println("Introduzca otro numero");
            num = Entrada.entero();
        }
        System.out.println("Se han introducido: " +contador+" números");
    }
}
