public class T01_NumMostrar{
    public static void main(String[] args) {
        int t[];

        t = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca un número: ");
            t[i]=Entrada.entero();
        }
        System.out.println("Los numeros son:");

        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }

    }
}