  import java.util.*;
  class Square{
	  int side;

	public int Area() {
		return side*side;
	}
	  public int perimeter() {
		  return 4*side; 
	  }
  }
public class CalucatingArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1=new Square();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side:");
		s1.side=sc.nextInt();
		System.out.println(s1.Area());
		System.out.println(	s1.perimeter( ));
		

	}

}
