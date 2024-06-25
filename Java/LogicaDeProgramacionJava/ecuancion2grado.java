//Pedir los coeficientes de una ecuacion de 2° grado, y mestre sus soluciones reales.
//Si no eisten, debe indicarlo.
public class ecuancion2grado {
    public static void main(String[] args) {
        double a,b,c;//coeficientes ax^2+bx+c=0
        double x1,x2,d;//Soluciones y determinante

        System.out.println("Introduzca el Primer coeficiente: (a):");
        a = Entrada.entero();
        System.out.println("Introduzca el Segundo coeficiente: (b):");
        b = Entrada.entero();
        System.out.println("Introduzca el Tercer coeficiente: (c):");
        c = Entrada.entero();

        //Calculamos el determinante
        d= ((b*b) -4*a*c);
        if(d<0)
            System.out.println("No Existen soluciones reales");

        else{
            if (a==0) {
                System.out.println("Lo siento, no puedo dividir sobre 0");
            } else {
                x1=(-b + Math.sqrt(d))/(2*a);
                x2=(-b - Math.sqrt(d))/(2*a);
                System.out.println("Solucion: " + x1);
                System.out.println("Solucion: " + x2);
            }
        }

        System.out.println("");
    }
}
