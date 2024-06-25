package Colecciones;

// Define la interfaz  de una coleccion de tipo conjunto
import java.util.Iterator;

public interface setADT <T>{
    
    //añade un elemento a este conjunto, ignorando los duplicados
    public void add (T element);
    
    //Añade todos los elementos
    public void addAll();
    
    //Elimina y devuelve un elemento aleatorio de este conjunto.
    public  T removeRandom();
    
    //Elimina y devuelve el elemento especificado de este conjunto
    public T remove (T element);
    
    //Devuelve la union de este conjunto y del parametro
    public setADT<T> union (setADT<T> set);
    
    //Devuelve true si este conjunto contiene el parametro
    public boolean contains (T target);
    
    //Devuelve true si este conjunto contiene el parametro contienen exactamente los mismos elementos
    public boolean equals (setADT<T> set);
    
    //Devuelve true si este conjunto no contiene ningun elemento
    public boolean isEmpty();
    
    //Devuelve el numero de elementos de este conjunto
    public int size();
    
    //Devuelve un iterator para los elementos de este conjunto
    public Iterator<T> iterator();
    
    //Devuelve una representacion de este conjunto en forma de caena de caracteres
    @Override
    public String toString();
}