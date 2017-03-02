
public class Watch {
	long startTime;
	static long endTime;
	Long a = null;public Watch() {
		startTime = 0;
		endTime = 0;
	}
	public void start(){
		startTime = System.nanoTime();
		endTime = 0;
	}
	public void end(){
		endTime = System.nanoTime();
	}
	public double getElapsed(){
		if(Watch.isRunning()){
			return (System.nanoTime() - startTime)/(1000.0*1000.0*1000.0);
		}else
			return (endTime - startTime)/(1000.0*1000.0*1000.0);
		
		
	}
	public static  boolean isRunning(){
		if (endTime == 0){
			return true;
		}else 
			return false;
	}

}
