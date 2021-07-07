import java.util.Arrays;

public class MST {

    public static void main(String[] args){

        int[][] graph={
                {0,3,0,0,8},
                {3,0,4,2,0},
                {0,4,0,10,0},
                {0,2,10,0,11},
                {8,0,0,11,0}
        };

        getMST(graph, graph.length);
    }

    private static void getMST(int[][] graph, int V) {

        boolean[] select=new boolean[V];
        int edge=0;
        Arrays.fill(select, false);
        select[0]=true;
        while(edge<V-1){
            int min=Integer.MAX_VALUE;
            int x=0, y=0;
            for(int u=0;u<V;u++){
                if(select[u]){
                    for(int v=0;v<V;v++){
                        if(!select[v] && graph[u][v]!=0){
                            if(graph[u][v]<min){
                                min=graph[u][v];
                                x=u;
                                y=v;
                            }
                        }
                    }
                }
            }

            System.out.print(x+"-"+y+":"+graph[x][y]+"\n");
            select[y]=true;
            edge++;



        }


    }

}
