import java.util.*;
 
public class Bj1806 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int s = sc.nextInt();
        
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int sum = 0;
        int start = 0;
        int end = 0;
        int answer = Integer.MAX_VALUE;
        
        while(true) {
        	if(sum > s) {
        		sum -= nums[start];
        		answer = Math.min(answer, (end - start));
        		start++;
        	}
        	else if(end == n) {
        		break;
        	}else {
        		sum += nums[end++];
        	}
        }
        if(answer == Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(answer);
        
    }
}    
