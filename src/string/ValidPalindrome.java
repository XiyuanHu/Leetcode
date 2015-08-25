package string;
/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

  For example,
  "A man, a plan, a canal: Panama" is a palindrome.
  "race a car" is not a palindrome.

  Note:
  Have you consider that the string might be empty? This is a good question to ask during an interview.

  For the purpose of this problem, we define empty string as valid palindrome.*/

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        if(s == null || s.length() == 1){
            return true;
        }else{
            s = s.replaceAll("\\W+","");
            for(int i = 0, j = s.length()-1; i < s.length()& j >=0;i++,j--){
                if(!s.substring(i,i+1).equalsIgnoreCase(s.substring(j,j+1))){
                    return false;
                }
            }
            return true; 
        }  
    }
	/*
	 * . (点)任何字符
	\d	数字：[0-9]
	\D	非数字： [^0-9]
	\s	空白字符：[ \t\n\x0B\f\r]
	\S	非空白字符：[^\s]
	\w	单词字符：[a-zA-Z_0-9]
	\W	非单词字符：[^\w]
 
	Greedy 数量词
	X?	X，一次或一次也没有
	X*	X，零次或多次
	X+	X，一次或多次
	X{n}	X，恰好 n 次
	X{n,}	X，至少 n 次
	X{n,m}	X，至少 n 次，但是不超过 m 次
*/

}
