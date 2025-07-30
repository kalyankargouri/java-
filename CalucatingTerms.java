  import java.util.*;
  class CalucatingTerms1 {
	  int side;
	  int length;
	  int width;

	public int Area() {
		return side*side;
	}
	  public int perimeter() {
		  return 4*side; 
	  }
	  public int Rectangle() {
		return length*width;
		  
	  }
  }
public class CalucatingTerms
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalucatingTerms1 c1=new CalucatingTerms1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side:");
		c1.side=sc.nextInt();
		System.out.println("enter length and width:");
		c1.length=sc.nextInt();
		c1.width=sc.nextInt();
		
		System.out.println("area:"+c1.Area());
		System.out.println(	"perimeter:"+c1.perimeter( ));
		System.out.println("rectangle:"+c1.Rectangle());
		

	}

	
}
