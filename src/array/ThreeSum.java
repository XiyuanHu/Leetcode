package array;

import java.util.Arrays;
import java.util.ArrayList;

public class ThreeSum {

public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        for(int i =0; i < num.length; i++){
            if(i == 0 || num[i] != num[i-1]){
                int j = i+1, k = num.length-1;
                while(j < k){
                	if(num[i] + num[j] + num[k] > 0){
                		k--;
                	}else if(num[i] + num[j] + num[k] < 0){
                		j++;
               		}else if(num[i] +num[j] + num[k] == 0){
               			ArrayList<Integer> res = new ArrayList<Integer>();
               			res.add(num[i]);
               			res.add(num[j]);
               			res.add(num[k]);
               			result.add(res);
               			j++;
               			k--;
               			while(j < k && num[k] == num[k+1]){
               				k--;
               			}
               			while(j < k && num[j] == num[j-1]){
               				j++;
               			}
               		}
               	}    
            }   
        }
        return result;
    }
}
