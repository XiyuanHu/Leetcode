package array;

import java.util.ArrayList;

public class PascalTriangle {
	public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(numRows == 0) return result;
        ArrayList<Integer> firstrow = new ArrayList<Integer>();
        firstrow.add(1);
        result.add(firstrow);
        for(int i = 1; i < numRows; i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            ArrayList<Integer> lastrow = result.get(result.size()-1);
            for(int j = 0; j < lastrow.size(); j++){
                int val = lastrow.get(j);
                if(j > 0){
                    val += lastrow.get(j-1);
                }
                row.add(val);
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
	
	public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<Integer>();  
        if (rowIndex < 0)  
            return result;  
        for (int i=0; i<=rowIndex; i++) {  
            result.add(1);  
            for (int j=result.size()-2; j>0; j--) {  
                int value = result.get(j);  
                if (j > 0)  
                    value += result.get(j-1);  
                result.set(j, value);  
            }  
        }  
        return result;   
    }

}
