public class T02_NumMostrarInverso {
    public static void main(String[] args) {
        int t[] = new int[5];

        for (int i = 0; i < t.length; i++) {
            System.out.println("Introduzca un número: ");
            t[i]=Entrada.entero();
        }

        System.out.println("Los números en (orden inverso): ");
        for (int i = 4; i >= 0; i--) {
            System.out.println(t[i]);
        }

    }
}
