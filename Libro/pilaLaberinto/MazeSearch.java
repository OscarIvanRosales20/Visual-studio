//Ilustra una simulacion de la recursion utilizando una pila.
package pilaLaberinto;

public class MazeSearch {
    //Crea un nuevo laberinto, imprime su forma original, trata de resolverlo
    // E imprime su forma final.
    public static void main (String[] args){
        Maze Laberinto = new Maze();
        
        System.out.println(Laberinto);
        
        if (Laberinto.traverse())
            System.out.println("El laberinto fue completado exitosamente");
        else 
            System.out.println("No fue posible resolver el laberinto.");
        
        System.out.println(Laberinto);
    }//Metodo Main
}//Clase MazeSearch
