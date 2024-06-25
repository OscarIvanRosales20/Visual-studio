//pedir dos números y decir cual es el mayor o si son iguales.
public class numComparar {
    public static void main(String[] args) {
        int n1, n2;
        System.out.println("Introduce un número:");
        n1=Entrada.entero();
        System.out.println("Introduce otr0 número: ");
        n2=Entrada.entero();

        if(n1==n2){
            System.out.println("Son iguales");
        }else {
            if(n1>n2)
                System.out.println(n1+ " Es mayor que " +n2);
            else
                System.out.println(n2+" Es mayor que "+n1);
        }
            
    }
}
