package reverseWord;

class reverser {
    private String input;
    private String output;

    public reverser(String in){
        this.input = in;
    }

    //Reverse the String
    public String doRev(){
        int stackSize = input.length(); //Get maxState
        StackChar theStack = new StackChar(stackSize); //make stack

        for (int j=0; j<input.length(); j++){
            char ch = input.charAt(j); //get a char from
            theStack.push(ch); //Push it
        }

        output = "";
        while(!theStack.isEmpty()){
            char ch = theStack.pop(); //pop a char
            output = output + ch;
        }
        return output;
    }
}
