//Realiza un juego de adivinar número. Para ello pedir un
// numero N y luego ir pidiendo números indicando "Mayor"
// o "Menor" Según se mayor o menor con respecto a N.
//El proceso termina cuando el usuario acierta.

package CondicionesyBucles;

public class numAdivina {
    public static void main(String[] args) {
        int n,num;
        // n es el número que hay que acertar
        // num guarda los números introducidos
        System.out.println("Introduce N: ");
        n = Entrada.entero();

        System.out.println("Introduce número: ");
        num = Entrada.entero();

        while(num!= n){
            if(num>n)
            System.out.println("Menor");
            else
            System.out.println("Mayor");

            System.out.println("Introduce número: ");
            num = Entrada.entero();
        }
        // Al salir del bucle tenemos la certeza que num es igual a n.
        System.out.println("Acertaste...");
    }
}
