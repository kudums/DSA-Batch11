package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CreateGraph {
    //create matrix of v^2
    static int a[][];
    static ArrayList<ArrayList<Integer>> adj;
    static int v=5;//no.of vertex
    static int e=10;//no.of edges

//    //for matrix
//     static void addEdge(int source, int destination)
//     {
//         //as it is bidrectional we make both as 1
//         // if it not a bidrectional, then check with interviewer about in which side
//         // direction is present based on  it mark 1
//         a[source][destination]=1;
//         a[destination][source]=1;
//     }

    //for arrayList, adjacencyList
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int source, int destination)
    {
        adj.get(source).add(destination);
        adj.get(destination).add(source);
    }

    public static void main(String[] args)
    {

        //create matrix of v^2
       // int a[][]=new int[v+1][v+1];

        //creating using arrayList<ArrayList<Integer>>
        adj=new ArrayList<>();
        for(int i=0; i <= v;i++)
        {
            adj.add(new ArrayList<>());// creating empty arraylist at each cell to hold connected vertex by edges
        }

        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

    }
}



