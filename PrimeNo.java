import java.util.*;
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.:");
		int n=sc.nextInt();
		if(n==2) {
			System.out.println("n is prime no.");
		}
		else {
			boolean isPrime=true;
			for(int i=2;i<n-1;i++) {
				if(n%i==0) {
					isPrime=false;
				}
				if(isPrime==true) {
					System.out.println("n is prime no.");
				}
				else {
					System.out.println("n is not prime no.");
				}
			}
		}
	}

}
