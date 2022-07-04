import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
 * 이전에 움직일 수 있는 위치가 다르면 invalid
 * 시작점과 끝점 다르면 invalid
 * 방문하지 않은 곳이 있으면 invalid
 * */

public class Bj1331 {
	static int moveX[] = {1,2,2,1,-1,-2,-2,-1};
	static int moveY[] = {2,1,-1,-2,-2,-1,1,2};
	static boolean visit[][];

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[37];
		for(int i=0; i<36; i++) {
			str[i] = br.readLine();
		}
		str[36] = str[0];
		int index = 0;
		
		visit = new boolean[6][6];
		boolean check = true;  //방문한 곳 true로 체크
		
		while(index<36) {
			String cur = str[index];
			String next = str[index+1];
			
			char cur_X = cur.charAt(0);  //A~F
			char cur_Y = cur.charAt(1);  //1~6
			
			visit[cur_Y-'1'][cur_X-'A'] = true;
			
			char next_X = next.charAt(0);
			char next_Y = next.charAt(1);
			
			int distance_X = Math.abs(cur_X - next_X);
			int distance_Y = Math.abs(cur_Y - next_Y);
			
			boolean isTrue = false;
			for(int i=0; i<8; i++) { //나이트로 움직일 수 있는지 확인
				if(moveX[i] == distance_X && moveY[i] == distance_Y) {
					isTrue = true;
					break;
				}
			}
			if(!isTrue) { //나이트로 움직일 수 없음
				check = false;
				System.out.println("Invalid");
				return;
			}
			if(visit[next_Y-'1'][next_X-'A']) { //방문한 곳
				if(index!=35) { //방문한 곳 누락
					check = false;
					System.out.println("Invalid");
					return;
				}
			}
			index++;
		}
		if(check) {//다 방문 했으면
			System.out.println("Valid");
		}
		
	}

}
