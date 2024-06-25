package Colecciones;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator {
    
    private final int count;      //numeros de elementos de la coleccion
    private int current;    //posicion actual de a iteracion
    private final T[] items;


    //inicializa el iterador utilizando los elementos especificados
    public ArrayIterator (T[] collection, int size){
            
        this.items = collection;
        this.count = size;
        this.current = 0;
    }

    //Devuele true si el iterator tiene al menos uno elemento mas para devolver
    // como parte de la iteracion
    @Override
    public boolean hasNext(){
        return (current< count);
    }

    //Devuelve el siguiente elemento de la iteracion. si no hay mas en la iteracion,
    //se genera una exception NoSuchElementException.
    @Override
    public T next(){
        if (!hasNext())
            throw new NoSuchElementException();
            
        current++;
        return items[current - 1];
    }
    
    //La operacion remove no esta soportada en esta colecion
    public void remove()throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    public int getCount() {
        return count;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public T[] getItems() {
        return items;
    }
}