package string;

public class Atoi {
	public static int atoi(String str) {
        if(str.length() == 0) return 0; 
        long result = 1;
        char curr, prev = str.charAt(0);
        int res,sign = 1;
        for(int i = 1; i < str.length(); i++){
            curr = str.charAt(i);
            if(prev == '+' || prev == '-'){
                if(curr >= '0' && curr <= '9'){
                    result = curr - '0';
                    if( prev == '-'){
                        sign = -1;
                    } 
                    prev = curr;
                }else  return 0;
            }else if(prev == ' '){
                if(curr == ' '){
                    continue;
                }else if(curr == '+' || curr == '-'){
                    prev = curr;
                    continue;
                }else if(curr >= '0' && curr <= '9'){
                    result = curr - '0';
                    prev = curr;
                }else return 0;
            }else if((prev >= 'a' && prev <= 'z') || (prev >= 'A' && prev <= 'Z')){
            	return 0;
            }else if(prev >= '0' && prev <= '9'){
                if(i == 1){
                    result = prev - '0';
                }
            	if(curr >= '0' && curr <= '9'){
                	int cur = curr - '0';
                    if((result * 10 + cur) < Integer.MIN_VALUE){
                    	if(sign == -1){
                    		return Integer.MIN_VALUE;
                    	}else{
                    		return Integer.MAX_VALUE;
                    	}
                    }else if((result *10 + cur) > Integer.MAX_VALUE){
                    	if(sign == -1){
                    		return Integer.MIN_VALUE;
                    	}else{
                    		return Integer.MAX_VALUE;
                    	}
                    }else{
                        result = result * 10 + cur;
                        prev = curr;
                    }
                }else{
                	res = (int)result;
            	    return res * sign;
                }
            }
        }
        res = (int)result;
	    return res * sign;
    }
	public static void main(String[] args) {
		String str = "-2147483647";
		System.out.println(atoi(str));
	}

}
