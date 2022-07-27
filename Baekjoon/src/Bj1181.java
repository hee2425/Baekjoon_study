import java.util.Scanner;


public class Bj1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] str = new String[n];
		
		for(int i=0; i<n; i++) {
			str[i] = sc.next();
		}
	
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				
				if(str[i].length() > str[j].length()) {  //���� ��
					String tmp = str[i];
					str[i] = str[j];
					str[j] = tmp;
				}
				if(str[i].length() == str[j].length()) {  //���� ������
					if(str[i].compareTo(str[j])>0) {  //���ĺ� ��
						String tmp = str[i];
						str[i] = str[j];
						str[j] = tmp;
					}
				}
			}
		}
		
		//�迭 �ߺ� ����
		System.out.println(str[0]);
		for(int i=1; i<n; i++) {
			if(!str[i].equals(str[i-1])) {  //���� �ʴ°͸� ���
				System.out.println(str[i]);
			}
		}
		
	}

}
