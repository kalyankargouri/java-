import java.util.*;
public class StudentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of subject:");
		int size=sc.nextInt();
		int []marks= new int[size];
		String[]Subject=new String[size];
		int total=0;

		for(int i=0;i<size;i++) {
			System.out.print("Enter the subject :");
			Subject[i]=sc.next();
			System.out.print("Enter the  marks:");
			marks[i]=sc.nextInt();
			
			 total=total+marks[i];
			 
		}
		double percentage=total/size;
		System.out.println("total marks is:"+total);
		
		System.out.println("percentage is:"+percentage);
		if(percentage>=90) {
			System.out.println("Grade:A+");
			
		}
		else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }
		
		

	}

}
