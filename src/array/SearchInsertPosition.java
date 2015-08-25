package array;

public class SearchInsertPosition {
	

	public int searchInsert(int[] A, int target) {
        if(target < A[0] || A.length == 0) return 0;
        if(target > A[A.length-1]) return A.length;
        
        for(int i = 0; i < A.length-1; i++){
            if(target == A[i]){
                return i;
            }else if(target > A[i] && target < A[i+1]){
                return i+1;
            }
        }
        return A.length-1;
    }
}
