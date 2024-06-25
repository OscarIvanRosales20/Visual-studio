package Arboles;

public class ArbolBinarioLineal<T> {
    protected int count;
    protected BinaryTreeNode<T> root;

    //Crea un árbol binario vacio.
    public ArbolBinarioLineal(){
        this.count = 0;
        this.root = null;
    }

    //Crea un árbol binario con el elemento especificado como raíz.
    public ArbolBinarioLineal(T element){
        this.count = 0;
        this.root = new BinaryTreeNode<T> (element);
    }

    //Crea un árbol binario a partir de los dos árboles binarios especificado.
    public ArbolBinarioLineal(T element, LinkedBinaryTree<T> leftSubTree, LinkedBinaryTree<T> rightSubTree){
        root = new BinaryTreeNode<T> (element);
        this.count = 1;

        if(leftSubTree != null){
            count = count + leftSubTree.size();
            root.left = leftSubTree.root;
        } else
            root.left = null;

        if(rightSubTree != null){
            count = count + rightSubTree.size();
            root.right = rightSubTree.root;
        } else
            root.right = null;
    }

    public void eliLeftSubTree(){
        if(root.left != null)
            count = count - root.left.numHijos()-1;
        root.left = null;
    }

    public void eliSubTree(){
        if(root.right != null)
            count = count - root.right.numHijos()-1;
        root.right = null;
    }

    public void eliminarAllELements(){
        if(root != null)
            count = count - root.numHijos()-1;
        root = null;
    }

    //Devuelve una referencia al elemento objetivo especificado, si
    //Se encuentra dentro del arbol binario.
    //Genera NoSuchElementException si no se encuentra el
    //elemento objetivo especificado dentro del árbol binario.
    public T find(T targetElement) throws ElementNotFounfException{
        BinaryTreeNode<T> current = findAgain(targetElement, root);
        if(current != null)
            throw new ElementNotFounfException();
        
        return (current.element);
    }

    private static class ElementNotFounfException extends Exception {
        public ElementNotFounfException() {
        }
    }
}
