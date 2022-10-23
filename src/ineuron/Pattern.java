

package ineuron;
public class Pattern {	

	public static void main(String[] args) {
		int i,j,r=8,c=14;
		

	for(i=0;i<r;i++){	
	   for(j=0;j<c;j++) {
		   if(j<=i || j >=(c-1)-i) {
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
