package dp;

public class IncreasingList {

	public static int maxIncreasingList(int[] A){
		if(A == null) return 0;
		int ret = 0;
		for(int i = 1; i < A.length; i++){
			int len = 0;
			for(int j = 0; j <= i; j++){
				if(A[j] < A[i]){
					len++;
				} 
			}
			ret = Math.max(ret, len);
		}
		return ret;
	}
	
	public static int maxIncreasingList2(int[] A){
		if(A == null) return 0;
		int[] ret = new int[A.length];
		for(int i = 0; i < ret.length; i++){
			ret[i] = 1;
		}
		for(int i = 1; i < A.length; i++){
			for(int j = 0; j <= i; j++){
				if(A[j] < A[i] && ret[i] < ret[j] + 1){
					ret[i] = ret[j] + 1;
				}
			}
		}
		return ret[ret.length-1];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {2,1,3,1,2,9};
		System.out.println(maxIncreasingList2(A));
	}

}
