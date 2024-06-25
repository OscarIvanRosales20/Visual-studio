package Colecciones;
//Ilustra  el uso de una coleccion de tipo conjuto.

import Colecciones.ArraySet.EmptySetException;

public class Bingo {
    /*crea las 75 bolas de bingo y las almacena en un conjunto. A continuacion,
    extrae aleatoriamente varias bolas del conjunto y muestra un mensaje inficando cuales son
    */

    public static void main(String[] args) throws EmptySetException {
        
        final int NUM_BALLS = 75, NUM_PULLS = 10;
        
        //Utiliza un Lista para ejecutar
        //Linkedset<BingoBall> bingoSet = new Linkedset<>();
        
        //Utiliza un conjunto para ejecutar
        ArraySet<BingoBall> bingoSet = new ArraySet<>();
        
        //Utiliza un Lista ordenarla para ejecutar
        //ArrayOrderList<BingoBall> bingoSet = new ArrayOrderList<BingoBall>();
        BingoBall ball = null;
        
        for(int num = 1; num <= NUM_BALLS; num++){
            ball = new BingoBall (num);
            bingoSet.add (ball);
        }
        
        System.out.println("size: " + bingoSet.size());
        System.out.println();
        
        for (int num = 1; num <= NUM_PULLS; num++){
            

                ball = bingoSet.removeRandom();
            System.out.println(ball);
        }
    }
}
