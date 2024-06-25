package Pilas;

//import java.time.format.SignStyle;

class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10); //make new state
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        theStack.push(90);

        //Until it's empty, delate item from stack
        while(!theStack.isEmpty()){
            double value = theStack.pop();
            System.out.print(value + " " );
            System.out.print("");
        }//End While

        System.out.print("");
    }
}
