//Realizar un programa que nos pida un número n,
//Y nos diga cuantos números hay entre 1 y n que sean primos
public class BA06_NumPrimos {
    public static void main(String[] args) {
        int j,num,cont_pri;
        boolean primo;
    
        cont_pri=0;
        System.out.println("Introduce un número: ");
        num=Entrada.entero();

        //Vamos procesando todos los números entre 1..num
        for (int i = 1; i <= num; i++) {
            //Para cada número i, calcularemos si es primo
            //Veremos si el número i es divisible en el rango 2...1-1
            //El bucle while se puede hacer con menos vuelta... consulat algoritmos para primos
            primo = true;
            j=2;
            while (j<=i-1 && primo==true){
                if(i%j==0)
                    primo=false;
                    j++;
            }
            if(primo==true){
                cont_pri++;//Si el primo incrementamos el contador de primos
                System.out.println(i+(" es primo"));
            }
        }

        System.out.println("En el rango 1.."+num+ ", hay "+cont_pri+ " números primos.");
    }
}
