import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
 * ������ ������ �� �ִ� ��ġ�� �ٸ��� invalid
 * �������� ���� �ٸ��� invalid
 * �湮���� ���� ���� ������ invalid
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
		boolean check = true;  //�湮�� �� true�� üũ
		
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
			for(int i=0; i<8; i++) { //����Ʈ�� ������ �� �ִ��� Ȯ��
				if(moveX[i] == distance_X && moveY[i] == distance_Y) {
					isTrue = true;
					break;
				}
			}
			if(!isTrue) { //����Ʈ�� ������ �� ����
				check = false;
				System.out.println("Invalid");
				return;
			}
			if(visit[next_Y-'1'][next_X-'A']) { //�湮�� ��
				if(index!=35) { //�湮�� �� ����
					check = false;
					System.out.println("Invalid");
					return;
				}
			}
			index++;
		}
		if(check) {//�� �湮 ������
			System.out.println("Valid");
		}
		
	}

}
