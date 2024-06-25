package PilasLibro;

import java.util.Scanner;

public class Postfix {
    
    //Lee y evalua multiples expresiones Postfijas.
    public static void main(String[] args){
        String Expression, again;
        int Resul;

        Scanner in = new Scanner(System.in);
        
        do{
            PostfixEvaluator evaluator = new PostfixEvaluator();
            System.out.println("Ingresa una expresion postfija valida");
            Expression = in.nextLine();

            Resul = evaluator.evaluate(Expression);
            System.out.println();
            System.out.println("La exprecion equivalente es: " + Resul);
                
            System.out.println("Evaluar otra expresion [Y/N]???");
            again = in.nextLine();
            System.out.println();
        }
        while(again.equalsIgnoreCase("Y"));
    }
}
