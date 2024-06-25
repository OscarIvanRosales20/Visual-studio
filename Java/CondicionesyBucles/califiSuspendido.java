//Pedir 5 calificaciones de alumnos y decir al final si hay agún suspenso.
package CondicionesyBucles;

public class califiSuspendido {
    public static void main(String[] args) {
        int notas;
        boolean suspensos;

        suspensos=false; //Suponemos que en principio no hay ningún suspenso.
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca nota (de 0 a 10): ");
            notas=Entrada.entero();

            if(notas<5)
                suspensos=true;
        }
        if(suspensos)
            System.out.println("Hay alumnos suspensos");
        else
            System.out.println("No hay suspensos");
    }
}