//Pedir el día, mes  año de una fecha e indicar si la fecha 
//es correcta. Suponiendo todos los meses de 30 dias.
public class calendario30Dias {
    public static void main(String[] args) {
        int dia, mes, año;

        //Para que una fecha sea correcta se tiene que cumplir
        //día en el rango 1..30
        //mes en el rango 1..12
        //año cualquiera distinto del 0

        System.out.println("Introduzca día: ");
        dia = Entrada.entero();
        System.out.println("Introduzca mes: ");
        mes = Entrada.entero();
        System.out.println("Introduzca año: ");
        año = Entrada.entero();
        
        if(dia >= 1 && dia <=30)
            if(mes >= 1 && mes <=12)
                if(año != 0)
                    System.out.println("Fecha Correcta " +dia+"/"+mes+"/"+año);
                else
                    System.out.println("Año incorrecto "+ año);
            else
                System.out.println("Mes incorrecto " +mes);
        else
            System.out.println("Dia incorrecto " +dia);
    }
}
