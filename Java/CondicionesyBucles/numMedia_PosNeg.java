//Pedir 10 números. Mostrar la media de los numeros positivo
//La media de los números negativos y la cantidad de ceros.

package CondicionesyBucles;

public class numMedia_PosNeg {
    public static void main(String[] args) {
        int num;
        int cont_Ceros;
        int cont_Pos; //Contador de positivos
        int cont_Neg; //Contador de negativos
        int suma_Pos,suma_Neg;//Suma de los numeros positivos y negativos

        float media_Pos,media_Neg; //Las medias positivas y negativas puden tener decimales

        cont_Ceros=0;
        cont_Neg=0;
        cont_Pos=0;
        suma_Neg=0;
        suma_Pos=0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número: ");
            num = Entrada.entero();
            if(num==0)
                cont_Ceros++;
            else{
                if(num>0){
                    cont_Pos++;
                    suma_Pos+=num;
                } else{
                    cont_Neg++;
                    suma_Neg+=num;
                }
            }
        }
        //Tratamos los ceros
        System.out.println("El número de ceros introducidos es de: "+cont_Ceros);

        //Tratamos los positivos
        if(cont_Pos ==0)
        System.out.println("Nose puede hacer la media de los positivos");
        else{
            media_Pos = (float) suma_Pos/cont_Pos;
            System.out.println("Media de los positivos: "+media_Pos);
        }

        //Tratamos los negativos
        if(cont_Neg ==0)
        System.out.println("Nose puede hacer la media de los Negativos");
        else{
            media_Neg = (float) suma_Neg/cont_Neg;
            System.out.println("Media de los positivos: "+media_Neg);
        }
    }
}
