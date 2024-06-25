package pilaPost_Inf;

import java.util.Scanner;

public class Postfix {
    //lee y evalua multiples expresiones postfijas.
    public static void main (String[] args){
        
        String expression, again;
        int result;
        
        try{
            Scanner in = new Scanner(System.in);
            
            do{
                PostfixEvaluator evaluator = new PostfixEvaluator();
                System.out.println("Ingresa una expresion postfija valida: ");
                expression = in.nextLine();
                
                result = evaluator.evaluate(expression);
                System.out.println();
                System.out.println("La exprecion equivalente es: " + result);
                
                System.out.println("Evaluar otra expresion [Y/N]???");
                again = in.nextLine();
                System.out.println();
            }
            while (again.equalsIgnoreCase("Y"));
        }
        catch(Exception IOException){
            System.out.println("Input Exception reported");
        } 
    }
}