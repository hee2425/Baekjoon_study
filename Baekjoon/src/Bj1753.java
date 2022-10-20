import java.util.*;
import java.io.*;
/*다익스트라 Dijkstra_ 우선순위 큐*/


//객체간  비교
class Node implements Comparable<Node>{
	int end;
	int weight;
	
	public Node(int end, int weight) {
		this.end = end;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Node o) {
		return weight-o.weight;
	}
	
}
public class Bj1753 {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	private static final int INF = Integer.MAX_VALUE; //Integer.MAX_VALUE
	static int V,E,K;
	static ArrayList<Node>[] List;  //인접 리스트
	static int[] distance;   //최단 경로 배열
	
	public static void main(String[] args) throws IOException{
		StringTokenizer st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		
		List = new ArrayList[V+1];
		distance = new int[V+1];
		
		Arrays.fill(distance, INF);
		
		for(int i=1; i<=V; i++) {
			List[i] = new ArrayList<>();  //2차원 리스트 
		}
		
		for(int i=0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			
			List[start].add(new Node(end, weight)); //끝 정점과 가중치 비교해서 List에 추가
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		dijkstra(K);  //다익스트라 알고리즘 , 시작정점  기준 
		
		for(int i=1; i<=V; i++) {
			if(distance[i] == INF) sb.append("INF\n");
			else sb.append(distance[i]+"\n");
		}
		
		bw.write(sb.toString());
		bw.close();
		br.close();
	}

	public static void dijkstra(int start) {
		PriorityQueue<Node> q = new PriorityQueue<>();
		q.add(new Node(start, 0));  //start에서 start가는것은 0
		distance[start] = 0;  //start 최단 거리 0
		boolean[] check = new boolean[V+1];
		
		while(!q.isEmpty()) {
			Node Cur_node = q.poll();  //맨 앞 반환 후 삭제
			int current = Cur_node.end;
			
			if(check[current] == true) continue;
			check[current] = true;
			
			for(Node node : List[current]) {
				if(distance[node.end] > distance[current] + node.weight) {
					distance[node.end] = distance[current] + node.weight;
					q.add(new Node(node.end, distance[node.end]));
					//Node(end, weight)
				}
			}
		}
	}
}
