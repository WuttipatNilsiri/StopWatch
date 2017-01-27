
public class TaskAppendToString implements Runnable{
	final char CHAR = 'a';
	int limit;
	public TaskAppendToString(int limit){
		this.limit = limit;
	}
	public void run(){
		appendToString(limit);
	}
	public String appendToString(int limit){
		String result = ""; 
		int k = 0;
		while(k++ < limit) {
			result = result + CHAR;
		}
		return 	result;
	}
	public String toString(){
		return "append "+limit+" char to String"; 
	}
}
