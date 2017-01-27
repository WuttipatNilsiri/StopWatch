
public class TaskSumNumber implements Runnable{
	int limit;
	public TaskSumNumber(int limit){
		this.limit = limit;
	}
	public void run(){
		sumNumber(limit);
	}
	public String toString(){
		return "sum 1 to "+limit +" normally";
		
	}
	public static double sumNumber(double number){
		double sum = 0;
		for(int i = 1 ; i <= (int) number ; i++){
			sum = sum + i;
		}
		return sum;
	}

}
