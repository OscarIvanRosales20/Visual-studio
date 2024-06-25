class LinearSearch {
    public static int search(int arr[], int x){
        int N = arr.length;
        for (int i = 0; i<N; i++){
            if(arr[i] == x)
            return i;
        }
        return -1;
    }

    //Driver code
    public static void main(String[] args) {
        int arr[] = {2,3,4,10,49};
        int x = 10;
        //Function call
        int result = search(arr, x);

        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "
                             + result);
    }
}