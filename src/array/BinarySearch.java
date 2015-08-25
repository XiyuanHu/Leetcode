package array;

public class BinarySearch {
	
	public static int search(int[] A, int start, int end, int target){
		
		if(start > end) return -1;
		int mid = (start + end)/2;
		if(mid == target) return mid;
		if(target < A[mid]){
			return search(A,start,mid-1,target);
		}else{
			return search(A,mid+1,end,target);
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
