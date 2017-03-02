import java.math.BigDecimal;

public class main {
	public static void main(String[]args){
		int ARRAY_SIZE = 500000;
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) {
			values[i] = new BigDecimal(i+1);
		}
//		timer.measureprt(new TaskAppendToStringBuilder(100000));
//		timer.measureprt(new TaskAppendToString(100000));
//		timer.measureprt(new TaskAppendToString(50000));
////		timer.measureprt(new TaskSumBigDecimal(1000000000));
//		timer.measureprt(new TaskSumDouble(1000000000));
//		timer.measureprt(new TaskSumNumber(1000000000));
		timer.measureprt(new Taskfibo(50));
	}
//step 4 it like 
//	Runnable[] tasks = { task1 , task2, ...}
//	for(int i = 0 ; i < tasks.lenght() ; i++){
//		timer.measureprt(tasks);
//	}
}
