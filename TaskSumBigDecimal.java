import java.math.BigDecimal;

public class TaskSumBigDecimal  implements Runnable{
	double limit;
	public TaskSumBigDecimal(int limit){
		this.limit = limit;
	}
	public void run(){
		sumBigDecimal(limit,createBigDecimalArray(500000));
	}
	public BigDecimal[] createBigDecimalArray(int ARRAY_SIZE){
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) {
			values[i] = new BigDecimal(i+1);
		}
		return values;
	}
	public BigDecimal sumBigDecimal(double limit,BigDecimal[] values){
		BigDecimal sum = new BigDecimal(0.0);
		for(int count=0, i=0; count<limit; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] ); // ***
		}
		return sum;
	}
	public String toString(){
		return "sum 1 to " +(int) limit +" Bigdeci";
	}
}
