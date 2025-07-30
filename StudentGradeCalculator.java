import java.util.Scanner;

public class StudentGradeCalculator {



	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numbers of subject:");
		 int n=sc.nextInt();
		 int []marks=new int[n];
		 
		  for(int i=0;i<n;i++) {
			  System.out.println("enter marks for subject:"+(i+1));
			  marks[i]=sc.nextInt();
			  
		  }
		 
	}

}
