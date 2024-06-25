public class numMultiplo {
    public static void main(String[] args) {
        int num;
        boolean multiplo_3;
        multiplo_3=false;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca número: ");
            num=Entrada.entero();
            if(num %3 ==0)
                multiplo_3 = true; //Si se ejecuta esta instruccion significa que al menos hay un multiplo

        }
        if(multiplo_3==false)
            System.out.println("No existen múltiplos de 3");
        else
            System.out.println("Hay múltipos de 3");
    }
}
