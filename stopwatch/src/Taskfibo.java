
public  class Taskfibo implements Runnable{
	int num;
	double sum;
	public Taskfibo(int num) {
		this.num = num;
		
	}
	public void run(){
		sumfibo(num);
	
	}public double calfibo(int n){
		double ans;
		if (n <= 0){
			 ans = 0;
		}else if(n == 1){
			 ans = 1;
		}else 
			 ans =  (calfibo(n - 1) + calfibo(n - 2));
		return ans;
	}public double sumfibo(int n){
		double sum = 0;
		int i = 0;
		while (i <= n){
			sum = sum + calfibo(i);
			i++;
		}
		return this.sum = sum;
	}public String toString(){
		return "sum fibo 0 to "+ num+ " = " +sum;
	}
}
