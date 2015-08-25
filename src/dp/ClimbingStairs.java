package dp;

public class ClimbingStairs {

	//f(1) = 1, f(2) = 2
	//f(n) = f(n-1) + f(n-2)
	 public int climbStairs(int n) {
	        if(n < 0) return 0;
	        if(n == 1) return 1;
	        int p = 1, q = 2;
	        for(int i = 3; i <= n; i++){
	            int temp = p;
	            p = q;
	            q = temp + q;
	        }
	        return q; 
	    }
}
