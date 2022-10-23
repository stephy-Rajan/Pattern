package ineuron;

public class Pattern3 {

	public static void main(String[] args) {
		int i,j;
		int r=14;
		int c=14;
		for(i=0;i<r;i++){	
		   for(j=0;j<c;j++) {
			   if(i==0||j==0||i+j<=6||j-i>=6||j==c-1||i==r-1) {
					System.out.print("*");
			   }else {
					System.out.print(" ");
			   }
		   }
		 System.out.print("\n");
		}
			
		System.out.println();
		// TODO Auto-generated method stub

	}

}
