//Dadas 6 notas, escribir la cantidad de alumnos
//Aprobados, condicionados =4 y suspensos

package CondicionesyBucles;

public class calificaciones {
    public static void main(String[] args) {
        int notas, aprobados, suspensos, condicionados;
        aprobados=0;
        suspensos=0;
        condicionados=0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Introduzca not entre 0 y 10: ");
            notas=Entrada.entero();

            if(notas==4)
                condicionados++;
            else
                if(notas>=5)
                    aprobados++;
                else
                    if(notas <4)
                        suspensos++;
        }
    }
}
