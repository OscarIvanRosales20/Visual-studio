//Pedir 10 sueldos. Mostrar la suma y cuantos hay mayores de 1000

package CondicionesyBucles;

public class sueldoSuma {
    public static void main(String[] args) {
        int sueldo,suma,mayor_1000;
        suma=0;
        mayor_1000=0;
        for (int i = 1; i < 10; i++) {
            System.out.println("Escrible un sueldo: ");
            sueldo=Entrada.entero();
            if(sueldo>1000)
            mayor_1000++;

            suma = suma+sueldo;
        }
        System.out.println("Mayores a 1000 hay: "+mayor_1000);
        System.out.println("La suma es de: "+suma);
    }
}
