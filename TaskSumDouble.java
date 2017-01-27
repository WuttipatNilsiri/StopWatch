
public class TaskSumDouble  implements Runnable{
	double limit;
	public TaskSumDouble(double limit){
		this.limit = limit;
	}

	public void run(){
		sumDoubleObj(limit,createDoubleArray(500000));
	}
	public Double[] createDoubleArray(int ARRAY_SIZE){
		Double[] values = new Double[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++){
			values[i] = new Double(i+1);
		}
		return values;
	}
	public Double sumDoubleObj(double limit,Double[] values){
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for(int count=0, i=0; count<limit; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i]; //***//
		}
		return sum;
	}
	public String toString(){
		return "sum 1 to " +(int) limit + " Obj";
	}
	
}
