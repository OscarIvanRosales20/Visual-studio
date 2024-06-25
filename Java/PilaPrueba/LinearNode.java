package PilaPrueba;

public class LinearNode<T> {
    private LinearNode<T> next;
    private T element;

    //Crea un nodo vacio
    public LinearNode(){
        next = null;
        element = null;
    }

    //Crea un nodo donde se almacena el elemento especificado
    public LinearNode(T elem){
        next = null;
        element = elem;
    }

    //Devuelve el nodo que sigue a este.
    public LinearNode<T> getNext(){
        return next;
    }
    
    //Establece el nodo que sigue a este
    public void setNext (LinearNode<T> node){
        next  = node;
    }
    
    //Devuelve el elemento almacenado a este nodo.
    public T getElement(){
        return element;
    }
    
    //Asigna el elemento que hay que almacenar en este nodo.
    public void setElement (T elem){
        element = elem;
    }
}
