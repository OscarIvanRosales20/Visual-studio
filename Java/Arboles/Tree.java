package Arboles;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {

    //******************************************************
    /******Metodos Recursivos*****************************************
    ******************************************************** */
    // We start with preOrder treversal with recusion
    public static <T> void preOrderTraverse(Node<T> node) {
    if (node == null)
      return;
  
      //In pre order traversal, we make Root, left, Right
      //First we display root data
    System.out.print(node.data + " ");
    //then we go on left SunbTree
    preOrderTraverse(node.left);
    //Then right SubTree
    preOrderTraverse(node.right);
  }

  // We start with inOrder traversal with recusion
  public static <T> void inOrderTraverse(Node<T> node){
    if (node == null)
      return;
  
      //In In order traversal, we make Left, Root, Right
    
    //then we go on left SubTree
    inOrderTraverse(node.left);
    //Second we display root data
    System.out.print(node.data + " ");
    //Then right SubTree
    inOrderTraverse(node.right);
  }

  // We start with PostOrder traversal with recursion
  public static <T> void postOrderTraverse(Node<T> node) {
    if (node == null)
      return;
  
      //In pre order traversal, we make left, Right, Root
    //then we go on left SunbTree
    postOrderTraverse(node.left);
    //Then right SubTree
    postOrderTraverse(node.right);
    //First we display root data
    System.out.print(node.data + " ");
  }


  //******************************************************
    /******Metodos Iterativos*****************************************
    ******************************************************** */


  public static <T> void iterativePreOrder(Node<T> node){
    if (node == null)
        return;
    //We create en empty stack and we push root to it
    Stack<Node<T>> nodeStack = new Stack<>();
    nodeStack.push(node);

    //We pop all items one by one.
    //For each item, we make the following steps: print data, push its right child, push its left child
    //We push right child in first for that left is processed first
    while(!nodeStack.empty()){
        Node<T> currentNode = nodeStack.pop();
        System.out.print(currentNode.data + " ");

        if(currentNode.right != null)
            nodeStack.push(currentNode.right);

        if(currentNode.left != null)
            nodeStack.push(currentNode.left);
    }
  }


  public static <T> void iterativeInOrderTraverse(Node<T> node){
    if(node == null)
      return;

    //We create an empty Stack
    Stack<Node<T>> nodeStack = new Stack<>();
    Node<T> currentNode = node;

    //We traverse the Tree
    while (currentNode != null  || nodeStack.size()>0){
      //We try to reach the most left node of the current node
      while(currentNode != null){
        //We add the pointer to the stack before traversin to the left node
        nodeStack.push(currentNode);
        currentNode = currentNode.left;
      }

      //current Node is null a this point
      currentNode = nodeStack.pop();
      System.out.print(currentNode.data + " ");

      //Now, is´s time to visit the right subtree
      currentNode = currentNode.right;
    }
  }

  public static <T> void iterativePostOrder(Node<T> node){
    if(node == null)
      return;

    //We create an two Stack
    Stack<Node<T>> nodeStack1 = new Stack<>();
    Stack<Node<T>> nodeStack2 = new Stack<>();
    
    //We push root to first stack
    nodeStack1.push(node);

    //We iterate while first stack is not empty
    while(!nodeStack1.isEmpty()){
      //We pop an item from nodeStack1 and we push it to nodeStack2
      Node<T> tmpNode = nodeStack1.pop();
      nodeStack2.push(tmpNode);

      //we push left and right children of removed item to nodeStack1
      if(tmpNode.left != null)
        nodeStack1.push(tmpNode.left);

      if(tmpNode.right != null)
        nodeStack1.push(tmpNode.right);
    }

    //We print all elements of nodeStack2
    while(!nodeStack2.isEmpty()){
      Node<T> tmpNode = nodeStack2.pop();
      System.out.print(tmpNode.data + " ");
    }
  }


  //Level traversal (Breadth-First Search)
  public static<T> void levelOrderTraverse(Node<T> node){
    if(node == null)
      return;
    
    Queue<Node<T>> queue = new LinkedList();
    //we add start node
    queue.add(node);


    //iterative While queue not Empty
    while(!queue.isEmpty()){
      //dequeue and print data
      Node<T> next = queue.remove();
      System.out.print(next.data + " ");

      //We add children nodes if not null
      if (next.left != null)
        queue.add(next.left);

      if (next.right != null)
        queue.add(next.right);
    }
  }
  //******************************************************
    /******  Main *****************************************
    ******************************************************** */
    /**
     * @param args
     */
    public static void main(String[] args) {

        //we can try our Algoritm
        //we build the same tree shown in the image
        //we crate nodes
        Node<String> A = new Node<String>("A");
        Node<String> B = new Node<String>("B");
        Node<String> C = new Node<String>("C");
        Node<String> D = new Node<String>("D");
        Node<String> E = new Node<String>("E");
        Node<String> F = new Node<String>("F");
        Node<String> G = new Node<String>("G");
        Node<String> H = new Node<String>("H");
        Node<String> I = new Node<String>("I");
        Node<String> J = new Node<String>("J");
        Node<String> K = new Node<String>("K");


        //We build Tree
        //Root en building of the tree
        Node<String> root = A;
        A.left = B; A.right = C;
        B.left = D; B.right = E;
        D.left = H; D.right = I;
        E.left = J;
        C.left = F; C.right = G;
        G.left = K;

        //Imprimimos el arbol en  Pre Orden con metodo recursivo
        System.out.println("PreOrder Traversal with Recursion:");
        preOrderTraverse(root);
        //Imprimimos el arbol en  Pre Orden con metodo Iterativo
        System.out.println("\n");
        System.out.println("Iterative Pre Order Traversal");
        iterativePreOrder(root);

        //Imprimimos el arbol en  Pre Orden con metodo recursivo
        System.out.println("\n");
        System.out.println("InOrder Traversal with Recursion:");
        inOrderTraverse(root);
        //Imprimimos el arbol con In Orden con metodo Iterativo
        System.out.println("\n");
        System.out.println("Iterative In Order Traversal");
        iterativeInOrderTraverse(root);


        //Imprimimos el arbol en  Post Orden con metodo recursivo
        System.out.println("\n");
        System.out.println("InOrder Traversal with Recursion:");
        postOrderTraverse(root);
        //Imprimimos el arbol en Post Orden con metodo Iterativo
        System.out.println("\n");
        System.out.println("Iterative Post Order Traversal");
        iterativePostOrder(root);

        //Imprimimos el arbol en niveles
        System.out.println("\n");
        System.out.println("Level Order Traversal");
        levelOrderTraverse(root);
    }
}
