package Ordenar;
class OrdArray {
    private double[] a;
    private int nElems;

    //consturctor
    public OrdArray(int max){
        a = new double[max];
        nElems = 0;
    }

    public int size(){
        return nElems;
    }

    public int find(double searchKey){
        int lowerBound =0;
        int upperBound = nElems-1;
        int curIn;

        while(true){
            curIn = (lowerBound + upperBound) /2;
            if(a[curIn] == searchKey)
                return curIn; //found it
            if(lowerBound > upperBound)
                return nElems; // Can´t find it

            else {
                if(a[curIn] < searchKey)
                    lowerBound = curIn + 1; //It's in upper half
                else
                    upperBound = curIn -1; //It's in lower half
            }
        }
    }//end Find

    public void insert(double value){
        int j;
        for(j=0; j<nElems; j++)
            if(a[j] > value)
                break;
            
        for(int k =nElems; k>j; k--) //move higher ones up
            a[k] = a[k-1]; 
        a[j]= value;//Insert it
        nElems++; //increment size
    }

    public boolean delate(double value){
        int j = find(value);
        if(j == nElems)
            return false;

        else{
            for(int k = j; k< nElems; k++) //Move hifher ones down
                a[k] = a[k+1];
            nElems--;  //Decrement size
            return true;
        }
    }

    public void display(){
        for(int j=0; j <nElems; j++)    //forEach elements
            System.out.print(a[j] + " "); // display it
        System.out.println("");
    }
}
