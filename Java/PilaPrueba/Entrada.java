package PilaPrueba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Entrada {
    static String init(){
        String buzon ="";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        try{
            buzon = teclado.readLine();
        }catch(Exception e){
            System.out.append("Entrada Incorrecta");
        }
        return buzon;
    }

    static int entero(){
        int valor = Integer.parseInt(init());
        return valor;
    }

    static double real(){
        double valor = Double.parseDouble(init());
        return valor;
    }

    static String cadena(){
        String valor = init();
        return valor;
    }

    static char caracter(){
        String valor = init();
        return valor.charAt(0);
    }
}
