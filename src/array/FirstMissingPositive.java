package array;


public class FirstMissingPositive {
	
	public static int firstMissingPositive(int[] A) {
        for(int i = 0; i < A.length; i++){
            while(A[i] != i+1){
                if(A[i] <= 0 ||A[i] >A.length|| A[i] == A[A[i]-1]){
                    break;
                }
                    int data = A[i];
                	A[i] = A[A[i]-1];
                	A[data-1] = data;   
            }
        }
        for(int i = 0; i < A.length; i++){
            if(A[i] != i+1 || A[i] <=0){
                return i+1;
            }
        }
        return A.length+1;
    }
   
	public static void main(String[] args) {
		int[] array = {-1,3,-1,1};
		System.out.println(firstMissingPositive(array));

	}

}
