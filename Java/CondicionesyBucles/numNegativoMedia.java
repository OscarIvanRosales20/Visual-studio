// Pedir números hasta que se introduzca uno negativo, y calcular la media.
package CondicionesyBucles;

public class numNegativoMedia {
    public static void main(String[] args) {
        int num,suma,elementos;
        float media;//Puede tener decimales

        //num: guardara los números introducidos por el usuario
        //Suma: almacenará la suma de todos los números introducidos
        //elementos: será un contador que indicará el números de de elementos introducidos

        System.out.println("Introduzca un número");
        num =Entrada.entero();
        suma=0;
        elementos=0;

        while(num>=0){//Nos interesan los positivos y el cero
            suma += num;
            elementos++;

            System.out.println("Introduzca otro número");
            num =Entrada.entero();
        }

        if(elementos ==0)//Daria un error de division por 0
            System.out.println("Imposible hacer la media");
            else{
                media = (float)suma/elementos;
                System.out.println("La media es: "+media);
            }
    }
}
