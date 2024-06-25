package PilasLibro;

import java.util.StringTokenizer;

public class PostfixEvaluator {
    private final char Suma = '+', Resta = '-', Multiplicacion = '*', Division = '/';
    private final LinkedStack<Integer> stack;
    
    //Configura un evaluador creando una nueva pila
    public PostfixEvaluator(){
        stack = new LinkedStack<>();
    }
    
    //Evalua la espresion postfija especificada. Si se encuentra un operando,
    //se lo inserta en la pila. si se encuentra un operador, se extrean dos operandos,
    //se evalua la operacion y se inserta el resultado en la pila.
    public int evaluate (String expr){
        
        int  op1, op2, result = 0;
        String token;
        StringTokenizer tokenizer = new StringTokenizer (expr);
        
        while (tokenizer.hasMoreTokens()){
            token = tokenizer.nextToken();
            
            if (isOperator(token)){
                op2 = (stack.pop());
                op1 = (stack.pop());
                result = evalSingleOp (token.charAt(0), op1, op2);
                stack.push (result);
            }
            else 
                stack.push(Integer.parseInt(token));
        }
        return result;
    }
    
    //Determina si el simbolo especificado es un operador.
    private boolean isOperator (String token){
        return (token.equals("+") || token.equals("-")
                || token.equals("*") || token.equals("/"));
    }
    
    //Evalua una unica expresion compuesta por el operador especificado
    //y sus correspondientes operandos
    private int evalSingleOp (char operation, int op1, int op2){
        
        int result = 0;
        
        switch(operation){
            case Suma:
                result = op1 + op2;
                break;
            case Resta:
                result = op1 - op2;
                break;
            case Multiplicacion:
                result = op1 * op2;
                break;
            case Division:
                result = op1 / op2;
                break;
        }
        return result;
    }
}

