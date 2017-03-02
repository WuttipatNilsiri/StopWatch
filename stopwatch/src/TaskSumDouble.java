
public class TaskSumDouble  implements Runnable{
	double limit;
	Double[] doubleArray;
	/**
	 * initial task 
	 * @param limit is maximum Double to sum 
	 */
	public TaskSumDouble(double limit){
		this.limit = limit;
		this.doubleArray = createDoubleArray(500000);
		
	}

	public void run(){
		sumDoubleObj(limit,doubleArray);
	}
	/**
	 *  create Double Array by set the size
	 * @param ARRAY_SIZE 
	 * @return Double Array that made
	 */
	public Double[] createDoubleArray(int ARRAY_SIZE){
		Double[] values = new Double[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++){
			values[i] = new Double(i+1);
		}
		return values;
	}
	/**
	 * sum BigDecimal by use limit and double Array
	 * @param limit is maximum Double to sum
	 * @param values double Array
	 * @return sum result
	 */
	public Double sumDoubleObj(double limit,Double[] values){
		Double sum = new Double(0.0);
		
		for(int count=0, i=0; count<limit; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i]; //***//
		}
		return sum;
	}
	/**
	 * convert to string
	 */
	public String toString(){
		return "sum 1 to " +(int) limit + " Obj";
	}
	
}
