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
	public static void main(String[] args){
		int vertex = 5;
		ArrayList<Edge>[] graph = new ArrayList[vertex];
		for(int i=0; i<vertex; i++){
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0, 1, 5));
		graph[1].add(new Edge(1, 0, 5));
		graph[1].add(new Edge(1, 2, 1));
		graph[1].add(new Edge(1, 3, 3));
		graph[2].add(new Edge(2, 1, 1));
		graph[2].add(new Edge(2, 3, 1));
		graph[2].add(new Edge(2, 4, 4));
		graph[3].add(new Edge(3, 1, 3));
		graph[3].add(new Edge(3, 2, 1));
		graph[4].add(new Edge(4, 2, 2));
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].size(); j++){
				Edge e = graph[i].get(j);
				System.out.println("Edge From " + e.source + " to " + e.destination + " with weight " + e.weight);
			}
		}
	}
}