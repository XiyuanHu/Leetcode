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
	 * . (��)�κ��ַ�
	\d	���֣�[0-9]
	\D	�����֣� [^0-9]
	\s	�հ��ַ���[ \t\n\x0B\f\r]
	\S	�ǿհ��ַ���[^\s]
	\w	�����ַ���[a-zA-Z_0-9]
	\W	�ǵ����ַ���[^\w]
 
	Greedy ������
	X?	X��һ�λ�һ��Ҳû��
	X*	X����λ���
	X+	X��һ�λ���
	X{n}	X��ǡ�� n ��
	X{n,}	X������ n ��
	X{n,m}	X������ n �Σ����ǲ����� m ��
*/

}
