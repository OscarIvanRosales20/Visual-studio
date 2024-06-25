//Pedir una nota del 0 al 10 y mostrarla de la forma: 
//Insuficiente, Suficiente, Bien, Notable, Sobresaliente
public class calificacionesSwich {
    public static void main(String[] args) {
        int nota;

        System.out.println("Introduzca una nota");
        nota= Entrada.entero();

        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
