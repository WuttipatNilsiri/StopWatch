import java.math.BigDecimal;

public class TaskSumBigDecimal  implements Runnable{
	 double limit;
	 BigDecimal[] BigDecimalArray;
	/**
	 * initial task 
	 * @param limit is maximum BigDecimal to sum 
	 */
	public TaskSumBigDecimal(int limit){
		this.limit = limit;
		this.BigDecimalArray = createBigDecimalArray(500000);
		
	}
	
	public void run(){
		sumBigDecimal(limit,BigDecimalArray);
	}
	/**
	 *  create BigDecimal Array by set the size
	 * @param ARRAY_SIZE 
	 * @return BigDecimal Array that made
	 */
	public static BigDecimal[] createBigDecimalArray(int ARRAY_SIZE){
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) {
			values[i] = new BigDecimal(i+1);
		}
		return values;
	}
	/**
	 * sum BigDecimal by use limit and BigDecimal Array
	 * @param limit is maximum BigDecimal to sum
	 * @param values BigDecimal Array
	 * @return sum result
	 */
	public static BigDecimal sumBigDecimal(double limit,BigDecimal[] values){
		BigDecimal sum = new BigDecimal(0.0);
		for(int count=0, i=0; count<limit; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] ); // ***
		}
		return sum;
	}
	/**
	 * convert to string
	 */
	public String toString(){
		return "sum 1 to " +(int) limit +" Bigdeci";
	}
}
