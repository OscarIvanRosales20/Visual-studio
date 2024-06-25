//Pedir un número y calcular su factorial.

package CondicionesyBucles;

public class numFactorial {
    public static void main(String[] args) {
        //long factorial; con longo se puede calcular hasta el 25
        double factorial;
        int num;

        System.out.println("Introduce un número: ");
        num=Entrada.entero();
        factorial=1; //Es importante iniciarlo a 1, ya que se multipica
        //Por Ejemplo: El factorial de 10 es:
        //10*9*8*7*6*5*4*3*2*1
        for (int i = num; i >0; i--) {
            factorial = factorial*i;
        }
        System.out.println("El factorial de " + num+" es: "+factorial);

    }
}
