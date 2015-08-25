package string;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length == 0 || strs == null) return prefix;
        for(int i = 0; i < strs[0].length(); i++){
            char pre = strs[0].charAt(i);
            int count = 0;
            int j = 1;
            while( j < strs.length && i < strs[j].length()){
                if(strs[j].charAt(i) != pre){
                    return prefix;
                }else{
                    j++;
                    count++;
                }
            }
            if(count == strs.length-1) {
                prefix = prefix + pre;
            }
        } 
        return prefix; 
    }
}
