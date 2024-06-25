//Pedir el radio de una circuferencia y calcular su longitud
public class longitudCirculo {
    public static void main(String[] args) {
        double l,r;//Longitud y radio

        System.out.println("Introduce el radio de una cincuferencia: ");
        r=Entrada.real();

        l=2*Math.PI*r;
        System.out.println("La longitud de una circunferencia de radio " +r+ " es:" +l);
        System.out.println("");
    }
}
