//Pedir 10 números,  mostrar al final se ha introducido alguno negativo.

package CondicionesyBucles;

public class numNegativo {
    public static void main(String[] args) {
        int num;
        boolean hay_negativo;
        //La variable hay_negativo según los dos posibles valores indica:
        //false: no se ha introducido ningún número negativo
        //true: al menos hay un numero negativo

        hay_negativo = false;
        for (int i = 1; i < 10; i++) {
            System.out.println("Introduce número: ");
            num=Entrada.entero();

            if(num<0)
                hay_negativo=true;
                //Si num es menor que cero, cambiamos el valor de hay_negativo a true
        }
        if(hay_negativo ==true)
            System.out.println("Se ha introducido algún número negativo ");

        else
            System.out.println("No hay ningún número negatvo ");
    }
}
