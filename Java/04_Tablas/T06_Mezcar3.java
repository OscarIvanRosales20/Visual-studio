//Leer los datos correspondientes a dos tablas de 12 elementos númericos,
//Y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B,
//otros 3 de A, otros 3 de la B, etc.

public class T06_Mezcar3 {
    public static void main(String[] args) {
        int a[], b[], c[];
        int i, j;

        a = new int[12];
        b = new int[12];

        //La tabla C tendrá que tener el doble de tamaño que A y B.
        c = new int [24];

        //Leemos la tabla A.
        System.out.println("Leyendo la tabla A");
        for ( i = 0; i < a.length; i++) {
            System.out.println("Ingresa el número "+"°: ");
            a[i]=Entrada.entero();
        }

        //Leemos la tabla B.
        System.out.println("Leyendo la tabla B");
        for ( i = 0; i < b.length; i++) {
            System.out.println("Ingresa el número "+"°: ");
            b[i]=Entrada.entero();
        }

        //Asignaremos los elementos de la tabla C
        //Para las tablas A y B utilizaremos como índice i
        //Y para la tabla C utilizaremos como índice j.
        j=0;
        i=0;
        while(i<12){
            //Copiamos 3 de A
            for(int k=0; k<3;k++){
                c[j]=a[i+k];
                j++;
            }
            //Copiamos 3 de B
            for(int k=0; k<3;k++){
                c[j]=b[i+k];
                j++;
            }
            //Como hemos copiado 3 de A y B, incrementamos la i en 3.
            i+=3;
            //La j se incrementa cada vez que se añade un elemento a la tabla C.
            System.out.println("La tabla C queda: ");
            for(j=0; j<24; j++)//Seguimos utilizando j, para tabla C.
                //Aunque se podría utilizar i.
                System.out.print(c[j]+" ");
            System.out.println("");
        }
    }
}
