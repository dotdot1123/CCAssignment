package ch4;

import java.util.ArrayList;

public class solution01{

    class DGraph {
	private int V;     // vertices
	private ArrayList<Integer>[] adj;  // adjacent
	private boolean[] marked;        // marked the visited node
	
	@SuppressWarnings("unchecked")
	
	public DGraph(int V) {
		this.V = V;
		adj = (ArrayList<Integer>[]) new ArrayList[V];
		for (int v = 0; v < V; v++)
			this.adj[v] = new ArrayList<Integer>();
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	public Iterable<Integer> adj(int v) {
		return this.adj[v];
	}
	
	public int V() {
		return V;
	}
	
	public boolean hasPath(int v, int w) {
		marked = new boolean[V];
		dfs(v);
		if (marked[w]) return true;
		else return false;
	}
	
	private void dfs(int v) {  //depth search
		marked[v] = true;
		for (int w : adj[v]) {
			if (!marked[w]) dfs(w);
		}
	}

}
    
	public static void main(String[] args) {
		solution01 t = new solution01();
		DGraph G = t.new DGraph(6);   // build a graph
		/*		0: 3 5
		 * 		1: 4
		 *		2: 3 4
		 *		3: 1 4
		 *		4: 3 5
		 *		5: 4
		 */
		G.addEdge(0, 3);G.addEdge(0, 5);
		G.addEdge(1, 4);
		G.addEdge(2, 3);G.addEdge(2, 4);
		G.addEdge(3, 1);G.addEdge(3, 4);
		G.addEdge(4, 3);G.addEdge(4, 5);
		G.addEdge(5, 4);
		
		if (G.hasPath(1, 4))       //test node 1 and node 4
			System.out.println("Yes");
		else System.out.println("No");
		
		if (G.hasPath(0, 4))           //test node 0 and node 4
			System.out.println("Yes");
		else System.out.println("No");

	}
	
}


