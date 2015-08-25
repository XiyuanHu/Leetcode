package other;

public class ReverseInteger {

	public int reverse(int x) {
        int result = 0;
        int abs = Math.abs(x);
        while(abs > 0){
            result = result*10 + abs%10;
            abs = abs/10;
        }
        if(x < 0) return 0 - result;
        else return result;
    }
} 
