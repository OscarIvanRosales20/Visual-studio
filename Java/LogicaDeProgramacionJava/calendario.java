//Pedir el día, mes  año de una fecha e indicar si la fecha 
//es correcta. Con meses de 28, 30 y 31 dias. Sin años Bisiestos

public class calendario {
    public static void main(String[] args) {
        int dia, mes, año;

        System.out.println("Introduzca día: ");
        dia = Entrada.entero();
        System.out.println("Introduzca mes: ");
        mes = Entrada.entero();
        System.out.println("Introduzca año: ");
        año = Entrada.entero();

        //El unico año que no existe es el 0
        if(año == 0)
            System.out.println("Felicidades, viajaste al nacimiento de cristo");
        else{
            if(mes ==2 && (dia>=1 && dia <=28))
                System.out.println(dia+"/"+mes+"/"+año+": Fecha correcta");
            else{
                if(mes ==4 || mes ==6 || mes ==9 ||mes ==11 && (dia>=1 && dia <=30))
                    System.out.println(dia+"/"+mes+"/"+año+": Fecha correcta");

                else{
                    if(mes ==1 || mes ==3 || mes ==5 ||mes ==7 ||mes ==8 ||mes==10 ||mes==12 && (dia>=1 && dia <=31))
                    System.out.println(dia+"/"+mes+"/"+año+": Fecha correcta");
                    else
                        System.out.println("Fecha Incorrecta");
                }
            }
        }
    }
}
