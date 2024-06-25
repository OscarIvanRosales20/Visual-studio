//Pedir una nota del 0 al 10 y mostrarla de la forma: 
//Insuficiente, Suficiente, Bien, Notable, Sobresaliente
public class calificaciones {
    public static void main(String[] args) {
        int nota;

        System.out.println("Introduzca una nota");
        nota= Entrada.entero();

        //Tanto los if's como los else's encierran a una sola instrucción
        //Y no es necesario utilizar llaves  {}

        if(nota>=0 && nota<5)
        System.out.print("Insuficiente");
        else
            if(nota==5)
            System.out.print("Suficiente");
            else
            if(nota==6)
            System.out.print("Bien");
            else
            if(nota==7 || nota==8)
                System.out.print("Notable");
                else
                if(nota==9 || nota==10)
                System.out.print("Sobresaliente");
    }
}
