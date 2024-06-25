package Pilas;

//import java.util.Stack;

class StackX {
    private int maxSize;
    private double[] stackArray;
    private int top;

    //constructor
    public StackX(int s){
        maxSize = s;
        stackArray = new double[maxSize];
        top = -1;
    }

    //Put item on top of state
    public void push(double j){
        stackArray[++top] = j;//increment top, insert item
    }

    //take item from top of
    public double pop(){
        return stackArray[top--];//Acces item, decrement top
    }

    //Peek at top of stack
    public double peek(){
        return stackArray[top];
    }

    //True if stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }

    //true if stack is full
    public boolean isFull(){
        return (top == maxSize-1);
    }
}