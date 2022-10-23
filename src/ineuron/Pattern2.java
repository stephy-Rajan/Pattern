package ineuron;

public class Pattern2 {

	public static void main(String[] args) {
		int i,j,r=14,c=14;
	

for(i=0;i<r;i++){	
   for(j=0;j<c;j++) {
	   if(i==0|| i==(r-1)||j<(c/2)-i || i>(r-1)/2 && j< i-((r/2)-2)  ){
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
