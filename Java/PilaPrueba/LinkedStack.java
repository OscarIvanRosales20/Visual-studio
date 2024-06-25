package PilaPrueba;

import java.util.EmptyStackException;

public class LinkedStack<T> {

    private int count;
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
        
        LinearNode<T> temp = new LinearNode<> (element);
        
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
        
        T result = top.getElement();
        top = top.getNext();
        
        return result;
    }

    public String toString(){
        String result ="";

        for (int i = 0; i < count; i++){
            result = result + top.getElement() + "\n";
            top = top.getNext();
        }
        return result;            
    }
}
