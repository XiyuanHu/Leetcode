package string;

import java.util.ArrayList;

public class GenerateParentheses {

	//DFS !!
	public ArrayList<String> generateParenthesis(int n) {
        if(n <= 0) return null;
        
        ArrayList<String> result = new ArrayList<String>();
        dfs(result,"",0,0,n);
        return result;    
    }
    public void dfs(ArrayList<String> result, String str, int left, int right, int n){
        if(right == n){
            result.add(str); 
            return;
        }
        if(left < n){
            dfs(result,str+"(",left+1,right,n);
        }
        if(right < left){
            dfs(result,str+")",left,right+1,n);
        }
    }
}
