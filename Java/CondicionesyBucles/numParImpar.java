//Leer números hasta que se introduzca un 0. Para cada uno 
//indicar si es par o impar.

package CondicionesyBucles;

public class numParImpar {
    public static void main(String[] args) {
        int num;
        System.out.println("Introduzca un numero");
        num = Entrada.entero();

        while(num != 0){
            if(num%2 == 0)
            //Si el resto de dividir entre dos es cero:
            //Esto indica que es par
            System.out.println("Par");
            else
            //En caso contrario: Impar
            System.out.println("Impar");

            //Repetimos el proceso y volvemos a leer num
            System.out.println("Introduzca un numero");
            num = Entrada.entero();
        }
    }
}
