package string;

import java.util.Vector;

public class ValidParentheses {

	public boolean isValid(String s) {
        if(s == null) return true;
        Vector<Character> stack = new Vector<Character>();
        for(int i = 0; i < s.length(); i++){
            char sc = s.charAt(i);
            if(sc == '(' || sc == '{' || sc == '['){
                stack.add(sc);
            }else{
                if(stack.size() > 0){
                    char c = stack.lastElement();
                    if((c == '(' && sc == ')')
                     ||(c == '{' && sc == '}')
                     ||(c == '[' && sc == ']')){
                        stack.remove(stack.size()-1);
                    }else{
                        return false; 
                    }
                }else{
                    return false;
                } 
            }
        }
        if(stack.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}
