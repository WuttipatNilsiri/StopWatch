
public class TaskSumNumber implements Runnable{
	int limit;
	/**
	 * initial task 
	 * @param limit maximum double that want to sum
	 */
	public TaskSumNumber(int limit){
		this.limit = limit;
	}
	public void run(){
		sumNumber(limit);
	}
	/**
	 * convert to string
	 */
	public String toString(){
		return "sum 1 to "+limit +" normally";
		
	}
	/**
	 * sum number
	 * @param number double limit to sum
	 * @return sum result
	 */
	public static double sumNumber(double number){
		double sum = 0;
		for(int i = 1 ; i <= (int) number ; i++){
			sum = sum + i;
		}
		return sum;
	}

}
