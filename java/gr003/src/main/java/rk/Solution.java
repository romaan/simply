package rk;

/* Consider an undirected graph consisting of  nodes where each node is labeled from  to  and the edge between any two nodes is always of length . We define node  to be the starting position for a BFS.

        Given  queries in the form of a graph and some starting node,  , perform each query by calculating the shortest distance from starting node  to all the other nodes in the graph. Then print a single line of space-separated integers listing node 's shortest distance to each of the  other nodes (ordered sequentially by node number); if  is disconnected from a node, print  as the distance to that node.

        Input Format

        The first line contains an integer, , denoting the number of queries. The subsequent lines describe each query in the following format:

        The first line contains two space-separated integers describing the respective values of  (the number of nodes) and  (the number of edges) in the graph.
        Each line  of the  subsequent lines contains two space-separated integers,  and , describing an edge connecting node  to node .
        The last line contains a single integer, , denoting the index of the starting node.
        Constraints

        Output Format

        For each of the  queries, print a single line of  space-separated integers denoting the shortest distances to each of the  other nodes from starting position . These distances should be listed sequentially by node number (i.e., ), but should not include node . If some node is unreachable from , print  as the distance to that node.

        Sample Input

        2
        4 2
        1 2
        1 3
        1
        3 1
        2 3
        2
        Sample Output

        6 6 -1
        -1 6
        */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import static java.lang.Math.*;
import java.util.regex.*;

public class Solution {

    private int [][] graph;
    private int start;
    private int []distances;
    private boolean []visited;
    private Queue<Integer> q;

    public Solution(int [][]graph, int start) {
        this.graph = graph;
        this.start = start;
        this.distances = new int[graph.length];
        this.visited = new boolean[graph.length];
        q = new LinkedList<Integer>();
        q.add(start);
        this.bfs(start);
    }

    public void bfs(int s) {
        while (!q.isEmpty()) {
            int v = q.remove();
            if (visited[v] == false) {
                visited[v] = true;
                for (int i = 0; i < visited.length; i++) {
                    if (visited[i] == false && graph[v][i] == 1) {
                        q.add(i);
                        if ((distances[v] + 6 < distances[i] && distances[i] != 0) || distances[i] == 0) {
                            distances[i] = distances[v] + 6;
                        }
                    }
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < distances.length; i++) {
            if (i != start) {
                distances[i] = distances[i] == 0 ? -1: distances[i];
                System.out.print(distances[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.nextLine());
        ArrayList<Solution> s = new ArrayList<Solution>();
        for (int j = 0; j < q; j++) {
            String t = sc.nextLine();
            StringTokenizer st = new StringTokenizer(t);
            int n = Integer.parseInt(st.nextToken()); // Number of nodes
            int m = Integer.parseInt(st.nextToken()); // Number of edges
            int [][]graph = new int[n][n];
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(sc.nextLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph[a - 1][b - 1] = 1;
                graph[b - 1][a - 1] = 1;
            }
            int start = Integer.parseInt(new StringTokenizer(sc.nextLine()).nextToken()) - 1;
            s.add(new Solution(graph, start));
        }
        for (Solution ss: s) {
            ss.print();
        }
    }
}