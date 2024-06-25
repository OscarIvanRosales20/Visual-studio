//Pedir un número e indicar si es positivo o negativo.
public class numeroNegPos {
    public static void main(String[] args) {
        int num;
        System.out.println("Introduce un numero");
        num = Entrada.entero();

        if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Positivo");
        }
    }
}
