package other;

public class AveragePrecision {

	public static void main(String[] args) {
		/*int listABest[] = {1,0,0,0,1,0,1,0,1,0,1,1,1,1,0,0,0,0,0,0};
		int listAWorst[] = {1,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,1,1,1,1};
		int listBBest[] = {1,1,1,1,0,0,1,0,0,1,1,1,0,0,0,0,0,0,0,0};
		int listBWorst[] = {1,1,1,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,1};
		
		averagePrecision(listABest);
		averagePrecision(listAWorst);
		averagePrecision(listBBest);
		averagePrecision(listBWorst);*/ 
		
		int listABest[] = {5,1,0,1,10,0,7,0,7,1,5,5,5,5,1,0,0,0,0,0};
		int listAWorst[] = {5,1,0,1,10,0,7,0,7,1,0,0,0,0,0,1,5,5,5,5};
		int listBBest[] = {5,7,10,5,0,0,5,1,1,7,5,5,1,1,0,0,0,0,0,0};
		int listBWorst[] = {5,7,10,5,0,0,5,1,1,7,0,0,0,0,0,0,1,1,5,5};
		DCG(listABest);
		DCG(listAWorst);
		DCG(listBBest);
		DCG(listBWorst);
		
	}
	
	public static double DCG(int[] list){
		double result = 0.0;
		int i = 1;
		double DCG = 0.0;
		double []ss = new double[20];
		while((i <= list.length)){
			if(list[i-1] >= 0){
				ss[i-1] = list[i-1];
				DCG += ss[i-1] /((Math.log(i+1))/(Math.log(2)));
			}
			i++;
		}
		result = DCG;
		System.out.println("DCG:" + DCG);
		return result;
	}
	
	public static double averagePrecision(int[] list){
		double result = 0.0;
		int i = 1;
		double RR = 0;
		double AP = 0.0;
		while(i <= list.length){
			if(list[i-1] == 1){
				RR++;
				AP = AP + RR/i;
			}
			i++;
		}
		System.out.println("RR:" + RR);
		System.out.println("AP:" + AP);
		result = (double)AP/RR;
		System.out.println("result:"+result);
		return result;
	}

}
