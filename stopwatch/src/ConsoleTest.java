
public class ConsoleTest {
	public static void main(String[]args){
		Watch w = new Watch();
		w.start();
		sumNumber(100000000.0);
		w.end();
		double dur = w.getElapsed();

		System.out.printf("sum number 1 to 10000000 use " + dur + " sec" );
	}
	public static double sumNumber(double number){
		double sum = 0;
		for(int i = 1 ; i <= (int) number ; i++){
			sum = sum + i;
		}
		return sum;
	}

}

