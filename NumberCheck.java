import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr first number:");
//		int a=sc.nextInt();
		Scanner scanner;
		if(sc.hasNextInt()) {
			int number=sc.nextInt();
			System.out.println("no. is integer"+number);
		}
		else {
			System.out.println("no.is not integer");
		}
		sc.close();

	}

}
