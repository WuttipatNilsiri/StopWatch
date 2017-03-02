
public class TaskAppendToString implements Runnable{
	final char CHAR = 'a';
	int limit;
	/**
	 * initial Task by set limit
	 * @param limit
	 */
	public TaskAppendToString(int limit){
		this.limit = limit;
	}
	
	public void run(){
		appendToString(limit);
	}
	/**
	 * append char to string by use limit 
	 * @param limit of char that want to append
	 * @return result that is string which appended char
	 */
	public String appendToString(int limit){
		String result = ""; 
		int k = 0;
		while(k++ < limit) {
			result = result + CHAR;
		}
		return 	result;
	}
	/**
	 * convert to string
	 */
	public String toString(){
		return "append "+limit+" char to String"; 
	}
}
