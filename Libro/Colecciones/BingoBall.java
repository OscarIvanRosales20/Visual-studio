package Colecciones;

// Representa una bola utilizada en un juego de bingo.

public class BingoBall {
    private final char letter;
    private final int number;
    
    //Asigna a esta bola de bingo el numero especificado y la letra apropiada.
    public BingoBall (int num){
        number = num;
        
        if (num <= 15)
            letter = 'B';
        
        else if (num <= 30)
                letter = 'I';
        
        else if (num <= 45)
            letter = 'N';
        
        else if (num <= 60)
            letter = 'G';
        
        else
            letter = 'O';
    }
    
    //Devuelve una representacion de esta bola de bingo en forma de cadena de caracteres.
    @Override
    public String toString(){
        return (letter + " " + number);
    }
}
