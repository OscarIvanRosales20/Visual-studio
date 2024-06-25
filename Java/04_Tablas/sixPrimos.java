//Realizar un programa que nos pida un número n, y nos diga
//Cuantos números hay entre 1 y n que son primos.

public class sixPrimos {
    public static void main(String[] args) {
        int j, num, cont_pri;
        boolean primo;
        cont_pri =0;
        System.out.println("Introduce número: ");
        num = Entrada.entero();

        //Vamos procesando todos los números entre 1..num
        for (int i = 1; i < num; i++) {
            //Para cada numero i calcularemos si es primo
            //Veremos si el número i es divisable en el rango 2..i-1
            //El bucle while se puede hacer con menos vueltas... consultar algoritmos para primos
            primo=true;
        }
    }
}
