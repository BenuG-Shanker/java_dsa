import java.util.*;
public class Main{
	public static class Edge{
		int source;
		int destination;
		int weight;
		public Edge(int source, int destination, int weight){
			this.source = source;
			this.destination = destination;
			this.weight = weight;
		}
	}
	public static void createGraphAdjacency(ArrayList<Edge>[] graph){
		for(int i=0; i<graph.length; i++){
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0, 1, 1));
		graph[0].add(new Edge(0, 2, 1));
		graph[1].add(new Edge(1, 0, 1));
		graph[1].add(new Edge(1, 3, 1));
		graph[2].add(new Edge(2, 0, 1));
		graph[2].add(new Edge(2, 4, 1));
		graph[3].add(new Edge(3, 1, 1));
		graph[3].add(new Edge(3, 4, 1));
		graph[3].add(new Edge(3, 5, 1));
		graph[4].add(new Edge(4, 2, 1));
		graph[4].add(new Edge(4, 3, 1));
		graph[4].add(new Edge(4, 5, 1));
		graph[5].add(new Edge(5, 3, 1));
		graph[5].add(new Edge(5, 4, 1));
		graph[5].add(new Edge(5, 6, 1));
		graph[6].add(new Edge(6, 5, 1));
	}
	public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited){
		if(src == dest){
			return true;
		}
		visited[src] = true;
		for(int i=0; i<graph[src].size(); i++){
			Edge e = graph[src].get(i);
			if(!visited[e.destination] && hasPath(graph, e.destination, dest, visited)){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args){
		int vertex = 7;
		ArrayList<Edge>[] graph = new ArrayList[vertex];
		createGraphAdjacency(graph);
		System.out.println(hasPath(graph, 0, 6, new boolean[vertex]));
	}
}