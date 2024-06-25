package Arboles;

public class BinaryTreeNode<T> {
    protected T element;
    protected BinaryTreeNode<T> left, right;

    //Crea un nuevo nodo del árbol con los datos especificados.
    BinaryTreeNode(T obj){
        this.element = obj;
        this.left = null;
        this.right = null;
    }

    //Devuelve el numero de hijos  no nulos de este nodo.
    //Este metodo podria escribirse de una manera mas eficiente.
    public int numHijos(){
        int hijo =0;
        if(left != null)
            hijo = 1 + left.numHijos();
        
        if(right != null)
            hijo = hijo + 1 + right.numHijos();

        return hijo;
    }
}
