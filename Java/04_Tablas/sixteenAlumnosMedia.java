//Queremos desarollar una aplicación que nos ayude a gestionar
//Las notas de un centro educativo. Cada grupo o Clase esta compuesto
//por 5 alumnos. Se pide leer las notas del primer, segundo y tercer 
//timestre de un grupo. Debemos mostrar al final: la nota media del grupo
//en cada timestre, y la media del alumno que se  encuentra
//en la posición N (N se lee por teclado).

public class sixteenAlumnosMedia {
    public static void main(String[] args) {
        int primer[], segundo[], tercer[];//notas de primer, segundo y tercer timestre.
        int num, i;

        int suma_primer, suma_segundo, suma_tercer;
        double media_alumnos;

        //Creamos las tablas necesarias
        primer = new int[5];
        segundo = new int[5];
        tercer = new int[5];

        //El programa consta de dos partes: entrada de datos y procesado.
        //Se podrían procesar las notas mientras se leen. 
        //Preferimos utilizar dos bloques por tener un código mas legible.

        //Leemos las notas del primer trimestre.
        System.out.println("Notas del primer trimestre: ");
        for(i=0; i<5; i++){
            System.out.print("Alumnos ("+i+"): ");
            primer[i] =Entrada.entero();
        }

        //Leemos las notas del segundo trimestre.
        System.out.println("Notas del segundo trimestre: ");
        for(i=0; i<5; i++){
            System.out.print("Alumnos ("+i+"): ");
            segundo[i] =Entrada.entero();
        }

        //Leemos las notas del tercer trimestre.
        System.out.println("Notas del tercer trimestre: ");
        for(i=0; i<5; i++){
            System.out.print("Alumnos ("+i+"): ");
            tercer[i] =Entrada.entero();
        }

        //Calculamos las medias
        suma_primer = 0; 
        suma_segundo = 0;
        suma_tercer = 0; //Ponemos a 0 los acumuladores

        for ( i = 0; i < 5; i++) {
            suma_primer += primer[i];
            suma_segundo += segundo[i];
            suma_tercer += tercer[i];
        }

        //Mostramos los datos
        System.out.println("Media primer trimestre: "+suma_primer/5.0);
        System.out.println("Media segundo trimestre: "+suma_segundo/5.0);
        System.out.println("Media tercer trimestre: "+suma_tercer/5.0);
        System.out.print("");

        //Leemos la posición del aluumnos que nos interesa una posible
        //mejora es comprobar que el índice se encuentre entre 0 y 4.
        System.out.print("Introduzca posición del alumno (de 0 a 9): ");
        num = Entrada.entero();

        //La media del alumno es la suma de sus notas entre 3
        media_alumnos = (double)(primer[num]+segundo[num]+tercer[num])/3;
        System.out.print("La media del alumno es: "+ media_alumnos);
    }
}
