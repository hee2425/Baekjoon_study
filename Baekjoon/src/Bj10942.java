//import java.util.*;
//public class Bj10942 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int[] arr = new int[N];
//		for(int i=0; i<N; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int M = sc.nextInt();
//		int[][] SE = new int[M][2];
//		for(int i=0; i<M; i++) {
//			SE[i][0] = sc.nextInt();
//			SE[i][1] = sc.nextInt();
//		}
//		
//		StringBuilder sb = new StringBuilder();
//		for(int i=0; i<M; i++) {
//			for(int start = SE[i][0]-1; start<SE[i][1]; start++) {
//				sb.append(arr[start]); 
//			}
//			String str = sb.toString();
//			if(str.equals(sb.reverse().toString())) {
//				System.out.println("1");
//			}else {
//				System.out.println("0");
//			}
//			sb.setLength(0);
//		}
//	}
//
//}


import java.io.*;
import java.util.*;

public class Bj10942 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] nums = new int[n+1];

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i=1; i<=n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(reader.readLine());

        StringBuilder sb = new StringBuilder();

        while (m-- > 0) {

            st = new StringTokenizer(reader.readLine());

            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            if(isPelin(nums,left,right)) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }

        }//while

        System.out.print(sb);


    }

    private static boolean isPelin(int[] nums, int left, int right) {

        while (left <= right) {
            if (nums[left] != nums[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}


