package reverseWord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while(true){
            System.out.print("Enter a String: ");
            System.out.flush();
            input = getString();//Read a string from kbd

            if(input.equals(""))// quit if [Enter]
                break;

            reverser theReverser = new reverser(input);
            output = theReverser.doRev(); //Use it
            System.out.println("Reversed: " + output);
        }
    }

    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
}
