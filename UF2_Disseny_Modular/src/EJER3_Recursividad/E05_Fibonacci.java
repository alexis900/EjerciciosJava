package EJER3_Recursividad;

public class E05_Fibonacci {

	public static void main(String[] args) {
		int num = 55;
		double t1 = System.currentTimeMillis();
		System.out.println(fibonacciIt(num));
        double t2 = System.currentTimeMillis();
        System.out.println("Tiempo : " + (t2-t1)/(1000*60*60) + " minutos");
        t1 = System.currentTimeMillis();
		System.out.println(fibonacciRec(num));
        t2 = System.currentTimeMillis();
        System.out.println("Tiempo : " + (t2-t1)/(1000*60*60) + " minutos");
	}
	

	static long fibonacciIt(long n) {
		long fib[] = {1, 1};
		long f = 1;
		for(int i = 3;i <= n;i++) {
			f = fib[1] + fib[0];
			fib[1] = fib[0] + fib[1];
			fib[0] = fib[1] - fib[0];
		}
		
		return f;
	}
	
	static long fibonacciRec(long n) {
		if (n==0) return 0;
		else if (n==1 || n==2) return 1;
		else return fibonacciRec(n-1)+fibonacciRec(n-2);
	}
}
