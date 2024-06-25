package Colecciones;

import java.util.Random;
import java.util.Iterator;

public class ArraySet<T> {
    private static Random rand = new Random();
    
    private final int DEFAULT_CAPACITY = 100;
    private final int NOT_FOUND = -1;
    
    private int count;
    private T[] contents;

    //crea un conjunto vacio utilizando la capacidad predeterminada.
    public ArraySet(){
        this.count = 0;
        this.contents = (T[])(new Object[DEFAULT_CAPACITY]);
    }

    //crea un conjunto vacio utilizando la capacidad especificada.
    public ArraySet(int initialCapacity){
        this.count = 0;
        this.contents = (T[])(new Object[initialCapacity]);
    }
    
    //devuelve el numero de este elemento que el cojunto tiene actualmente.
    public int size(){
        return count;
    }
    
    //devuelve true si el conjunto esta vacio y false en caso contrario.
    public boolean isEmpty(){
    return (count == 0);
    }
    
    //añade el elemento especificado al conjunto, si es que ese elemento no esta
    // ya presente. Expande la capacidad de la matrix del conjunto en caso contrario
    public void add (T element){
        if (!(contains(element)))
        {
            if (size() == contents.length)
                expandCapacity();
            
            contents[count] = element;
            count++;
        }
    }

    // Añade al conjunto el contenido del conjunto suministrado por el parametro
    public void addAll (setADT<T> set){
        Iterator<T> scan = set.iterator();
        
        while (scan.hasNext())
            add (scan.next());
    }
    
    //crea una nueva matrix para almacenar el contenido del conjunto,
    //con una capacidad igual al doble de la capacidad de la matrix anterior
    private void expandCapacity(){
        T[] larger = (T[])(new Object[contents.length*2]);
        
        //System.arraycopy(contents, 0, larger, 0, contents.length);
        for(int i = 0; i <contents.length; i++)
            larger[i] = contents[i];
        
        contents = larger;
    }

    //Elimina un elemento aleatorio del conjunto y lo devuelve. Genera una
    //Excepcion EmptySetException si el conjunto esta vacio.
    public T removeRandom() throws EmptySetException {
        if (isEmpty())
            throw new EmptySetException();
        
        int choice = rand.nextInt(count);
        
        T result = contents[choice];
        
        contents[choice] = contents[count-1]; //Rellenar el hueco
        contents[count-1] = null;
        count--;
        
        return result;
    }

    //Elimina el elemento especificado del conjunto y lo devuleve.
    //Genera EmptySetException si el conjunto esta vacio y NoSuchElementException
    //si el elemento especificado no se encuentraen el conjunto.
    public T remove (T target)throws EmptySetException,  NoSuchElementException{
        int search = NOT_FOUND;
        
        if (isEmpty())
            throw new EmptySetException();
        
        for (int index= 0; index < count && search == NOT_FOUND; index++)
            if (contents[index].equals(target))
                search = index;
        
        if (search == NOT_FOUND)
            throw new NoSuchElementException();
        
        T result = contents[search];
        
        contents[search] = contents[count-1];
        contents[count-1] = null;
        count--;
        
        return result;
    }            
    
    //Devueve un nuevo conjunto que es la union del conjunto actual y del
    //conjunto pasado como parametro.
    public ArraySet<T> union (setADT<T> set){
        ArraySet<T> both = new ArraySet<>();
        
        for (int index = 0; index < count; index++)
            both.add(contents[index]);
        
        Iterator<T> scan = set.iterator();
        while (scan.hasNext())
            both.add (scan.next());
        
        return both;
    }

    //Devuelve true si este conjunto contiene el elemento especificado
    public boolean contains(T  target){
        int search = NOT_FOUND;
        
        for (int index = 0; index < count && search == NOT_FOUND; index++)
            if (contents[index].equals(target))
                search = index;
        
        return(search != NOT_FOUND);
    }
    
    //Devuelve True si este conjunto contiene exactamente los mismos elementos que el
    //conjunto pasado como parametro.
    public boolean equals (setADT<T> set) throws EmptySetException, NoSuchElementException{
        boolean result = false;
        ArraySet<T> temp1 = new ArraySet<T>();
        ArraySet<T> temp2 = new ArraySet<T>();
        
        T obj;
        if (size() == set.size()){
            temp1.addAll((setADT<T>) this);
            temp2.addAll(set);
            
            Iterator<T> scan = set.iterator();
            
            while (scan.hasNext()){
                obj = scan.next();
                
                if (temp1.contains(obj)){
                    temp1.remove(obj);
                    temp2.remove(obj);
                }
            }
            result = (temp1.isEmpty() && temp2.isEmpty());
        }
        return result;
    }
    
    //Devuelve un iterator para los elementos que se encuentran actualmente en el conjunto
    /**
     * @return
     */
    public Iterator<T> Iterator(){
        return new ArrayIterator<T> (contents, count);
    }
    
    //Devuelve una representacion de este conjunto en forma de cadena de caracteres
    @Override
    public String toString(){
        String result= "";
        
        for (int index = 0; index < count; index++)
           result = result + contents[index].toString() + "\n";
        
        return result;
    }

    public static class EmptySetException extends Exception {
        public EmptySetException() {
        }
    }

    private static class NoSuchElementException extends Exception {

        public NoSuchElementException() {
        }
    }
}
