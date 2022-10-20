import java.util.*;
import java.io.*;
/*���ͽ�Ʈ�� Dijkstra_ �켱���� ť*/


//��ü��  ��
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
	static ArrayList<Node>[] List;  //���� ����Ʈ
	static int[] distance;   //�ִ� ��� �迭
	
	public static void main(String[] args) throws IOException{
		StringTokenizer st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		
		List = new ArrayList[V+1];
		distance = new int[V+1];
		
		Arrays.fill(distance, INF);
		
		for(int i=1; i<=V; i++) {
			List[i] = new ArrayList<>();  //2���� ����Ʈ 
		}
		
		for(int i=0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			
			List[start].add(new Node(end, weight)); //�� ������ ����ġ ���ؼ� List�� �߰�
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		dijkstra(K);  //���ͽ�Ʈ�� �˰��� , ��������  ���� 
		
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
		q.add(new Node(start, 0));  //start���� start���°��� 0
		distance[start] = 0;  //start �ִ� �Ÿ� 0
		boolean[] check = new boolean[V+1];
		
		while(!q.isEmpty()) {
			Node Cur_node = q.poll();  //�� �� ��ȯ �� ����
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
