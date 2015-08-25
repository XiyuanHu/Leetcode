package array;

public class RemoveElement {
	
	public int removeElement(int[] A, int elem) {
        if(A.length == 0) return 0;
        
        int length = A.length;
        for(int i = 0; i < length;){
            if(A[i] == elem){
                A[i] = A[--length];
            }else{
                i++;
            }
        }
        return length;   
    }
	
	public int removeElement2(int[] A, int elem){
		int length = A.length;
		int count = 0;
		for(int i = 0, end = length - 1; i<= end;){
			if(A[i] == elem){
				if(A[end] == elem){
					end--;
				}else{
					A[i] = A[end];
					i++;
					end--;
				}
				count++;
			}else{
				i++;
			}
		}
		return length - count;
	}
	
	//remove duplicates from sorted array 
	public int removeDuplicates(int[] A) {
        if(A.length == 0 || A.length == 1) 
            return A.length;
            
        int i = 1, j = 0;
        while(i < A.length){
            if(A[i] == A[j]){
           
                i++;
            }else{
                A[++j] = A[i];
                i++;
            }
        }
        return j+1;
    }
	//remove duplicates from sorted array 2
	public int removeDuplicates2(int[] A) {
        if(A.length < 3) return A.length;
        int i = 1, cur = 1;
        for(int j = 1; j < A.length; j++){
            if(A[j] == A[j-1]){
                cur++;
            }else{
                cur = 1;
            }
            if(cur <= 2){
                A[i++] = A[j];
            }
        }
        return i;
    }

}
