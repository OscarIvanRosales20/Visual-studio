//Pedir números hasta que se teclee un 0,
// Mostrar la suma de los números
package CondicionesyBucles;

public class numLeerSumar{
    public static void main(String[] args) {
        int suma,num;
        suma=0;
        // Suma Se guarda el valor de la suma
        // num guarda los números introducidos
        do{
            System.out.println("Introduce N: ");
            num = Entrada.entero();

            suma= suma +num;
        } while(num != 0);

        System.out.println("La suma de todos los números es: " +suma);
    }
}