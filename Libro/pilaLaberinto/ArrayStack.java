package pilaLaberinto;

import java.util.EmptyStackException;

public class ArrayStack<T> {
    
    private T[] stack;
    private int top;
    private final int DEFAULT_CAPACITY = 100;
    
    
    //crea un conjunto vacio utilizando la capacidad predeterminada.
    public ArrayStack(){
        top = 0;
        stack = (T[])(new Object[DEFAULT_CAPACITY]);
    }
    
    /*Añade el elemento especificado a la cima de la pila, expandiendo la 
    capacidad de la matrix que implementa la pila en caso necesario*/
    public void push (T element){
        if (size() == stack.length)
            expandCapacity();
        
        stack[top] = element;
        top++;
    }
    
    /*Elimina el elemento situado en la cima de la pila y devuelve una referencia
    al mismo. Genera una excepcion EmptyStackException si la pila esta vacia*/
    public T pop() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();
        
        top--;
        T result = stack[top];
        stack[top] = null;
        
        
        return result;
    }
    
    //Devuelve el numero de este elemento que el cojunto tiene actualmente.
    public int size(){
        return top;
    }
    
    //Devuleve el elemento Situado en la cima de la pila sin eliminarlo.
    //Genera una excepcion EmptyStackException si la pila esta vacia
    public T peek()throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        
        T result = stack[top];
        stack[top] = null;
        
        return result;
    }
    
    //devuelve true si el conjunto esta vacio y false en caso contrario.
    public boolean isEmpty(){
        return (top == 0);
    }
    
    //crea una nueva matrix para almacenar el contenido del conjunto,
    //con una capacidad igual al doble de la capacidad de la matrix anterior
    private void expandCapacity(){
        T[] larger = (T[])(new Object[stack.length*2]);
        
        for (int index = 0; index < stack.length; index++)
            larger[index] = stack[index];
        
        stack = larger;
    }
    
    //Devuelve una representacion de este conjunto en forma de cadena de caracteres
    public String toString(){
        String result= "";
        
        for (int index = 0; index < top; index++)
           result = result + stack[index].toString() + "\n";
        
        return result;
    }
}