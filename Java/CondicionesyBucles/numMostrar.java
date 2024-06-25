//Pedir un número N, Y mostrar todos los números del 1 al N.


package CondicionesyBucles;

public class numMostrar {
    public static void main(String[] args) {
        int i, num;
        System.out.println("Introduce un número: ");
        num = Entrada.entero();
        i=1;//Es el contador que tomará los valores de 1 a n

        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}
