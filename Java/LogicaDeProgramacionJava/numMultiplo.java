//Pedir dos números y decir si uno es múltiplo de otro.
public class numMultiplo {
    public static void main(String[] args) {
        int n1,n2;
        System.out.println("Introduce un numero: ");
        n1=Entrada.entero();

        System.out.println("Introduce otro numero: ");
        n2=Entrada.entero();

        if (n1% n2 ==0) {
            System.out.println("Son multiplos");
        } else {
            System.out.println("No son multiplos");
        }
    }
}
