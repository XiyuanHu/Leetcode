package string;

public class AddBinary {

	public String addBinary(String a, String b) {
        if(a == "" || b == ""){
            return a == "" ?b:a;
        }
        String result = "";
        int indexA, indexB, carrier;
        indexA = a.length()-1;
        indexB = b.length()-1;
        carrier = 0;
        while( indexA >= 0 && indexB >= 0){
            if(a.charAt(indexA) == '0' && b.charAt(indexB) == '0'){
                result = carrier + result;
                carrier = 0;
                indexA--;
                indexB--;
                if(indexA == -1 || indexB == -1) break;
            }else if((a.charAt(indexA) == '0' && b.charAt(indexB) == '1')
                   ||(a.charAt(indexA) == '1' && b.charAt(indexB) == '0')){
                if(carrier == 0){
                    result = "1" + result;
                }else{
                    result = "0" + result;
                    carrier = 1;
                }
                indexA--;
                indexB--;
                if(indexA == -1 || indexB == -1) break;
            }else if(a.charAt(indexA) == '1' && b.charAt(indexB) == '1'){
                if(carrier == 0){
                    result = "0" + result;
                    carrier = 1;
                }else{
                    result = "1" + result;
                    carrier = 1;
                }
                indexA--;
                indexB--;
                if(indexA == -1 || indexB == -1) break;
            }
        }
        while(indexA < 0 && indexB >= 0){
            if(carrier == 0){
                result = b.charAt(indexB--) + result;
            }else{
                if(b.charAt(indexB--) == '0'){
                    result = "1" + result;
                    carrier = 0;
                }else{
                    result = "0" + result;
                    carrier = 1;
                }
            }
        }
        while(indexA >= 0 && indexB < 0){
            if(carrier == 0){
                result = a.charAt(indexA--) + result;
            }else{
                if(a.charAt(indexA--) == '0'){
                    result = "1" + result;
                    carrier = 0;
                }else{
                    result = "0" + result;
                    carrier = 1;
                }
            }
        }
        if(carrier == 0){
            return result;
        }else{
            return carrier + result;
        }   
    }
}
