package EstrucEnlazadas;

import java.util.Random;

public class LinkedSet<T> {
    private static final Random rand =  new Random();
    private int count;  //el numeros actual de elementos del conjunto
    private LinearNode<T> contents;

    //Crea un conjunto vacio.
    public LinkedSet(){
        this.count = 0;
        this.contents = null;
    }
    //devuelve el numero de este elemento que el cojunto tiene actualmente.
    public int size(){
        return count;
    }
    
    //devuelve true si el conjunto esta vacio y false en caso contrario.
    public boolean isEmpty(){
        return (count == 0);
    }

    //añade el elemento especificado al conjunto si no esta ya presente
    public void add (T element){
        if (!(contains(element))){
            LinearNode<T> node = new LinearNode<> (element);
            node.setNext(contents);
            contents = node;
            count++;
        }
    }

    //Elimina del conjunto un elemento aleatorio y lo devuelve. Genera una 
    //Excepcion EmptySetException si el conjunto esta vacio.
    public T removeRandom() throws EmptySetException{
        LinearNode<T> previous, current;
        T result = null;
        
        if (isEmpty())
            throw new EmptySetException();
        
        int choice = rand.nextInt(count) + 1;
        
        if (choice == 1){
            result = contents.getElement();
            contents = contents.getNext();
        }else {
            previous = contents;
            
            for (int skip = 2; skip < choice; skip++)
                previous = previous.getNext();
            current = previous.getNext();
            result = current.getElement();
            previous.setNext(current.getNext());
        }
        count--;
        return result;
    }

    /* Elimina del conjunto el elemento especificado y lo devuelve.
    Genera EnptysetException si el conjunto esta vacio y NoSuchElementException
    Si el elememto indicado no se encuentra dentro del conjunto*/
    public T remove (T target) throws EmptySetException, NoSuchElementException{
        boolean found = false;
        LinearNode<T> previous, current;
        T result = null;
        
        if(isEmpty())
            throw new EmptySetException();
        
        if(contents.getElement().equals(target)){
            result = contents.getElement();
            contents = contents.getNext();
        }else{
            previous = contents;
            current = contents.getNext();
            
            for(int look = 1; look < count && !found; look++)
                if(current.getElement().equals(target))
                    found = true;
                else {
                    previous = current;
                    current = current.getNext();
                }
            if (!found)
                throw new NoSuchElementException();
            
            result = current.getElement();
            previous.setNext(current.getNext());
        }
        count--;
        return result;
    }
}
