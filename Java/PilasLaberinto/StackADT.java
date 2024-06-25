//Define la interfaz a una estructura de datos tipo pila.
package PilasLaberinto;

public interface StackADT<T> {
    
    //Añade un elemento a la cima de la pila
    public void push (T element);
    
    //Elimina y devuelve el elemento de la parte superior de la pila
    public T top();
    
    //Devuelve, sin eliminarlo, el elemento de la parte superior de la pila
    public T peek();
    
    //Devuleve true si esta pila no contiene ningun elemento
    public boolean isEmpty();
    
    //Devuelve el numero de elementos de la pila
    public int size();
    
    //Devuelve una representacion de la en forma de cadena de caracteres
    public String toString();
    
}