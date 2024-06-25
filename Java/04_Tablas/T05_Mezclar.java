//Leer por teclado 2 tablas de 10 números enteros y mezclarlas
//En una tercera de la forma: el 1° de A, el 1° de B, el 2° de A, el 2° de B, etc.

public class T05_Mezclar {
    public static void main(String[] args) {
        int a[], b[],c[];
        int i,j;
         
        a = new int[10];
        b = new int[10];
        //La tabla C tendrá que tener el doble de tamaño que A y B.
        c = new int[20];

        //Leemos la tabla A.
        System.out.println("Leyendo la tabla A");
        for ( i = 0; i < a.length; i++) {
            System.out.println("Ingresa el número "+i+"°");
            a[i]=Entrada.entero();
        }

        //Leemos la tabla B.
        System.out.println("Leyendo la tabla B");
        for ( i = 0; i < b.length; i++) {
            System.out.println("Ingresa el número "+i+"°: ");
            b[i]=Entrada.entero();
        }

        //Asignaremos los elementos de la tabla C
        //Para las tablas A y B utilizaremos como índice i
        //Y para la tabla C utilizaremos como índice j.
        j=0;
        for(i=0; i< 10; i++){
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }

        System.out.println("La tabla C queda: ");
        for(j=0; j<20; j++)//Seguimos utilizando j, para tabla C.
        //Aunque se podría utilizar i.
            System.out.println(c[j]+" ");
        System.out.println("");
    }
}
