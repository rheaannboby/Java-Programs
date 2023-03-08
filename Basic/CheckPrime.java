import java.util.*;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				System.out.println(num+" is not a prime number.");
				System.exit(0);
			}
		}
		System.out.println(num+" is a prime number.");

	}

}
