//Diseñar un programa que muestre el producto de los 10
//Primeros números impares.

package CondicionesyBucles;

public class numProducto10Impares {
    public static void main(String[] args) {
        long producto =1; //Guardara la multiplicacíon de 
        //Los primeros números impares.
        //es muy importante acordarse de inicializarlo a 1.
        //YA que si lo hacemos a 0, el producto siempre valdrá 0

        //Para calcular los 10 primeros números impares 
        //Utilizamos un for que comience en 1
        //Y en cada vuelta se incremente en 2, asi obtenemos
        //1,3,5,7,9,11,13,15,17,19
        for (int i = 1; i < 20; i+=2) {
            producto = producto*1;
        }

        System.out.println("La multiplicacion de los 10 primeros impares: " +producto);
    }
}
