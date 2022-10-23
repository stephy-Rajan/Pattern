package ineuron;

public class PatternIneuron {
public static void main(String[] args){ 
// TODO Auto-generated method stub
		
		int n =8;
		int len = "INEURON".length();
 for (int i=0; i<n; i++) {
   for (int j=0; j<n*len;j+=8) {
	 if(j>=n*0 && j<n*1)	
	  printI(n,i);
	  System.out.print(" ");
	 
	  if(j>=n*1 && j<n*2)	
	  printN(n,i);
	  System.out.print(" ");
	  
	  if(j>=n*2 && j<n*3)	
		  printE(n,i);
		  System.out.print(" ");
		  
		  if(j>=n*3 && j<n*4)	
			  printU(n,i);
			  System.out.print(" ");
			  
			  if(j>=n*4 && j<n*5)	
				  printR(n,i);
				  System.out.print(" ");
				  
				  if(j>=n*5 && j<n*6)	
					  printO(n,i);
					  System.out.print(" ");
					  
					  if(j>=n*6 && j<n*7)	
						  printN(n,i);
						 System.out.print(" ");
   }
   System.out.println();
 } 
}
public static void printI(int n,int i){
	 for(int j=0;j<n;j++)
	 {
		 if(i==0&&j<=n-1||j==(n-1)/2&&j<=n/2||i==n-1)
		 {
			 System.out.print("*");
		 }
		 else 
		 {
			 System.out.print(" ");
		 }
	}
}
public static void printN(int n,int i){
  for(int j=0;j<n;j++)
	 {
		 if(j==0||i==j||j==n-1)
		 {
			 System.out.print("*");
		 }
		 else 
		 {
			 System.out.print(" ");
		 }
	 }
}

public static void printE(int n,int i) 
{
	 for(int j=0;j<n;j++)
	 {
		 if(j==0&&i<=n-1||i==0&&j<=n-1/2||i==n/2&&j<=n-1/2||i==n-1&&j<=n-1/2)
		 {
			 System.out.print("*");
		 }
		 else 
		 {
			 System.out.print(" ");
		 }
	 }
}
 public static void printU(int n,int i)
 {
	 for(int j=0;j<n;j++) {
		  if(j==0&&i<n-1||j==n-1&&i<n-1||i==n-1&&j>0&&j<n-1)
		 {
			 System.out.print("*");
		 }
		 else 
		 {
			 System.out.print(" ");
		 }
	 }
 }
 public static void printR(int n,int i)
 {
  for(int j=0;j<n;j++)
		 {
			 if(j==0&&i>=0||i==n/2&&j>=0||i==0&&j>=0||j==n-1&&i<=n/2||i>n/2&&i==j)
			 {
				 System.out.print("*");
			 }
			 else 
			 {
				 System.out.print(" ");
			 }
		 }
 }
	 public static void printO(int n,int i)
	 {
		 for(int j=0;j<n;j++) {
			if(j==0&&i>0&&i<n-1||i==0&&j>0&&j<n-2||j==n-2&&i>0&&i<n-1||i==n-1&&j>0&&j<n-2){
			 System.out.print("*"); 
			 }
			 else {
				 System.out.print(" ");
			 }
		 }  
	 
	 }
}




