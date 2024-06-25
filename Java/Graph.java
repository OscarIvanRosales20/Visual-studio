//import javafx.scene.SubScene;

public class Graph {
    private static int infinito = 999999;
    int[][] linkCost;
    int nNodes;

    Graph(int[][] mat){
        int i, j;
        nNodes = mat.length;
        linkCost = new int[nNodes][nNodes];
        for ( i = 0; i < nNodes; i++) {
            for ( j = 0; j < nNodes; j++) {
                linkCost[i][j] = mat[i][j];
                if(linkCost[i][j] == 0)
                    linkCost[i][j] = infinito;
            }
        }

        for ( i = 0; i < nNodes; i++) {
            for ( j = 0; j < nNodes; j++) 
                if(linkCost[i][j] < infinito)
                    System.out.print(" " + linkCost[i][j] + " ");
                else
                    System.out.print(" * ");

            System.out.println();
        }
    }



    public int unReached(boolean[] r){
        //boolean done =true;
        for (int i = 0; i < r.length; i++)
            if(r[i] == false)
                return i;
        return-1;
    }
    
    public void Prim(){
        int i,j,k,x,y;
        boolean[] Reached = new boolean[nNodes];
        int[] preNode = new int[nNodes];
        Reached[0] = true;
        for ( k = 0; k < nNodes; k++) {
            Reached[k] = false;
        }
        preNode[0] = 0;
        printReachSet(Reached);
        for ( k = 1; k < nNodes; k++) {
            x = y =0;
            for ( i = 0; i < nNodes; i++)
                for ( j = 0; j < nNodes; j++) {
                    if(Reached[i] && !Reached[j] && linkCost[i][j] <linkCost[x][y]){
                        x = i;
                        y = j;
                    }
                    
                }
            System.out.println("Min cost edge: (" + x + "," +y+")"+ "cost = " +linkCost[x][y]);

            preNode[y] = x;
            Reached[y] = true;
            printReachSet(Reached);
            System.out.println();
        }
        int[] a = preNode;
        for ( i = 0; i < nNodes; i++)
            System.out.println(a[i] + " ---> " + i);
    }

    void printReachSet(boolean[] Reached){
        System.out.print("ReachSet = ");
        for (int i = 0; i < Reached.length; i++)
            if(Reached[i])
                System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int[][] conn = {
            {0,3,0,2,0,0,0,0,4}, // 0
            {3,0,0,0,0,0,0,4,0}, // 1
            {0,0,0,6,0,1,0,2,0}, // 2
            {2,0,6,0,1,0,0,0,0}, // 3
            {0,0,0,1,0,0,0,0,8}, // 4
            {0,0,1,0,0,0,8,0,0}, // 5
            {0,0,0,0,0,8,0,0,0}, // 6
            {0,4,2,0,0,0,0,0,0}, // 7
            {4,0,0,0,8,0,0,0,0}, // 8
        };

        Graph g = new Graph(conn);
        g.Prim();
    }
}
