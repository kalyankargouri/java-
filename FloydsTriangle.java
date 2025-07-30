
public class FloydsTriangle {
	public static void Half_pyramid(int n ) { 
		int counter=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(counter+" ");
			counter++;
		}
		System.out.println();
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Half_pyramid(5);
	}

}
