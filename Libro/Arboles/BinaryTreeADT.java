package Arboles;
//Define la interfaz para una estructura de datos en árbol binario.

import java.util.Iterator;

public interface BinaryTreeADT<T> {
    //Debe implementarse para eliminar el subarbol izquierdo de la raíz del arbol binario
    public void eliLeftSubTree();//

    //Debe implementarse para eliminar el subarbol derecho de la raíz del arbol binario.
    public void eliRightSubTree();

    //Debe implementarse para eliminar todos los elementos del arbol binario
    public void eliminarAllELements();

    //Debe implementarse para devolver el número de elementos del árbol binario.
    public int size();

    //Debe implementarse para devolver true si el arbol binario contiene
    //un elemento que se corresponda con el elemento 
    //Especificado y false en caso contrario.
    public boolean contains(T targetElement);

    //Debe implementarse para devolver una referencia al elemento especificado.
    //Si se encuentra dentro del árbol binario. Genera una excepcion
    //Si el elemento no se encuentra en el árbol.
    public T find(T targetElement);

    //Debe implementarse para devolver la representacion del árbol binario en forma de caracteres.
    public String toString();

    //Debe implenetarse para realizar un recorrido en árbol del árbol binario, 
    //invocando un metodo recursivo sobrecargado de recorrido en árbol que comienza por la raiz.
    public Iterator<T> iteratorInOrder();

    //Debe implenetarse para realizar un recorrido descendente del arbol binario, 
    //invocando un metodo recursivo sobrecargado de recorrido en árbol que comienza por la raiz.
    public Iterator<T> iteratorPreOrder();

    //Debe implenetarse para realizar un recorrido ascendente del arbol binario, 
    //invocando un metodo recursivo sobrecargado de recorrido en árbol que comienza por la raiz.
    public Iterator<T> iteratorPostOrder();

    //Debe implenetarse para realizar un recorrido por niveles del arbol binario, 
    //utilizando una cola.
    public Iterator<T> iteratorLevelOrder();
}
