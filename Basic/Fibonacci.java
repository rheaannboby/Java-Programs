import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the limit: ");
		int lim = sc.nextInt();
		int fib0 = 0, fib1 = 1;
		int fibcurr = fib0 + fib1;
		System.out.print("The fibonacci series till "+lim+" is :\n"+fib0+" "+fib1+" ");
		for(;fibcurr <= lim;) {
			System.out.print(fibcurr+" ");
			fib0 = fib1;
			fib1 = fibcurr;
			fibcurr = fib0 + fib1;
		}

	}

}

