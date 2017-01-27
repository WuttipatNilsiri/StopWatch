
public class Stopwatch {
	/**
	 * 
	 */
	long startTime;
	static long endTime;
	Long a = null;
	public Stopwatch() {
		startTime = 0;
		endTime = 0;
	}
	public void start(){
		startTime = System.nanoTime();
		endTime = 0;
	}
	public void stop(){
		endTime = System.nanoTime();
	}
	/**
	 * 
	 * @return Elapsed time if watch is running it will use that current time to calculate
	 */
	public double getElapsed(){
		if(Stopwatch.isRunning()){
			return (System.nanoTime() - startTime)/(1000.0*1000.0*1000.0);
		}else
			return (endTime - startTime)/(1000.0*1000.0*1000.0);
		
		
	}
	/**
	 * 
	 * @return true or false that can tell isRunning by check endtime
	 */
	public static  boolean isRunning(){
		if (endTime == 0){
			return true;
		}else 
			return false;
	}
}
