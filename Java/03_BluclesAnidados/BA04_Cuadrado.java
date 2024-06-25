//Dibuja un cuadrado de n elementos de lado utilizando *
public class BA04_Cuadrado {
    public static void main(String[] args) {
        int n; //Tamaño del lado
        int fila,col;
        System.out.print("Lado de cuadrado: ");
        n=Entrada.entero();

        for ( fila = 1; fila <=n; fila++) {
            for(col=1;col<=n;col++)
                System.out.print("* ");
            System.out.println("");
        }
    }
}
