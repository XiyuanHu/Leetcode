package array;
/*Given two sorted integer arrays A and B, merge B into A as one sorted array.
  Note:
  You may assume that A has enough space to hold additional elements from B. 
  The number of elements initialized in A and B are m and n respectively.*/

public class MergeSortedArray {
	
	public void merge2(int[] A, int m, int[] B, int n){
		int last = m + n -1;
		int i = m -1;
		int j = n -1;
		while(i >= 0 && j >= 0){
			A[last--] = A[i] >= B[j] ? A[i--]: B[j--]; 
		}
		while(j >= 0){
			A[last--] = B[j--];
		}
		
	}
	
	/*
	 * void merge(int A[], int m, int B[], int n) {
        int last = m+n-1;
        int i = m -1;
        int j = n - 1;
        while(i >= 0 && j >=0){
            A[last--] = A[i] >= B[j]? A[i--]:B[j--];
        }
        while(j >= 0){
            A[last--] = B[j--];
        }
    }
	 * */
	
	public void merge(int A[], int m, int B[], int n) {
        int lastPos = m + n - 1;
        int i;
        int j;
        for(i = m-1, j = n-1; i >= 0&j >= 0;){
            if(A[i] > B[j]){
                A[lastPos] = A[i];
                lastPos--;
                i--;
            }else if(A[i] < B[j]){
                A[lastPos] = B[j];
                lastPos--;
                j--;
            }else{
                A[lastPos] = A[i];
                lastPos--;
                i--;
                A[lastPos] = B[j];
                lastPos--;
                j--;
            }
        }
        while(j >= 0){
            A[lastPos--] = B[j--];
            
        }
        
    }
}
