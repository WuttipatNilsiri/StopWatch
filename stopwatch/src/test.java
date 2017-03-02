
public class test {
	public static void main(String[]args){
		Stopwatch a = new Stopwatch();
		a.start();
		System.out.println(a.getElapsed());
		a.stop();
		System.out.println(a.getElapsed());
	}

}
