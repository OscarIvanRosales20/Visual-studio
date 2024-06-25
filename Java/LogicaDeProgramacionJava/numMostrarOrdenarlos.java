//Pedir 3 numeros y mostrarlos ordenados de mayo a menor.
public class numMostrarOrdenarlos {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Introduzca el primer número: ");
        a=Entrada.entero();
        System.out.println("Introduzca el segundo número: ");
        b=Entrada.entero();
        System.out.println("Introduzca el tercer número: ");
        c=Entrada.entero();

        if(a>b && b>c)
            System.out.println(a+", "+b+", "+c+", ");
        else{
            if(a>c && c>b)
                System.out.println(a+", "+c+", "+b+", ");
            else{
                if(b>a && a>c)
                    System.out.println(b+", "+a+", "+c+", ");
                else{
                    if(b>c && c>a)
                        System.out.println(b+", "+c+", "+a+", ");
                    else{
                        if(c>a && a>b)
                            System.out.println(c+", "+a+", "+b+", ");
                        else{
                            if(c>b && b>a)
                                System.out.println(c+", "+b+", "+a+", ");
                        }
                    }
                }
            }
        }
    }
}
