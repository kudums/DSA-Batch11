package Graph;


//
//    0-------1
//    \       /
//      \    /
//        \2/
//         |
//         |
//         3

import java.util.*;

//public static void main(String args[])
//        {
//        Graph g = new Graph(4);
//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(1, 2);
//        g.addEdge(2, 0);
//        g.addEdge(2, 3);
//        g.addEdge(3, 2);
// directed graph using adjacency list representation
class Graph {

    // No. of vertices
    private int V;
    // Adjacency Lists
    private LinkedList<Integer> adj[];
    // Constructor
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    // Function to add an edge into the graph
    void addEdge(int v, int d) { adj[v].add(d); }

//    Time complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.
//    Auxiliary Space: O(V+V), visited array,Queue of size V is required
    // prints BFS traversal from a given source 's'
    void BFS(int s)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];
        // Create a queue for BFS
        LinkedList<Integer> queue
                = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s + " ");
            // Get all adjacent vertices of the dequeued
            // vertex s If a adjacent has not been visited,
            // then mark it visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }


    //Time Complexity: O(V+E), where V is the number of nodes and E is the number of edges.
    //Auxiliary Space: O(V), visited array and call stack in is used in-memory
    // A function used by DFS
    void DFSTraversal(int v, boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSTraversal(n, visited);
        }
    }
    // The function to do DFS traversal.
    // It uses recursive DFSTraversal()
    void DFS(int v)
    {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];
        // Call the recursive helper
        // function to print DFS
        // traversal
        DFSTraversal(v, visited);
    }


    public static void main(String args[])
    {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 2);

        System.out.println(
                "Following is Breadth First Traversal "
                        + "(starting from vertex 0)");

        g.BFS(0);
        System.out.println("   ");
        System.out.println("   ");
        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 0)");

        g.DFS(0);
    }
}