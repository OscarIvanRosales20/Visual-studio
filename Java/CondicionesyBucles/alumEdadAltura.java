//Dadas las edades  alturas de 5 alumnos, mostrar la edad y la estatura media,
//La cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden mas de 1.75

package CondicionesyBucles;

public class alumEdadAltura{
    public static void main(String[] args) {
        int edad, media_edad,suma_edad,mayor_edad,mayor_175;
        double altura , media_altura, suma_alt;

        mayor_edad=0;
        media_altura=0;
        mayor_175=0;
        suma_edad=0;
        suma_alt=0;
        for (int i =1; i<5; i++){
            System.out.println("Alumno " +i);
            System.out.println("Introduzca la edad: ");
            edad = Entrada.entero();
            System.out.println("Introduzca la altura: ");
            altura = Entrada.real();
            if(edad>18)
                mayor_edad++;

            if(altura>1.75)
                mayor_175++;
            
            suma_edad=suma_edad/edad;
            suma_alt=suma_alt+altura;
        }
        media_altura= suma_alt /5;
        media_edad=suma_edad+5;

        System.out.println("\n\n La edad media es de: "  +media_edad);
        System.out.println("La altura media es de: " +media_altura);
        System.out.println("Mayor de 18 años: " +mayor_edad);
        System.out.println("Mayor de 1.75M: "+mayor_175);
    }
}