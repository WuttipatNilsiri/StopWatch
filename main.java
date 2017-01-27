
public class main {
	public static void main(String[]args){
		timer.measureprt(new TaskAppendToStringBuilder(100000));
		timer.measureprt(new TaskAppendToString(100000));
		timer.measureprt(new TaskAppendToString(50000));
		timer.measureprt(new TaskSumBigDecimal(1000000000));
		timer.measureprt(new TaskSumDouble(1000000000));
		timer.measureprt(new TaskSumNumber(1000000000));
	}
//step 4 it like 
//	Runnable[] tasks = { task1 , task2, ...}
//	for(int i = 0 ; i < tasks.lenght() ; i++){
//		timer.measureprt(tasks);
//	}
}
