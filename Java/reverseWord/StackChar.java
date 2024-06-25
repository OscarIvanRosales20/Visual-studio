package reverseWord;

class StackChar {
    private int maxSize;
    private char[] stackArray;
    private int top;

    //constructor
    public StackChar(int max){
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    //Put item on top of state
    public void push(char j){
        stackArray[++top] = j;//increment top, insert item
    }

    //take item from top of
    public char pop(){
        return stackArray[top--];//Acces item, decrement top
    }

    //Peek at top of stack
    public char peek(){
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