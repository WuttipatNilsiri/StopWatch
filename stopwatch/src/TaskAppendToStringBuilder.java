
public class TaskAppendToStringBuilder implements Runnable{
	final char CHAR = 'a';
	int limit;
	/**
	 * initial Task by set limit
	 * @param limit
	 */
	public TaskAppendToStringBuilder(int limit){
		this.limit = limit;
	}
	
	public void run(){
		appendToStringBuilder(limit);
	}
	/**
	 * append char to stringbuilder by use limit 
	 * @param limit of char that want to append
	 * @return result that is string which appended char
	 */
	public StringBuilder appendToStringBuilder(int limit){
		StringBuilder builder = new StringBuilder(); 
		int k = 0;
		while(k++ < limit) {
			builder = builder.append(CHAR);
		}
		return builder;
		
	}
	/**
	 * convert to string
	 */
	public String toString(){
		return "append "+limit+" char to StringBuilder"; 
	}
}
