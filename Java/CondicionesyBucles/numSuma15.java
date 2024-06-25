//Pedir 15 números y escribir la suma total.

package CondicionesyBucles;

public class numSuma15 {
    public static void main(String[] args) {
        int num, sumaTotal;

        sumaTotal=0;
        for (int i = 1; i < 15; i++) {
            System.out.println("Introduzca un números: ");
            num=Entrada.entero();
            sumaTotal= sumaTotal+num;
        }
        System.out.println("La suma total es de: "+sumaTotal);
    }
}
