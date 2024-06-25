public class contCifras {
    public static void main(String[] args) {
        int num;
        System.out.print("");
        System.out.print("Introduce un número entre 0 y 99.99: ");
        num=Entrada.entero();

        if(num< 10)
            System.out.print("Tiene 1 cifra");
        else{
            if(num< 100)
                System.out.print("Tiene 2 cifra");
            else{
                if(num< 1000)
                    System.out.print("Tiene 3 cifra");
                else{
                    if(num< 10000)
                        System.out.print("Tiene 4 cifra");
                    else{
                        if(num< 100000)
                            System.out.print("Tiene 5 cifra");
                    }
                }
            }
        }
    }
}
