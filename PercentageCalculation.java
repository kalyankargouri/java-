import java.util.Scanner;
public class PercentageCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st marks:");
		int a=sc.nextInt();
		System.out.println("enter 1st marks:");
		int b=sc.nextInt();
		System.out.println("enter 1st marks:");
		int c=sc.nextInt();
		System.out.println("enter 1st marks:");
		int d=sc.nextInt();
		System.out.println("enter 1st marks:");
		int e=sc.nextInt();
		int sum=a+b+c+d+e;
		System.out.println(sum);
		double percentage=(sum /500.0)*100;
		System.out.println(percentage);
		
		}

	}


