package string;

public class LengthOfLastWord {
	 public int lengthOfLastWord(String s) {
	        if(s == "" || s == " ") return 0;
	        boolean isFirst = false;
	        int count = 0;
	        for(int i = s.length()-1; i >= 0; i--){
	            char c = s.charAt(i);
	            if(c == ' '){
	                if(isFirst != false){
	                    break;
	                }
	            }else{
	                if(isFirst == false){
	                    isFirst = true;
	                    count++;
	                }else{
	                    count++;
	                }
	            }
	        } 
	        return count;
	    }

}
