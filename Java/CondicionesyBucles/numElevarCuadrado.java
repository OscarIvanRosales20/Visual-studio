package CondicionesyBucles;

public class numElevarCuadrado {
    public static void main(String[] args) {
        int num, cuadrado;
        //num guardará el número que leamos
        //y cuadrado guardará el cuadrado de num
        System.out.println("Introduzca un número: ");
        num = Entrada.entero();

        while(num >=0){//Repetimos el proceso mientras el numero no sea negativi
            if(num != 0){
                cuadrado= num*num;
            System.out.println(num+"^2 es igual a "+cuadrado);
            System.out.println("Introduzca otro número: ");
            num=Entrada.entero();
            } else
               System.out.println("No podemos elevar el 0") ;
               break;
        }
    }
}
