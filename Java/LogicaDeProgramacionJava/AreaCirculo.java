//Pedir el radio de un circulo y calcular su área.
public class AreaCirculo {
    public static void main(String[] args) {
        double a,r;
        
        System.out.println("Introduce el radio del circulo");
        r=Entrada.real();

        a=Math.PI*(r*r);
        //a=Math.PI*(Math.pow(r,2));  28.274333882308138
        System.out.println("El area de una circuferencia de radio " + r + " es:" + a);

    }
}
