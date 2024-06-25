package CondicionesyBucles;


//Leer un número e indicar si es positivo o negativo.
//El proceso continua hasta que se introduce un 0.
public class numPositoNegativo {
    public static void main(String[] args) {
        int num;
        System.out.println("Introduzca un número: ");
        num=Entrada.entero();

        while(num!=0){ //Mientras num sea distinto de 0
            if(num>0)
            //Mayor que 0. es positivo
            System.out.println("Positivo");
            else
            //Si no es positivo: es Negativo
            System.out.println("Negativo");

            //Repetimos el proceso y volvemos a leer num
            System.out.println("Introduzca un número: ");
            num=Entrada.entero();
        }
        //Salimos cuando num =0
    }
}
