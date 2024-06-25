package pilaPost_Inf;

import java.util.Random;
import java.util.EmptyStackException;

public class LinkedStack<T> {
    private static final Random rand =  new Random();
    private int count;  //el numeros actual de elementos del conjunto
    private LinearNode<T> top;
    
    //Crea un conjunto vacio
    public LinkedStack(){
        count = 0;
        top = null;
    }
    
    //devuelve el numero de este elemento que el cojunto tiene actualmente.
    public int size(){
        return count;
    }
    
    //devuelve true si el conjunto esta vacio y false en caso contrario.
    public boolean isEmpty(){
    return (count == 0);
}
    
    //Añade el elemento especificado a la pila
    public void push (T element){
        
        LinearNode<T> temp = new LinearNode<T> (element);
        
        temp.setNext(top);
        top = temp;
        count ++;
    }
    
    /*Elimina el elemento situado en la cima de la pila y devuleve una referencia
    al mismo una referencia al mismo. Genera una excepcion EmptyStackException 
    si la pila esta vacia*/
    public T pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        
        T result = top.getElement();
        top = top.getNext();
        count--;
        
        return result;
    }
    
    //Devuleve el elemento Situado en la cima de la pila sin eliminarlo.
    //Genera una excepcion EmptyStackException si la pila esta vacia
    public T peek()throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        
        T result = (T)top;
        top = null;
        
        return result;
    }
}
