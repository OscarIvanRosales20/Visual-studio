//Pedir un número de 0 al 99 y mostrarlo escrito: P.Ejemplo
// 56 mostrarlo : cincuenta y seis

public class numEscrito {
    public static void main(String[] args) {
        int num;
        int unidades, decenas;

        //Esta version muestra 11 como diez y uno
        //Es una forma de hacerlo bastante burda.
        //Se puede poner algunos condicionales para los
        //numeros especiales: 11,12...
        //Y otro condicional para mostrar el "Y"

        System.out.println("Introduzca un número del (0 a 99): ");
        num = Entrada.entero();
        unidades = num %10;
        decenas = num /10;
        switch(decenas){
            case 0:
            System.out.print("");
            break;
            case 1:
            System.out.print("Diez");
            break;
            case 2:
            System.out.print("Veinte");
            break;
            case 3:
            System.out.print("Treinta");
            break;
            case 4:
            System.out.print("Cuarenta");
            break;
            case 5:
            System.out.print("Cincuenta");
            break;
            case 6:
            System.out.print("Sesenta");
            break;
            case 7:
            System.out.print("Setenta");
            break;
            case 8:
            System.out.print("Ochenta");
            break;
            case 9:
            System.out.print("Noventa");
            break;
        }
        System.out.print(" Y ");

        switch(unidades){
            case 0:
            System.out.print("");
            break;
            case 1:
            System.out.print("Uno");
            break;
            case 2:
            System.out.print("Dos");
            break;
            case 3:
            System.out.print("Tres");
            break;
            case 4:
            System.out.print("Cuatro");
            break;
            case 5:
            System.out.print("Cinco");
            break;
            case 6:
            System.out.print("Seis");
            break;
            case 7:
            System.out.print("Siete");
            break;
            case 8:
            System.out.print("Ocho");
            break;
            case 9:
            System.out.print("Nueve");
            break;
        }
    }
}
