
public class TaskAppendToStringBuilder implements Runnable{
	final char CHAR = 'a';
	int limit;
	public TaskAppendToStringBuilder(int limit){
		this.limit = limit;
	}
	public void run(){
		appendToStringBuilder(limit);
	}
	public StringBuilder appendToStringBuilder(int limit){
		StringBuilder builder = new StringBuilder(); 
		int k = 0;
		while(k++ < limit) {
			builder = builder.append(CHAR);
		}
		return builder;
		
	}
	public String toString(){
		return "append "+limit+" char to StringBuilder"; 
	}
}
