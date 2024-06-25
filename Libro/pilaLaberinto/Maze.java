//Representa un laberinto de caracteres. El objetivo consiste en ir desde la 
// la esquina inferior derecha, siguiendo una ruta formada por unos.
package pilaLaberinto;

public class Maze {
    private final int TRIED = 3;
    //private final int PATH = 7;
    
    private final int [] [] grid = {{1,1,1,0,1,1,0,0,0,1,1,1,1},
                                    {1,0,0,1,1,0,1,1,1,1,0,0,1},
                                    {1,1,1,1,1,0,1,0,1,0,1,0,0},
                                    {0,0,0,0,1,1,1,0,1,0,1,1,1},
                                    {1,1,1,0,1,1,1,0,1,0,1,1,1},
                                    {1,0,1,0,0,0,0,1,1,1,0,0,1},
                                    {1,0,1,1,1,1,1,1,0,1,1,1,1},
                                    {0,0,0,0,0,0,0,0,0,0,0,0,0},
                                    {1,1,1,1,1,1,1,1,1,1,1,1,1} };

    // Pila
    private ArrayStack<Position> push_new_pos(int x, int y, ArrayStack<Position>stack) {
        Position npos = new Position();
        npos.setx(x);
        npos.sety(y);
        if(valid(npos.getx(), npos.gety()))
            stack.push(npos);
        

        
        return stack;
    } 

    /*Trata de recorrer iterativamente el laberinto. Inserta caracteres especiales
    que indican las ubicaciones que han sido probadas y que pueden llegar a formar
    parte de la solucion final. Este metodo utiliza una pila para llevar el control
    de los posibles movimientos que podrian hacerse*/
    public boolean traverse(){
        
        boolean done = false;
        Position pos = new Position();
        //Object dispose;
        ArrayStack<Position> stack = new ArrayStack<>();
        stack.push(pos);
        
        while (!(done)){
           pos = stack.pop();
           grid[pos.getx()][pos.gety()] = TRIED; //Esta celda ya ha sido probada
           
           if(pos.getx() == grid.length-1 && pos.gety() == grid[0].length-1)
               done = true; //Hemos resuelto el laberinto
           else {
               stack = push_new_pos(pos.getx(), pos.gety() -1, stack);
               stack = push_new_pos(pos.getx(), pos.gety() +1, stack);
               stack = push_new_pos(pos.getx() -1, pos.gety(), stack);
               stack = push_new_pos(pos.getx() +1, pos.gety(), stack);
               
           }//else
        }//while
        return done;
    }// Metodo traverse
    
    //Determina si una ubicacion especifica es valida.
    private boolean valid(int row, int column){
        
        boolean result = false;
        
        //Comprueba si la celda se encuentra dentro de los limites de la matrix
        if (row >= 0 && row < grid.length && 
            column >= 0  && column < grid[row].length)
            
            //Comprueba si la celda no esta bloqueda y no ha sido probada anteriormente
            if (grid[row][column] == 1)
                result = true;
        
        return result;
    }//Metodo valid
    
    //Devuleve el laberinto en forma de cadena de caracteres.
    @Override
    public String toString() {
        String result = "\n";
        
        for (int row=0; row <grid.length; row++) {
            for (int column = 0; column < grid[row].length; column ++) {
                result += grid[row][column] + "";
            }
            result += "\n";
        } // Fin for
        return result;
    }//Metodo toString
}//Clase Maze
