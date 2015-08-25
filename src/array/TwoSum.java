package array;

import java.util.Arrays;

/*Given an array of integers, find two numbers such that they add up to a specific target number.
  The function twoSum should return indices of the two numbers such that they add up to the target, 
  where index1 must be less than index2. 
  Please note that your returned answers (both index1 and index2) are not zero-based.
  You may assume that each input would have exactly one solution.
  
  Input: numbers={2, 7, 11, 15}, target=9
  Output: index1=1, index2=2*/

public class TwoSum {
	
	
	public int[] twoSum(int[] numbers, int target) {
        int[] num = numbers.clone();
        Arrays.sort(numbers);

        int i = 0, j = numbers.length-1;
        while(i<j){
            if(numbers[i] + numbers[j] > target){
                j--;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }else{
                break;
            }
        }
        int[] result = {-1,-1};
        for(int k = 0; k < num.length; k++){
            if(numbers[i] == num[k] && result[0] == -1){
                result[0] = k+1;
            }else if(numbers[j] == num[k] && result[1] == -1){
                result[1] = k+1;
            }
        }
        Arrays.sort(result);
        return result;
    }
//	public int[] twoSum(int[] numbers, int target) {
//        int results[] = new int[2];
//        for(int i = 0; i < numbers.length; i++){
//            for(int j = i+1; j < numbers.length; j++){
//                if(numbers[i] < target){
//                    if(numbers[i] + numbers[j] == target){
//                        results[0] = i + 1;
//                        results[1] = j + 1;
//                        break;
//                    }
//                }
//            }
//        }
//        return results;
//    }
	

}
